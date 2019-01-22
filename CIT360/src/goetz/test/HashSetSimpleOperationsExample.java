package goetz.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetSimpleOperationsExample {

    public static void main(String[] args) {
    	// HashSet doesn't remember any order.
    	// The data, potentially, could be retrieved in a different order every time.
    	// LinkedHashSet remembers the order you added the data in.
    	// TreeSet sorts in natural order, being alphabetical and numerical.
    	
     //   Set<String> popularCities = new HashSet<>();
     //   Set<String> popularCities = new LinkedHashSet<>();
        Set<String> popularCities = new TreeSet<String>();
        
        // Check if a HashSet is empty
        System.out.println("Is popularCities set empty? : " + popularCities.isEmpty());

        // Add values to set
        popularCities.add("London");
        popularCities.add("New York");
        popularCities.add("Paris");
        popularCities.add("Dubai");
        popularCities.add("Los Angeles");
        popularCities.add("Orlando");
        
        System.out.println(popularCities.hashCode());
        System.out.println(popularCities);
        
        // Sets can't have duplicate elements, even if you try!
        
        popularCities.add("Paris");
        popularCities.add("Paris");
        popularCities.add("Paris");

        System.out.println(popularCities);
        
        // Find the size of a HashSet
        System.out.println("Number of cities in the HashSet " + popularCities.size());
        
        // As you can see in output - it won't add Paris more than once. Even the count is just 6.

        // Check if the HashSet contains an element
        String cityName = "Paris";
        if(popularCities.contains(cityName)) {
            System.out.println(cityName + " is in the popular cities set.");
        } else {
            System.out.println(cityName + " is not in the popular cities set.");
        }
        
		//how to printout all the values in a HashSet
		//advanced for loop:
		System.out.println("****** Using advanced for loop:");		
		for(String str : popularCities) { 
			System.out.println(str);
		};
        
    }	
    
}
