package ThreadsExecutors;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample2 {
	String result;
	
	{ ExecutorService executorService = Executors.newFixedThreadPool(5);

        Callable<String> task1 = () -> {
            Thread.sleep(2000);
            return "Result of Task1 from a Callable!  This is from a Future!";
        };

        Callable<String> task2 = () -> {
            Thread.sleep(1000);
            return "Result of Task2 from a Callable!  This is from a Future!";
        };

        Callable<String> task3 = () -> {
            Thread.sleep(5000);
            return "Result of Task3 from a Callable!  This is from a Future!";
        };

        // Returns the result of the fastest callable. (Hence coming from the Future!)
        
		try {
			result = executorService.invokeAny(Arrays.asList(task1, task2, task3));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        System.out.println(result);

	executorService.shutdown();
    }
}
