package goetz.test;

import java.util.Iterator;
import java.util.LinkedList;

public class CreateLinkedListExample {
	public static void main(String[] args) {
		
		/* Create a string LinkedList.  
		 * Add some records
		 */
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Denise");
		ll.add("Greg");
		ll.add("Emily");
		ll.add("Julia");
		ll.add("John");
		
		//print:
		System.out.println("Content of linkedlist: "+ ll);
		
		//addfirst:
		ll.addFirst("Fluffer");
		
		//addlast
		ll.addLast("Grey Van");
		
		//print:
		System.out.println("Content of linkedlist: "+ ll);
				
		//get:    *the first one starts a 0. (Strange linkedlists aren't by index.) 
		System.out.println(ll.get(0));
		
		//set: 
		ll.set(6, "Silver Car");
		System.out.println(ll.get(6));
		System.out.println("Content of linkedlist: "+ ll);
		
		//remove first and last elements:
		ll.removeFirst();
		ll.removeLast();
		
		//print:
		System.out.println("Content of linkedlist: "+ ll);
		
		//Remove second element
		ll.remove(1);
		
		System.out.println("Content of linkedlist: "+ ll);
		
		
		// Check if the LinkedList contains an element
        System.out.println("Does LinkedList contain \"Emily\"? : " + ll.contains("Emily"));

	
		//how to printout all the values in a LinkedList
		//for loop
		System.out.println("****** Using for loop:");
		for(int i=0; i<ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		
		//advanced for loop:
		System.out.println("****** Using advanced for loop:");		
		for(String str : ll) { 
			System.out.println(str);
		};
		
		//iterator
		System.out.println("****** Using iterator:");	
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		};
		
		//while loop:
		System.out.println("****** Using While loop:");
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		};
		
	}
}
