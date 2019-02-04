package ACP;

import java.util.HashMap;

public class HandleDone implements Handler {

    public HandleDone() {
    }
    
    @Override
    public void handleMenu(HashMap<String, Integer> info) {
        System.out.println("Bye and don't forget to read your scriptures.");
    }
    
}
