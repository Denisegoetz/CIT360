package ApplicationController;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainView extends JFrame{
	// This is the MainView  (This Screen starts the whole application)
	// Its only job is to display what the user sees
	// It performs no calculations, but instead passes
	// information entered by the user to whomever needs
	// it. 
	 
	//JLabel stands for Label, JTextField is an input text field, JButton is a button
    private JLabel       apptMenuLabel   = new JLabel("1 = Make Appointment");
	private JTextField      menuChoice   = new JTextField(1);
	private JButton        enterButton   = new JButton("Press Enter");

	MainView(){
		

	// Sets up the view and adds the components
	super("Dog-Gone Beautiful Main Menu");
	setLayout(new FlowLayout());
	
	JPanel apptPanel = new JPanel(new GridBagLayout());
	this.add(apptPanel);
	
	//This shows on the screen this the order you put it
	// GridBag is a way of laying out your screen.  Its like a grid with x,y axis. 
	// I have used it to control where the fields are laid out.
	GridBagConstraints gridCon = new GridBagConstraints();
	apptPanel.add(apptMenuLabel);
	gridCon.gridx = 0;
	gridCon.gridy = 2;
	apptPanel.add(menuChoice, gridCon);
	gridCon.gridx = 1;
	gridCon.gridy = 2;
	apptPanel.add(enterButton,gridCon);
	
	//this Close Operation makes program stop running if user closes window	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	this.setLocation(300,200);  //screen location
	
	//Size of screen
	this.setSize(450, 150);
	
// End of setting up the components --------
	
 }
	
	public String getMenuChoice(){
		
		return menuChoice.getText();
		
	}
	
    public void setMenuChoice(){
    	
        menuChoice.setText("");
        
    }
	
	
	//****** EVENT LISTENERS GOING HERE   *********//
	// If the enterButton is clicked execute a method
	// in the Controller named actionPerformed
	
	void addEnterListener(ActionListener listenEnterButton){
		
		enterButton.addActionListener(listenEnterButton);
	    System.out.println("Enter button is detected");
	}
	
	// Open a popup that contains the error message passed
	
	void displayErrorMessage(String errorMessage){
		
		JOptionPane.showMessageDialog(this, errorMessage);
		
	}	
	
	
}