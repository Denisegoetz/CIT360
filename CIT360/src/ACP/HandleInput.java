package ACP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HandleInput implements Handler {
    //**********************************************************************************************//
	// Anything that needs to process that HashMap needs to Implement the Handler class. 
	// Because Handler is implemented it's all accessible to each other.  When you implement
	// an interface, it is mandatory that you include everything in it...inside the implementing 
	// class. 
	//**********************************************************************************************//
	
    public HandleInput() {
    }

    @Override
    public void handleMenu(HashMap<String, Integer> data) {
        BufferedReader systemIn = new BufferedReader(new InputStreamReader(System.in));
        String topic = "";
        int number = 0;
        System.out.println("\nEnter a scripture topic "
                                +"\nF - Faith"
                                +"\nT - Trials"
                                +"\nA - Atonment");
        
        while (!topic.equals("F") && !topic.equals("T") && !topic.equals("A")) {
            
            try {
                topic = systemIn.readLine();
                topic = topic.trim().toUpperCase();
                if (!topic.equals("F") && !topic.equals("T") && !topic.equals("A")) {
                    System.out.println("Error. Please enter F, T. or A");
                }
            } catch (Exception e) {
                System.out.println("Error. Please enter F, T, or A");
            }
        }
        System.out.println("Enter a number between 1 thru 4.");
        while (number <= 0) {
            try {
                number = Integer.parseInt(systemIn.readLine());
                if (number <= 0) {
                    System.out.println("Error. please enter a number.");
                }
            }
            catch (Exception e) {
                System.out.println("Error. Please enter a number");
            }
                
        }
        HashMap<String, Integer> info = new HashMap<>();
        // record users scripture number and it gets inserted into the hashMap
        info.put("scriptN", number);
        MenuHandler menuHandler = new MenuHandler();
        menuHandler.searchMenuHandler(topic, info);

    }
    
}

