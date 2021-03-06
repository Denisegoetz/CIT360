package com.denisegoetz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String color = (String)(request.getParameter("color"));  //get parm because it's coming in via request.
		
        HttpSession session = request.getSession();  //getting a hold on a session that TomCat provides
		session.setAttribute("color", color);        //setting a parameter of color, the value is the color
		session.setAttribute("Done", "false");       //setting a parameter of Done to false so we know we aren't done yet
		
//		String sessionId = session.getId();
//		PrintWriter out = response.getWriter();
//		out.println("THIS SESSION ID: " + sessionId);
		
//	    Cookie cookie = new Cookie("BackButton", "off");
//	    response.addCookie(cookie);
			
		response.sendRedirect("ShowColor.jsp");     //This servlet which I stupidly named it Servlet is not even seen
	                                                //by the user.  It just sets up the set the session attribute and
	}                                               //Redirects it to the ShowColor.jsp file.  The address bar doesn't
                                                    //even tell the user, we were ever in this servlet, thankyou Redirect.

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	}
	
}
