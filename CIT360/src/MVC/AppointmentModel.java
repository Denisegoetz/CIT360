package MVC;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class AppointmentModel {
	
 
	
// Create empty map object called userCityMapping
	Map<String, String> customerDogMapping = new HashMap<>();
	
// This method takes in two parameters dogName & customerName and stores it into HashMap dogName,CustomerName
// Currently this is called from the controller
    public void saveCustomerInfo(String dogName, String customerName) {
    // put elements into the HashMap - (Key, Value)
     customerDogMapping.put(dogName, customerName);
     
     for(Entry<String, String> m : customerDogMapping.entrySet()) { 
     	System.out.println(m.getKey() +"  "+ m.getValue() ); 
      };
    }

    public int createCustomerNumber() {
    	Random random = new Random();
    	int number = 0;
        number = random.nextInt(1000);
        System.out.println("Assigned Customer Number " +number);
        return number;
    }
  
    public void dumpHashMap() {
    	for(Entry<String, String> m : customerDogMapping.entrySet()) { 
         	System.out.println(m.getKey() +"  "+ m.getValue() ); 
         }
    }

}
