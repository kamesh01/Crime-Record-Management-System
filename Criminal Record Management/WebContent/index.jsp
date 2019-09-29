<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="com.kamesh.criminalrecord.dao.AuthorityDao" %>
<%
	session.setAttribute("username", null);
	session.removeAttribute("username");
	if (request.getParameter("msg") != null && request.getParameter("msg").equalsIgnoreCase("invalid")) {
		out.print("<script>alert('Wrong Officer Id or Password')</script>");
	}
%>
<%
	AuthorityDao auth = new AuthorityDao();
	ResultSet rs = auth.getRoles();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link href="style.css" rel="stylesheet">
<script type="text/javascript" defer="defer">
	
</script>
</head>
<body>
	<h2>Login Page</h2>
	<form action="LoginController" method="post" name="lgoinForm">
		<input type="text" name="username" autofocus="autofocus" required="required" placeholder="Your ID">
		<input type="password" name="password" required="required" placeholder="Your Password">
		<select name="role" required="required">
			<%
				while(rs.next()){
			%>
			<option value="<%=rs.getString("roles")%>"><%=rs.getString("roles") %></option>
			<% } %>
		</select>
		<button type="submit">Login</button>
	</form>
	
</body>
</html>