package AppController;

/**
*
* @author Caleb Cragun
* @description Example of the application controller pattern
* @notes In it's simplest terms, the application controller pattern
*        is when there is an application that talks to the controller. The
*        controller is responsible for getting and sending data back to the
*        application. The application just talks to the controller for
*        information that it needs.
*/
import java.util.HashMap;
import java.util.Scanner;

public class AppController {
   // Application
   public static void main(String[] args){
       // Creates a variable for the the user to use
       String prompt;
       
       // Populates the hashmap for use in the program later
       Controller.populateHashMap();
       
       // Creates the scanner for user input
       Scanner reader = new Scanner(System.in);
       
       // Starts the function and looks for the exit value
       do {
           // Prompts the user for input
           System.out.println("Would you like to [R]un the program or [Q]uit?");
           // Gets input from user
           prompt = reader.nextLine();
           /* 
            * Checks the value input by user. If it's the run command, then it
            * continues, if not then it displays an error message.
            */
           if (prompt.equalsIgnoreCase("r")){
               doLoop();
           } else if (prompt.equalsIgnoreCase("q")){
               System.out.println("Thank you for using this program.");
           } else {
               System.out.println("Invalid input please try again.");
           }
       } while (!prompt.equalsIgnoreCase("q"));
   }
   public static void doLoop(){
       // Creates variables for input
       int input1;
       int input2;
       
       // Creates the scanner for user input
       Scanner reader = new Scanner(System.in);
       
       // Gets the first number from the user
           do{
               System.out.print("Please enter a value between 1 and 5 :");
               input1 = reader.nextInt();
           } while (input1 < 1 || input1 > 5);
           // Gets the second number from the user
           do{
               System.out.print("Please enter another value between 1 and 5 :");
               input2 = reader.nextInt();
           } while (input2 < 1 || input2 > 5);
           // Calls the controller function
           Controller.controller(Integer.toString(input1), Integer.toString(input2));
   }
}

class Controller{
   // Hashmap for key/value pairs to use for 
   static HashMap commands = new HashMap();
   
   // Populates the hashmap with key/value pairs
   static void populateHashMap(){
       commands.put("1",1);
       commands.put("2",2);
       commands.put("3",3);
       commands.put("4",4);
       commands.put("5",5);        
   }
   
   // Controller for the application
   static void controller(String cmd1, String cmd2){
       int total = (int) commands.get(cmd2) - (int) commands.get(cmd1);
       System.out.println("The answer is : " + total);
   }
}