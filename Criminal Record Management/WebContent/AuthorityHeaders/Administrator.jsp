<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.kamesh.criminalrecord.models.AuthorityModel" %>
<%
	String name = (String) session.getAttribute("username");
	if (name == null) {
		response.sendRedirect("index.jsp");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
<link href="../style.css" rel="stylesheet">
</head>
<body>
	<nav> 
		<h2>Welcome, <%=name%></h2>
		<ul>	
			<li><a href="../ResultScreens/registerAuthority.jsp">Register Authority</a></li>
			<li><a href="../ResultScreens/showAuthoritiesDetails.jsp">Show All Authorities</a></li>
		</ul>
		<ul>
			<li><a href="../index.jsp">Logout</a></li>
		</ul>
	</nav>
	<main>
		<h2 align="center">Welcome this is home page</h2>
	</main>
</body>
</html>