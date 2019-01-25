package ThreadsAndExecutors;


public class IncrementCounter {
		
     static class AtomicCounter {
	     
	     private AtomicCounter cnt  = new AtomicCounter();
	 
	      public int incrementAndGet() {
	        	int result = cnt.incrementAndGet();
	        	
	            return result;
	      }

	      public int getCount() {
	            return cnt.getCount();
	      }
	 }
     
}	
	
