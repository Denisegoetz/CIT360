package ApplicationController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import MVC.AppointmentController;
import MVC.AppointmentModel;
import MVC.AppointmentView;

public class ApplicationControllerHandler {

	private MainView theMainView;
	
	// Create empty map object called userCityMapping
	Map<String, String> menuMapping = new HashMap<>();
	
public ApplicationControllerHandler(MainView theMainView) {
		
	    this.theMainView = theMainView;		
		
		this.theMainView.addEnterListener(new EnterListener());
		 
		// ********************************************************* //
		// put elements into the menuMapping HashMap - (Key, Value)  //
		// ********************************************************* //
        menuMapping.put("1", "theView.");           //theView.setVisible(true);
        menuMapping.put("2", "theMainView.");
        menuMapping.put("3", "Best View");
 
	}
	

class EnterListener implements ActionListener{


	@Override
	public void actionPerformed(ActionEvent e) {
         
		  //  EXTRA CODE --- SAVE for later
	      //  	String menuCode = menuMapping.get(userChoice);
	      //      System.out.println("menu mapping goes to " + menuCode);
        try {
    
        	// Get user selection off the main menu view
	        String userChoice = theMainView.getMenuChoice();
	        
	        // Check if a key exists in the menuMapping HashMap 
	        if(menuMapping.containsKey(userChoice)) {
	        	
	            AppointmentView theView = new AppointmentView();
	            
	        	AppointmentModel theModel = new AppointmentModel();
	            
	            AppointmentController theController = new AppointmentController(theView,theModel);
	            
	        	
	            // Get the value assigned to a given key in the HashMap and GoTO that VIEW
	            menuMapping.get(userChoice).concat( "setVisible(true);" );
	    
	            
	            System.out.println(menuMapping.get(userChoice).concat( "setVisible(true)" ));
	            
	           	            
	            
	        } else {
	            System.out.println("City details not found for user " + userChoice);
	        }
	        
	        
     //   	if (theMainView.getMenuChoice().contentEquals("1")){

       
        	
            AppointmentView theView = new AppointmentView();
            
        	AppointmentModel theModel = new AppointmentModel();
            
            AppointmentController theController = new AppointmentController(theView,theModel);
            
            theView.setVisible(true);
            
    //    	}
    //        if (theMainView.getDogName().isEmpty())  {
            	
      //      	theView.setDogName();
      //       	theView.setCustomerName();
      //       }
             	
     //       else {
               //Learning: You don't have to run the method getDogName and then put it into an intermediary variable.
               //You can just use the method and it will substitute in the value, which will be passed.
            	
    //          theModel.saveCustomerInfo(theView.getDogName(),theView.getCustomerName());
    //            theView.setCustomerNumber(theModel.createCustomerNumber());
    //            theView.setDogName();
    //         	theView.setCustomerName();
    //         	theView.setCustomerNumber(0);
    //        }	 	
 
        }
        	
        catch(NumberFormatException ex){
        	
        	System.out.println(ex);
        	
        	theMainView.displayErrorMessage("You Need help programming");

        } 
		
	}  //goes to actionPerformed
		
	
 }  //goes to listner


}
