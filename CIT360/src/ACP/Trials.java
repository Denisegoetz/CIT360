package ACP;

import java.util.HashMap;

public class Trials implements Handler{

    public void trials() {
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
        	   System.out.println("\n This is a Trial Scripture " + scriptNum);
        	                
        	        
        	if (scriptNum == 1) {
        	       System.out.println("\nTrial Scripture # 1" 
        	      	  + "\n Put their trust in God shall be supported in"
        	      	  + "\n their trials, Alma 36:3");     	       
        	   } else if (scriptNum == 2)  {
        	       System.out.println("\nTrial Scripture # 2"
        	    	  + "\n Receive no witness until after the trial"
        	    	  + "\n of your faith, Ether 12:6.");
        	   } else if (scriptNum == 3) {
        	       System.out.println("\nTrial Scripture # 3"
        	    	  + "\n And he beheld Satan; and he had a great chain in his hand,"
        	    	  + "\n and it veiled the whole face of the earth with darkness; "
        	    	  + "\n and he looked up and laughed, and his angels rejoiced” (Moses 7:26).");
        	   } else if (scriptNum == 4) {
        	       System.out.println("\nTrial Scripture # 4"
        	    	  + "\n And he shall go forth, suffering pains and afflictions and"
        	    	  + "\n temptations of every kind; and this that the word might be "
        	    	  + "\n fulfilled which saith he will take upon him the pains and the"
        	    	  + "\n sicknesses of his people. Alma 42:8");
        	   } else {
        	       System.out.println("\nSorry only numbers 1 thru 4 provide scriptures." );	
        	   }
        MenuHandler menuHandler = new MenuHandler();
        menuHandler.searchMenuHandler("choice", info);
        
        }        
    }