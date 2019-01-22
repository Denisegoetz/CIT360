package goetz.test;

import java.util.ArrayList;
import java.util.Vector;

public class CreateVectorExample {
    public static void main(String[] args) {

    /* 
     * 	Create Vector array. Vectors are so similar to ArrayList, people wonder why we still use them. Vectors
     *  are from older versions of Java, even before they had Collections.  They adapted vector code to new structure.
     *  LinkedList uses references-pointers to know where the data is.  The data is in a chain-like formation
     *  with references pointing to previous and next values. Because it uses references, it is faster when
     *  inserting into the middle of it because it only has to update a previous and next pointer.  In ArrayList
     *  it uses indexes and all the indexes from the insertion point on would need to be updated.  That is why 
     *  ArrayList is Slower in this job.  BUT..searching is slower then ArrayList.
    */
	Vector<Integer> v = new Vector<Integer>();
	  v.add(1);
	  v.add(2);
	  v.add(3);
	  v.add(4);
	  v.add(5);
	  v.add(6);
	  v.add(7);
	  v.add(8);
	  
	  //capacity() method show you how much space is allocated to the array. Even if unused.
	
	  System.out.println(v.capacity());
	  
	  //Advanced for loop. Sweet. 
	  
	  for(int i:v) {
		  System.out.println(i);
	  }
		  
    }
}
