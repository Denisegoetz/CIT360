package com.denisegoetz;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletTwo")
public class ServletTwo extends HttpServlet {

    //ShowColor Redirects to ServletTwo.  ServletTwo never shows anything it just sends it on to the correct jsp.

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
     	String  done = (String)(request.getParameter("Done"));
//		String  done = (String)(session.getAttribute("Done"));  //session.getAttribute- Won't work because it was sent 
		                                                        //via request. Need to use parameter in this case.
     	                                                        //Note: If I was going to continue with more screens. 
     	HttpSession session = request.getSession();                                                        //I would set the variable to the session.
     	String sessionId = session.getId();
     	
		System.out.println("THIS SESSION ID: " + sessionId);
		session.setAttribute("Done", done);
		
		
	    // I had.. if done == "true" and it didn't work.  Try this!
	    if (done.equals("true") ) {
	    	
	    	response.sendRedirect("IsDone.jsp");
	    	
	    }else {
	    
	    	response.sendRedirect("ShowColor.jsp");  //I send it back to ShowColor because Servlet doesn't know the color
	                                                 //Servlet gets the color from a parm from index.html & that is gone. 
	    	                                         //(out of Scope now).--  ShowColor gets color from session.
	    }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
	}
	
}