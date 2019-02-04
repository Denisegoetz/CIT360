package ACP;

import java.util.HashMap;

public class Atonement implements Handler{

    public void atonement() {
    }
    @Override
    public void handleMenu(HashMap<String, Integer> info) {
     //*****************************************************************************//
     // This gets the scripture number the user selected from the hashMap.
     // Then it prints to the console the corresponding scripture.
     // Passes the HashMap with choice in it, which will cause it to go to HandleChoice via
     // MenuHandler and Handler.
     //*****************************************************************************//		 
        	Integer scriptNum = info.get("scriptN");
        	   System.out.println("\n This is an Atonement Scripture " + scriptNum);
        	                
        	        
        	if (scriptNum == 1) {
        	       System.out.println("\nAtonement Scripture # 1" 
        	      	  + "\n The Atonement ransoms men from the Fall and saves them"
        	      	  + "\n from death and hell, 2 Ne. 9:5–24.\n");
        	   } else if (scriptNum == 2)  {
        	       System.out.println("\nAtonement Scripture # 2"
        	    	  + "\n Through the Atonement of Christ, all mankind may be saved,"
        	    	  + "\n A of F 1:3.");
        	   } else if (scriptNum == 3) {
        	       System.out.println("\nAtonement Scripture # 3"
        	    	  + "\n Redemption comes to those who have a broken heart and "
        	    	  + "\n contrite spirit, 2 Ne. 2:3–10, 25–27.");
        	   } else if (scriptNum == 4) {
        	       System.out.println("\nAtonement Scripture # 4"
        	    	  + "\n His sweat was as it were great drops of blood, Luke 22:39–44.");
        	   } else {
        	       System.out.println("\nSorry only numbers 1 thru 4 provide scriptures." );	
        	   }
        MenuHandler menuHandler = new MenuHandler();
        menuHandler.searchMenuHandler("choice", info);
        
        }        
    }
