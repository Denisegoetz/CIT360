package goetz.test;

import java.util.*;

public class CreateQueueNumberExample {

	public static void main(String[] args) {
        // Create a normal Queue - its like a line at the gas station FIFO
		//  
        Queue<Integer> queue = new LinkedList<Integer>();

        // Add items to a  Queue (ENQUEUE). This is adding 10 numbers. 
        
           for(int i=10;i>0;i--) {
              queue.add(i);
              
           }
        // The Queue will look like...  (Front) 10 9 8 7 6 5 4 3 2 1  (End)
           
        // Peeking is obtaining the data value of the head of the queue
        // Polling is removing the head of the queue
           
        System.out.println("Size of Queue: "+queue.size()); //Checking size of queue, should be 10
        System.out.println("Head of Queue: "+queue.peek()); //should be head of Queue, which is 10
        
        queue.poll(); // Removing the head of the queue, which is 10 now
        System.out.println("Just polled the queue, which deletes first in line.");
        System.out.println("Size of Queue: "+queue.size()); //Checking size of queue, should be 9
        
        System.out.println("Head of Queue: "+queue.peek()); //should be head of Queue, which is now 9
        
       
    }
	
}

