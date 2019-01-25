package ThreadsExecutors;


public class TaskMaster {

		
	public static void main(String[] args) {
		// Objective: Run Threads and Executor from the main class

		
		System.out.println("Main thread assigned by java is beginning now....");
		
		//************************************//
	    // Example of Threads using extends   //
		//************************************//
//		new ThreadExtends();
		
		ThreadExtends thread1 = new ThreadExtends();
		thread1.start();
		System.out.println("First spawned Thread from extends....." + thread1);
		
		
		ThreadExtends thread2 = new ThreadExtends();
		thread2.start();
		System.out.println("Second spawned Thread from extends....." + thread2);
		
		
		//************************************//
		// Example of Threads using Runnable  //
		//************************************//
		
		//This right here is so cool. I'm running my DoTask and starting it up inside the Thread method.
		// Then, another DoTask is started by creating an object t and then running start on the t.
	    //   So COOL!  
//******************************************************************************************************				
//		new Thread(new DoTask()).start();   //not using this but I want to save it. Can't name thread w/ this.
			
		//***********************************************************************//		
		// This is just another way to call this. As long as you have the method //
		// DoTask instantiated in main, it can find it. Like this.               //
		//             DoTask runner = new DoTask();                             //
		//***********************************************************************//					
//		Thread t1 = new Thread(runner);
//		System.out.println("First spawned Thread from Runnable....." + t1);
//		t1.start();	
//*******************************************************************************************************
		Thread t1 = new Thread(new DoTask());
		System.out.println("First spawned Thread using Runnable....." + t1);
		t1.start();
			
		Thread t2 = new Thread(new DoTask());
		System.out.println("Second spawned Thread using Runnable ...." + t2);
		t2.start();

		//************************************//
	    // Example of Executor                //
		//************************************//
		
		System.out.println("Starting ExecutorService with a fixedThreadPool...");
		new ExecutorExample1();
		System.out.println("It Ended - ExecutorService with a fixedThreadPool...");
		
		System.out.println("Starting ExecutorService with a Callables using a fixedThreadPool...");
		new ExecutorExample2();
		System.out.println("It Ended - ExecutorService with a Callable using a fixedThreadPool...");
		
		
		System.out.println("Main thread assigned by java is ending now....");
				
	 }
}
