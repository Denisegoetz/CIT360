package ACP;

import java.util.HashMap;

public class MenuHandler {
    //****************************************************************************//
	// new hashMap called menuMap.  This gets created when ACP instantiates it.
	//****************************************************************************//
	private HashMap<String,Handler> menuMap = new HashMap<>();
	
	//*******************************************************************//
	//Method to take in what is passed to it and it up in the menuMap.
	//*******************************************************************//
	public void searchMenuHandler(String command, HashMap<String, Integer > data) {
		
		//*************************************************************************//
		// LEARN:   this.  - means use the current object I am working on. 
		//*************************************************************************//
		
		this.addMenuToMap();
		
		//*************************************************************************//
		// Instantiate Handler with (getting the incoming key "Y" first time then
		// user choice thereafter) So that means... this is cool so listen...
		// An instance is created of Handler called lowercase handler with the resolved key.
		// which is new HandleInput().  This is the scenario for the first time it runs.
		// Then afterward, it is whatever the person chooses.
		//     Just to be totally clear it would resolve to this...
		//        Handler handler = new HandleInput();
		//*************************************************************************//
		
		Handler handler = menuMap.get(command);
		
		
		//******************************************************************************//
		// If handler isn't null for the key, it will call handleMenu method with the
		// values it just retrieved in the hashMap.  handleMenu is in Handler, which 
		// was instantiated in ACP.                
		//******************************************************************************//
		
		if (handler != null) {
			handler.handleMenu(data);
		}
	}
	//*******************************************************************************//
	// load up the menuMap hashMap.  Key F, Value class()
	//*******************************************************************************//
	private void addMenuToMap() {
	   menuMap.put("F", new Faith());
	   menuMap.put("T", new Trials());
	   menuMap.put("A", new Atonement());
	   menuMap.put("Y", new HandleInput());
	   menuMap.put("N", new HandleDone());
	   menuMap.put("choice", new HandleChoice());
	 //  System.out.println("menuMap HashMap : " + menuMap);
	   
	}
	
}
