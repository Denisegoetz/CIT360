package ApplicationController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AppointmentController {

	 
    private AppointmentView theView;
	private AppointmentModel theModel;
	
	
	public AppointmentController(AppointmentView theView, AppointmentModel theModel) {
		
		this.theView  = theView;
		this.theModel = theModel;
		
		this.theView.addEnterListener(new EnterListener());
		

	}
	

	class EnterListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
            
			
            try {
            	
                if (theView.getDogName().isEmpty())  {
                	
                	theView.setDogName();
                 	theView.setCustomerName();
                 }
                 	
                else {
                   //Learning: You don't have to run the method getDogName and then put it into an intermediary variable.
                   //You can just use the method and it will substitute in the value, which will be passed.
                    theModel.saveCustomerInfo(theView.getDogName(),theView.getCustomerName());
                    theView.setCustomerNumber(theModel.createCustomerNumber());
                    theView.setDogName();
                 	theView.setCustomerName();
                 	theView.setCustomerNumber(0);
                }	 	
     
            }
            	
            catch(NumberFormatException ex){
            	
            	System.out.println(ex);
            	
            	theView.displayErrorMessage("You Need help programming");

            } 
			
		}
		
	}

}
