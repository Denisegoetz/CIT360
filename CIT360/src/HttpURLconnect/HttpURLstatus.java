package HttpURLconnect;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
 
//////////////////////////////////////////////////////////////////////////////////////////
//  This checks the status of a URL. It returns "green" if up and "red" if unreachable.
//  I set several URLs to https to demonstrate failed attempts to reach a URL.
//
//////////////////////////////////////////////////////////////////////////////////////////
// Put Code Meanings Here:
//         200 - OK
//         301 - Permanent redirect to another webpage
//         404 - Not found
//         503 - HTTP Status-Code 503: Service Unavailable
//         Connection can be refused
//////////////////////////////////////////////////////////////////////////////////////////

public class HttpURLstatus {

    public static void main(String args[]) throws Exception {
 
        String[] hostList = { "https://www.lds.org", "http://www.denisegoetz.com",
        		"https://www.denisegoetz.com", "http://www.pinterest.com",
                "https://www.amzon.com", "https://www.amazon.com",
                "https://www.mapquest.com", "https://www.novi.k12.mi.us",
                "https://www.powercoaching.com", "http://www.powercoaching.com",
                "http://www.fundazing.com/", "http://www.foodnetwork.com/"};
 
        for (int i = 0; i < hostList.length; i++) {
 
            String url = hostList[i];
            String status = getURLStatus(url);
 
            System.out.println(url + "\t\tStatus:" + status);
        }
 
    }
 
    public static String getURLStatus(String url) throws IOException {
 
        String result = "";
        try {
            // Create a new HttpURL object
            URL siteURL = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) siteURL
                    .openConnection();
            
            // Initialize the method to GET or retrieve information from the URL
            connection.setRequestMethod("GET");
            
            // Initialize the connection to the URL
            connection.connect();
 
            // Check the response code to see if it successfully connected to the URL
            int code = connection.getResponseCode();
             
            // Other reasons why URL connection couldn't be reached
            if (code != 200) {
                result = ">Other< " + code;
            } 
            // A return code of 200 means the URL was successfully reached
            if (code == 200) {
                result = "Green";
            }
            
            // Terminate the HTTP URL connection and release its resources
            connection.disconnect();
        } catch (Exception e) {
            result = "->Red<-";
           // System.out.println(e);    // I wanted to know why the exception. The output is ugly so it's commented.
        }
        return result;
    }
 
}