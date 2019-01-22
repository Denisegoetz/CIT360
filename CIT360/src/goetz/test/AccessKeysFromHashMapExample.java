package goetz.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AccessKeysFromHashMapExample {
	
	 public static <K, V> void main(String[] args) {
		 
		   // Create empty map object called userCityMapping
	        Map<String, String> userCityMapping = new HashMap<>();
	        
	        // HashMap, HashTable and TreeMap must contain unique values only and part of Map Interface
	        // HashMap doesn't maintain any order of data coming in.  
	        // HashMap stores elements on key and value pair
	        // HashMap can have one Null key & many Null values
	        // HashMap Won’t give you an exception if you ask for a key it doesn’t have, just null
	        // HashMap is not Synchronized -- not Thread safe, you can use threads on this.
	        // Fail fast conditions can occur. Concurrent Modification exception can happen add/remove

	        // Check if a HashMap is empty
	        System.out.println("is userCityMapping empty? : " + userCityMapping.isEmpty());

	        // put elements into the HashMap - (Key, Value)
	        userCityMapping.put("John", "New York");
	        userCityMapping.put("Sudeep", "Delhi");
	        userCityMapping.put("Julia", "Rexburg");
	        userCityMapping.put("Steve", "London");
	        userCityMapping.put("Jimmy", "Athens");
	        userCityMapping.put("Emily", "Provo");

	        // Print out elements of HashMap
	        System.out.println("userCityMapping HashMap : " + userCityMapping);

	        // Find the size of a HashMap, this answers how many elements are in there
	        System.out.println("We have the city information of " + userCityMapping.size() + " users");

	        // Search for a certain key (Steve in this case)
	        String userName = "Steve";
	        // Check if a key exists in the HashMap
	        if(userCityMapping.containsKey(userName)) {
	            // Get the value assigned to a given key in the HashMap
	            String city = userCityMapping.get(userName);
	            System.out.println(userName + " lives in " + city);
	        } else {
	            System.out.println("City details not found for user " + userName);
	        }

	        // Check if a value exists in a HashMap
	        if(userCityMapping.containsValue("New York")) {
	            System.out.println("There is a user in the userCityMapping who lives in New York");
	        } else {
	            System.out.println("There is not user in the userCityMapping who lives in New York");
	        }


	        // Modify the value assigned to an existing key
	        userCityMapping.put(userName, "California");
	        System.out.println(userName + " moved to a new city " + userCityMapping.get(userName) + ", New userCityMapping : " + userCityMapping);

	        // The get() method returns `null` if the specified key was not found in the HashMap
	        System.out.println("Lisa's city : " + userCityMapping.get("Lisa"));
	        
	        
	        // Advanced For loop to print the values in HashMap
	        // entrySet() will have the complete set of elements in the HashMap. 
	        // The for loop will iterate over the set.  
	        //
	        System.out.println("***** Printing out the key & value for this HashMap");
	        
	        for(Entry<String, String> m : userCityMapping.entrySet()) { 
	        	System.out.println(m.getKey() +"  "+ m.getValue() ); 
	        }; 
	        
	        // Remove Sudeep from the HashMap
	        userCityMapping.remove("Sudeep");
	        
	        // print to show Sudeep is gone
	        
	        System.out.println("userCityMapping HashMap : " + userCityMapping);
	        
	        
	        //Creating a Hash Map from a Employee Class 
	        
	        HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
	        
	        Employee e1 = new Employee("Greg", 53, "Logistics");
	        Employee e2 = new Employee("Denise", 50, "IT");
	        Employee e3 = new Employee("Emily", 21, "Medical");
	        
	        //now put the employee data into the HashMap
	        emp.put(1, e1);
	        emp.put(2, e2);
	        emp.put(3, e3);
	        
	        //Traverse the HashMap
	        // entrySet() is an interface that is used to traverse a HashMap
	        
	        for(Entry<Integer, Employee> m : emp.entrySet()) {
	        	
	        	int key= m.getKey();
	        	Employee e = m.getValue();
	        	System.out.println(key + " Info");
	        	
	        	System.out.println(e.name + ", " + e.age + ", " + e.dept);
	        }
	        	
	            
    };        
}
