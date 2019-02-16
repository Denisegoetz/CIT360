package HttpURLconnect;

import java.net.*;
import java.io.*;

// First goes to a webpage and checks the status. (FireHouseSubs) 
// Then, Opens a Http URL connection, reads the contents of a webpage, parses the data read and displays it,
// then disconnects from the HTTP URL.


public class HttpURLGetHtml {	

	private final String userAgent = "Mozilla/5.0";
//	private final String userAgent = "Java client";

	public static void main(String[] args) {

		HttpURLGetHtml connection = new HttpURLGetHtml();

		try {
			connection.run();
			connection.testUrl();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void run() throws Exception {

		URL myUrl = new URL("https://www.firehousesubs.com");  
		HttpURLConnection connection = (HttpURLConnection) myUrl.openConnection();
		connection.setDoOutput(true);

		connection.setRequestProperty("agent", userAgent);    //Identifies the browser type Firefox, Chrome, etc.

		int rc = connection.getResponseCode();
		System.out.println("\nSending the response to the specified URL: " + myUrl);
		System.out.println("Response Code = " + rc);
		System.out.println();
	}

	private void testUrl(){

		String myUrl = "http://denisegoetz.com"; 
		URL theUrl;

		try {
			theUrl = new URL(myUrl);
			HttpURLConnection httpConnection = (HttpURLConnection)theUrl.openConnection();  //Connects to my website

			print(httpConnection);
			
			httpConnection.disconnect();  // Terminate the HTTP URL connection and release its resources

		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void print(HttpURLConnection httpConnection){
		if(httpConnection != null){

			try {
				System.out.println("URL Content of http://denisegoetz.com:");
				//get and read the result from the server
				BufferedReader buffer = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));

				String s;

				while ((s = buffer.readLine()) != null){
					System.out.println(s);
				}
				buffer.close();        //closes buffer-reader
				 
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}