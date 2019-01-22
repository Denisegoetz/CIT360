package goetz.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class CreateHashSetFromCollectionExample {
	 public static void main(String[] args) {
	        List<Integer> numbersDivisibleBy5 = new ArrayList<>();
	        numbersDivisibleBy5.add(5);
	        numbersDivisibleBy5.add(10);
	        numbersDivisibleBy5.add(15);
	        numbersDivisibleBy5.add(20);
	        numbersDivisibleBy5.add(25);

	        List<Integer> numbersDivisibleBy3 = new ArrayList<>();
	        numbersDivisibleBy3.add(3);
	        numbersDivisibleBy3.add(6);
	        numbersDivisibleBy3.add(9);
	        numbersDivisibleBy3.add(12);
	        numbersDivisibleBy3.add(15);

	        // Creating a HashSet from another collection (ArrayList)
	        // Try using LinkedHashSet or TreeSet. It's fun to see the difference
	        Set<Integer> numbersDivisibleBy5Or3 = new HashSet<>(numbersDivisibleBy5);

	        // Adding all the elements from an existing collection to a HashSet
	        //
	        // Option:You could use retainAll which will only put in set the things that both sets have in common.
	        // In this case you would only have 15 in common. 
	       // numbersDivisibleBy5Or3.retainAll(numbersDivisibleBy3);
	        numbersDivisibleBy5Or3.addAll(numbersDivisibleBy3);
	        
	        System.out.println(numbersDivisibleBy5Or3);
	    }
    
}
