package ThreadsAndExecutors;

import java.util.concurrent.atomic.AtomicInteger;

public class TaskMaster {
	
	private static IncrementCounter.AtomicCounter count;
	private static IncrementCounter.AtomicCounter ThreadId;
	
	
	public static void main(String[] args) {
		// Going to run Threads from the main class
		
		System.out.println("Main thread assigned by java is beginning now....");
		
		//This right here is so cool. I'm running my DoTask and starting it up inside the Thread method.
		// Then, another DoTask is started by creating an object t and then running start on the t.
		//   So COOL!
	
		//Instantiating count and ThreadId
		IncrementCounter.AtomicCounter atomic  = new IncrementCounter.AtomicCounter();
		count = atomic;
		System.out.println(count);
		
//		new Thread(new DoTask()).start();
		
		Thread t1 = new Thread(new DoTask());
		
		System.out.println("First spawned Thread ....." + t1);
		t1.start();
		
		atomic.incrementAndGet();
		System.out.println(count);
		
		Thread t2 = new Thread(new DoTask());
		System.out.println("Second spawned Thread ...." + t2);
		t2.start();
				
		System.out.println("Main thread assigned by java is ending now....");
	}

	
	public static IncrementCounter.AtomicCounter getCount(){
		return count;
	}
		
}


class DoTask implements Runnable {

	@Override
	public void run() {
    	
    	for (int i=10; i>0; i--) {
 
    		System.out.println("<" + "> doing work for you.." + TaskMaster.getCount());
    		
    		try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
    
    public DoTask(){   
    //	incrementId();
    //TaskMaster.();
    }
}
