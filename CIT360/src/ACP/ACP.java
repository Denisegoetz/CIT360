package ACP;

import java.util.HashMap;

public class ACP {

	public static void main(String[] args) {
		// This package demonstrates Application Controller Pattern.
		// Main class -  Empty HashMap is passed to get it all started.  No reference
		// to it but that is okay because no one needs it.

	MenuHandler  menuHandler = new 	MenuHandler();
	menuHandler.searchMenuHandler("Y",new HashMap<>());
		
	}

}
