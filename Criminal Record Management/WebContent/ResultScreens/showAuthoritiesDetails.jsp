<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.kamesh.criminalrecord.dao.AuthorityDao"%>
<%
	if(request.getParameter("msg") != null && request.getParameter("msg").equalsIgnoreCase("deleted")){
		out.print("<script>alert('Deleted successfully')</script>");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show All Authorities</title>
<link href="../style.css" rel="stylesheet">
</head>
<body>
	<%@ include file="../AuthorityHeaders/Administrator.jsp"%>
	<form action="../ShowOneAuthority">
		<input type="text" name="officerId" placeholder="Officer Id">
		<button type="submit">Show</button>
	</form>
	<table class="output" border="1" align="center">
		<tr>
			<th>Officer Id</th>
			<th>Officer Name</th>
			<th>Join Date</th>
			<th>Password</th>
			<th>Roles</th>
			<th colspan="2">Actions</th>
		</tr>
		<%
			AuthorityDao auth = new AuthorityDao();
			List<AuthorityModel> list = auth.getAllAuthority();
			Iterator<AuthorityModel> it = list.iterator();
			while (it.hasNext()) {
				AuthorityModel model = (AuthorityModel) it.next();
		%>
		<tr>
			<td><%=model.getOfficer_id()%></td>
			<td><%=model.getName()%></td>
			<td><%=model.getJoin_date()%></td>
			<td><%=model.getPassword()%></td>
			<td><%=model.getRoles()%></td>
			<td><a href="./editAuthoritiesDetails.jsp"><button>Edit</button></a></td>
			<td><a href="../DeleteAuthority?id=<%=model.getOfficer_id() %>"><button>Delete</button></a></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>