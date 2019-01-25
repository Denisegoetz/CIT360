package ThreadsExecutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample1 {
	// Learning lesson:  I tried to put a system.out.println in here with nothing else and it gave me errors.            //
	// Note: it's illegal to call Sysout straight from the body of a class.  You have to call it in a method or do this: //
	//    surround it with {}  like this....   {System.out.println("hi");}
	// Doing:   System.out.println("Hi");  wont work alone in the body of a class.    
	
	
	ExecutorService execService = Executors.newFixedThreadPool(3);
	
	{System.out.println("Executor is starting the pool of threads now...");
		
	 execService.execute(new DoTask());
	 execService.execute(new DoTask());
	 execService.execute(new DoTask());
	 
	 execService.shutdown();
	 
	 System.out.println("Executor is shutdown now...");
	 
	}

}