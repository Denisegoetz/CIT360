package ThreadsExecutors;

import java.util.concurrent.atomic.AtomicInteger;


public	class DoTask implements Runnable {
		private AtomicInteger count = new AtomicInteger(10);
		private int   id  = new AtomicInteger(0).hashCode();
		
		@Override
		public void run() {
	    	
	    	for (int i=10; i>0; i--) {
	 
	    		System.out.println("<" + id + "> doing work for you.." + count.getAndDecrement());
	    		
	    		try {
//					Thread.sleep(500);	    			
// I changed this to use a random number generator for sleep. 
// You have to cast it to a long because Math.random uses a Double.
					Thread.sleep((long)(Math.random() * 1000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    	}
	    }
	    
	}
