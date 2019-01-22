package goetz.test;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
    	
    	int staticArray[] = new int[3]; // This is a static array, which cannot grow with data growth
    	                                // The size is fixed. If you go past the array limit, 3, in 
    	                                // this case. The program will give you "array out of bound 
    	                                // exception". 
    	                                // Normally, this is not used in production.
    	                                // This is faster than using the collection but can't grow.
    	                                // If you use a static array, think about maintenance of program.
    	
    	/* Create new Arraylist   This is a dynamic array, which can grow and shrink with data.
    	 * called topCompanies    You can have specific data type in this collection or mixed.
    	 *                        Here it is specified as String, but if you didn't put that it
    	 *                        would take any data as input. That is generics verses non generics
    	 *                                List topCompanies = new ArrayList<>;
    	 *                        
    	 *                        1) ArrayList can contain duplicate values
    	 *                        2) The order the data is (added in or inserted), it maintains that
    	 *                        3) Not Synchronized  - as in threading
    	 *                        4) Allows random access to fetch an element because it stores the
    	 *                           values based on indexes. 
    	 */
        List<String> topCompanies = new ArrayList<>();

        // Check if an ArrayList is empty - Which is is going to be because it's new.
        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        // Find the size of an ArrayList
        System.out.println("Here are the top " + topCompanies.size() + " companies in the world");
        System.out.println(topCompanies);

        System.out.println("********************************** ");
        
        // Retrieve the element at a given index
        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);

        System.out.println("Best Company: " + bestCompany);
        System.out.println("Second Best Company: " + secondBestCompany);
        System.out.println("Last Company in the list: " + lastCompany);
  
        // Modify the element at a given index
        topCompanies.set(4, "Walmart");
        System.out.println("Modified top companies list: " + topCompanies);
  
    }
}
