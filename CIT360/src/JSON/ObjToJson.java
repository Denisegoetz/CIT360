package JSON;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class ObjToJson {

	public static void main(String[] args) {
		
		//*************************************************************************************//
		// Using the Jackson Jar files to map my Java (object) output to a JSON file.
		// This is how I am creating it. I create a reference of Customer Class and it runs the 
		// createCustomer method. 
		//*************************************************************************************//
		// create mapper - from Jackson
		
		ObjectMapper mapper = new ObjectMapper();
		
		Customer myCustomer = createCustomer();
		
		//************************************************************************
		//Now write it to a file called customer.json. (Serialization HERE) 
		//       CREATE  FILE HERE    
		//************************************************************************
		try {
			mapper.writeValue(new File("customer.json"), myCustomer);
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        //*************************************************************************************************
		// I like to see the jsonString inside my output console. So here is that. Using "Pretty Printer"
		//*************************************************************************************************
		try {
			String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(myCustomer);
			System.out.println(jsonString);
			
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	//******************************************************************************************************************//
	// Deserialization HERE 
    // Read in a Json STRING using Jackson it will map the Json string to your class. This one was to Customer class.
	//******************************************************************************************************************//
	
		String jsonString2 ="{\"id\":1,\"firstname\":\"Susan\",\"lastname\":\"Whitmore\",\"addressObject\":{\"streetAddress\":\"1234 Applecrest\",\"city\":\"Bloomfield\",\"state\":\"MI\",\"postalCode\":\"48130\"},\"phonenumber\":\"248-333-4444\"}";
		try {
			Customer myCustomer2 = mapper.readValue(jsonString2,Customer.class);
			System.out.println("Customer Name: " + myCustomer2.getFirstname() + " " + myCustomer2.getLastname()+ ", " + "Phone number: " + myCustomer2.getPhonenumber());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 //******************************************************************************************************************//
	 // MORE - Deserialization HERE 
	 // Read in a Json FILE using Jackson it will map the Json file to your class. This one was to Customer class.
	 //******************************************************************************************************************//		
		
		try {
			Customer myCustomer2 = mapper.readValue(new File ("customerReadIn.json"), Customer.class);
			System.out.println("Customer Name: " + myCustomer2.getFirstname() + " " + myCustomer2.getLastname()+ ", " + "Phone number: " + myCustomer2.getPhonenumber());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static Customer createCustomer() {
		
        Customer myCustomer = new Customer();
        myCustomer.setId(1);
        myCustomer.setFirstname("Susan");
        myCustomer.setLastname("Whitmore");
        myCustomer.setPhonenumber("248-333-4444");
 
        Address address = new Address();
        address.setStreetAddress("1234 Applecrest");
        address.setCity("Bloomfield");
        address.setState("MI");
        address.setPostalCode("48130");
        
		myCustomer.setAddressObject(address);    
		
		return myCustomer;
		
	}
	
}
