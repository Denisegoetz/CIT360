package goetz.test;

import java.util.PriorityQueue;

public class CreatePriorityQueueStringExample {
	public static void main(String[] args) {
        // Create a Priority Queue - its like a line at the gas station FIFO
		// The only problem is...it sorts the queue all by itself. 
        PriorityQueue<String> namePriorityQueue = new PriorityQueue<>();

        // Add items to a Priority Queue (ENQUEUE)
        namePriorityQueue.add("Lisa");
        namePriorityQueue.add("Robert");
        namePriorityQueue.add("John");
        namePriorityQueue.add("Chris");
        namePriorityQueue.add("Angelina");
        namePriorityQueue.add("Joe");

        // Remove items from the Priority Queue (DEQUEUE)
        while (!namePriorityQueue.isEmpty()) {
            System.out.println(namePriorityQueue.remove());
            
        System.out.println(namePriorityQueue.size());
        }

    }
}
