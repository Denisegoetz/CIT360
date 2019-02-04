package ACP;

import java.util.HashMap;
import java.util.Scanner;

public class HandleChoice implements Handler {

    public HandleChoice() {
    }

    @Override
    public void handleMenu(HashMap<String, Integer> info) {
        
        Scanner systemIn = new Scanner(System.in);
        String answer = "";
        while (!answer.equals("Y") && !answer.equals("N")) {
            System.out.println("\n\nEnter another scripture topic? Y/N");
            try {
            answer = systemIn.nextLine();
            answer = answer.trim().toUpperCase();
            } catch (Exception e) {
                System.out.println("Error. Enter Y/N");
            }    
        }
        //Create and instance of MenuHandler. Which creates a new HashMap. Passes Y or N
        MenuHandler menuHandler = new MenuHandler();
        menuHandler.searchMenuHandler(answer, info);
    }

    
}
