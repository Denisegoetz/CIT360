package HttpURLconnect;

import java.net.*;
import java.io.*;

 
// Then, Opens a Http URL connection, reads the contents of a webpage, parses the data read and displays it,
// then disconnects from the HTTP URL.

public class HttpConnect {	

	public static void main(String[] args) {

		HttpConnect connection = new HttpConnect();

		try {

			connection.testUrl();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}


	private void testUrl(){

		String myUrl = "http://denisegoetz.com"; 
		URL theUrl;

		try {
			theUrl = new URL(myUrl);
			// instantiate the HttpURLConnection with the URL object - A new
		    // connection is opened every time by calling the openConnection
		    // method of the protocol handler for this URL.
		    // 1. This is the point where the connection is opened.
			HttpURLConnection httpConnection = (HttpURLConnection)theUrl.openConnection();   //Connects to my website

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