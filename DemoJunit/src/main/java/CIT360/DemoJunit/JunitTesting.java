package CIT360.DemoJunit;

import java.util.HashMap;

public class JunitTesting {
		
//This is just a bunch of methods to demonstrate JUNIT.  You can either mess up the method, or the results 
//expected in the JUNIT tests to create errors.  All green is good, but it's fun to play, getting different results.
//
// The Goal is all Green though.  Having all your tests pass.  Unit testing before you build your Application
// helps you design for the expected results and work out bugs as you go, rather all in the end.
//	
	
	
//NOTE:  I did have to switch out a maven dependency to get the annotations to work (@TEST) 4.11 jar
	int number;
	
	public int DiscPrice (int p, int d){
        int discount;
		discount  = (p * d) / 100;   //correct calculation
//		discount  = p * d;           //incorrect calculation
		return discount;
	}
	
    public boolean isEvenNumber(int number){     //Is the number even or odd that you are feeding it
		boolean result = false;
		if(number%2 == 0){                       //num%2==0 Takes remainder could be 0 or 1. (0 means even)
			result = true;
		}
		return result;
	}
     
    public String getValue(final String key){ 
        HashMap<String, String> value = new HashMap<>();
        value.put("key1", "value 1");
        value.put("key2", "value 2");
        value.put("key3", "value 3");
        return value.get(key);
    }

    public static String[] stringArray() {
		String[] result = {"one", "two", "three"};
		return result;
	}
    
    
    public String getName(String name) 
    {
        return name;
    }

      
    public static int fact(int n)
    {
        if (n == 0)
        {   return 1;     
        }
        else
        {   return n * fact(n - 1); 
        }
    }
    
}
