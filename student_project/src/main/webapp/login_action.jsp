<%
String user =request.getParameter("username");
String pass =request.getParameter("password");

if (user.equalsIgnoreCase("samatamakash124@gmail.com")&& pass.equalsIgnoreCase("akash045")){
	
	response.sendRedirect("Home.jsp");
	
}
else{
	response.sendRedirect("error.jsp");
}
%>