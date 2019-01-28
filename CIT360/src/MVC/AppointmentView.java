package MVC;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AppointmentView extends JFrame{
	// This is the View
	// Its only job is to display what the user sees
	// It performs no calculations, but instead passes
	// information entered by the user to whomever needs
	// it. 
	 
	//JLabel stands for Label, JTextField is an input text field, JButton is a button
    private JLabel       dNameLabel   = new JLabel("Your Dog's Name");
	private JTextField      dogName   = new JTextField(10);
	private JLabel       cNameLabel   = new JLabel("Dog Owner's Name");
	private JTextField customerName   = new JTextField(10);
	private JTextField customerNumber = new JTextField(10);
	private JButton     enterButton   = new JButton("Press Enter");
		
	AppointmentView(){
			
	// Sets up the view and adds the components
		
		super("Dog-Gone Beautiful Appointments");
		setLayout(new FlowLayout());
		
		JPanel apptPanel = new JPanel(new GridBagLayout());
		this.add(apptPanel);
		
		//This shows on the screen this the order you put it
		// GridBag is a way of laying out your screen.  Its like a grid with x,y axis. 
		// I have used it to control where the fields are laid out.
		GridBagConstraints gridCon = new GridBagConstraints();
		apptPanel.add(dNameLabel);
		gridCon.gridx = 0;
		gridCon.gridy = 2;
		apptPanel.add(dNameLabel, gridCon);
		gridCon.gridx = 1;
		gridCon.gridy = 2;
		apptPanel.add(dogName,gridCon);
		gridCon.gridx = 0;
		gridCon.gridy = 5;
		apptPanel.add(cNameLabel,gridCon);
		gridCon.gridx = 1;
		gridCon.gridy = 5;
		apptPanel.add(customerName,gridCon);
		gridCon.gridx = 1;
		gridCon.gridy = 7;
		apptPanel.add(customerNumber,gridCon);
		gridCon.gridx = 0;
		gridCon.gridy = 7;
		apptPanel.add(enterButton,gridCon);

	//	this.add(apptPanel);
		
		//this Close Operation makes program stop running if user closes window	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocation(300,200);  //screen location
		this.customerNumber.setEditable(false);
		//Size of screen
		this.setSize(450, 150);
		
	// End of setting up the components --------
		}
		
	
		public String getDogName(){
			
			return dogName.getText();
			
		}
		
	    public void setDogName(){
	    	
	        dogName.setText("");
	        
	    }
	    
		public String getCustomerName(){
			
			return customerName.getText();
			
		}
		
	    public void setCustomerName(){
	    	
	        customerName.setText("");
	     //   System.out.println(modelCustomerName);
	        
	    }
		
        public void setCustomerNumber(int cNumber ){
            
        // 	customerNumber.setBackground(Color.gray);;
	        customerNumber.setText(Integer.toString(cNumber));
	        customerNumber.setForeground(Color.WHITE);  //This is just hiding the number in there
	        
	    }
	    
		// If the enterButton is clicked execute a method
		// in the Controller named actionPerformed
		
		void addEnterListener(ActionListener listenForEnterButton){
			
			enterButton.addActionListener(listenForEnterButton);
			
		}
		
		// Open a popup that contains the error message passed
		
		void displayErrorMessage(String errorMessage){
			
			JOptionPane.showMessageDialog(this, errorMessage);
			
		}
}
