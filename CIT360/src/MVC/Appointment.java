package MVC;

import java.util.Map.Entry;

public class Appointment {

	
	public static void main(String[] args) {
		
		
        AppointmentView theView = new AppointmentView();
        
    	AppointmentModel theModel = new AppointmentModel();
        
        AppointmentController theController = new AppointmentController(theView,theModel);
        
        theView.setVisible(true);
        
        theModel.dumpHashMap();
        

	}

}
