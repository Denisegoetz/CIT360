package ACP;

import java.util.HashMap;

public class Faith implements Handler{

    public void faith() {
    }
    @Override
    public void handleMenu(HashMap<String, Integer> info) {
       //**************************************************************************************//
       // This gets the scripture number the user selected from the hashMap.
       // Then it prints to the console the corresponding scripture.
       // Passes the HashMap with choice in it, which will cause it to go to HandleChoice via
       // MenuHandler and Handler.
       //*************************************************************************************//		  
        		 
        	Integer scriptNum = info.get("scriptN");
        	   System.out.println("\n This is a Faith Scripture " + scriptNum);
        	                
        	        
        	if (scriptNum == 1) {
        	       System.out.println("\nFaith Scripture # 1" 
        	      	  + "\n Whatsoever thing ye shall ask the Father in my name,"
                      + "\n which is good, in faith believing that ye shall receive," 
                      + "\n behold, it shall be done unto you, Moro. 7:26");	
        	   } else if (scriptNum == 2)  {
        	       System.out.println("\nFaith Scripture # 2"
        	    	  + "\n Faith is things which are hoped for and not seen,"
        	    	  + "\n Ether 12:6.");
        	   } else if (scriptNum == 3) {
        	       System.out.println("\nFaith Scripture # 3" 
        	          + "\n Salvation cometh to none such except it be through faith "
        	          + "\n on the Lord Jesus Christ, Mosiah 3:12.");
        	   } else if (scriptNum == 4) {
        	       System.out.println("\nFaith Scripture # 4" 
        	    	  + "\n Faith is not to have a perfect knowledge of things,"
        	    	  + "\n Alma 32:21 (Ether 12:6).");
        	   } else {
        	       System.out.println("\nSorry only numbers 1 thru 4 provide scriptures." );	
        	   }
        MenuHandler menuHandler = new MenuHandler();
        menuHandler.searchMenuHandler("choice", info);
        
        }        
    }