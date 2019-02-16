<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body bgcolor=${color}>  <!-- This is JSTL, cool! Gets color from the session. -->

   <%
      //This is getting the color using getAttribute from the session.
	  out.println("This is the Color you chose: " + session.getAttribute("color"));
//   
//      String sessionId = session.getId();
//      out.println("THIS SESSION ID: " + sessionId);
      
//      String done =(String)(session.getAttribute("Done"));
//      out.println("Value of Done: " + done);

//       String button = "dog";
//       Cookie cookies[] = request.getCookies();
//      	 for(Cookie c : cookies) {
//      		if(c.getName().equals("BackButton")) {
//      		 button = c.getName();
//      		}
//      	}
//      if(button == "off") { response.sendRedirect("Servlet");} 
	%>

     <form action="ServletThree" method="get">
        <br>
     	Enter a color please: <input type="text" name="color">&nbsp;<input type="submit">&nbsp;
        <p>Red, Blue, Green, Pink, turquoise, cyan, orange </p>
     
     </form>

     <form action="ServletTwo" method="get">
        <br> <br> <br> <br>
     	Are you done playing with colors?: 
     	<br>
     	<input type="radio" name="Done" value="true"> Yes
     	<input type="radio" name="Done" value="false"> No<br>
     <input type="submit">
     </form>

</body>
</html>