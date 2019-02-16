<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body bgcolor=${color}>
  
   
  <h1> I'm going to disconnect your session.</h1>
  <h2> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;You said, you were done.</h2>
     
   
    <%
      //Session ID & Done parameter.
//       String sessionId = session.getId();
//       out.println("THIS SESSION ID: " + sessionId);
//       String done =(String)(session.getAttribute("Done"));
//       out.println("Value of Done: " + done);
     
    //This is  clearing the cache and deleting the session.
     response.setHeader("Cache-Control","no-cache");
     response.setHeader("Cache-Control","no-store");
     response.setHeader("Pragma", "no-cache");
     response.setHeader("Expires","0");
     response.setDateHeader("Expires", -1);
     session.invalidate();
      
  
      response.setHeader("Refresh", "5; URL=http://www.google.com");  //This sweet bit here has a timer to redirect   
                                                                      //you to another URL of your choice. 
	%>

    <h2>Redirecting you to Google in 5 seconds....</h2>
    <h4>Goodbye</h4>
	
</body>
</html>