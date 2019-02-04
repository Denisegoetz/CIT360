package ApplicationController;


public class ApplicationController {


		
	public static void main(String[] args) {
			 
			
	    AppointmentView theView = new AppointmentView();
	        
	    AppointmentModel theModel = new AppointmentModel();
	        
	    MainView theMainView = new MainView();
	    
	    ApplicationControllerHandler theHandler = new ApplicationControllerHandler(theMainView);
	    
	    AppointmentController theController = new AppointmentController(theView,theModel);
	        
	    theMainView.setVisible(true);
	        

	}

}
