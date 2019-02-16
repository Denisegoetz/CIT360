package HttpURLconnect;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
 
//    Just the Header:
//    This program to display header information for a Http URL
//

public class HttpURLGetRespHeader { 
    public static void main(String[] args) {
	try {
 
            URL obj = new URL("https://www.mapquest.com");
            URLConnection connObj = obj.openConnection();
                        
            // Retrieve all the header information for the URL
            Map<String, List<String>> map = connObj.getHeaderFields();
 
            System.out.println("Printing All Response Header for URL: " + obj.toString() + "\n");
            
            // Display each item in the header fields
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
		
            // Display the length of the header content
            List<String> contentLength = map.get("Content-Length");
            if (contentLength == null) {
		System.out.println("'Content-Length' is not in the URL Header!");
            } else {
                for (String header : contentLength) {
                    System.out.println("Content-Lengtht: " + header);
		}
            }
 	} catch (Exception e) {
            e.printStackTrace();
	}
  }
}