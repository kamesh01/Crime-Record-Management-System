<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.kamesh.criminalrecord.dao.AuthorityDao"%>

<%
	if(request.getParameter("msg").equalsIgnoreCase("registered") && request.getParameter("msg") != null){
		out.print("<script>alert('Registered successfully')</script>");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Authority</title>
</head>
<body>
	<%@ include file="../AuthorityHeaders/Administrator.jsp"%>
	<form action="../RegisterAuthority" method="post" onsubmit="return validateForm()" name="myForm">
		<input type="text" name="officerId" placeholder="Officer Id ex: ADMN001" required="required">
		<input type="text" name="name" placeholder="Officer Name" required="required"> 
		<input type="hidden" name="joinDate" placeholder="Join date" required="required">
		<input type="password" name="password" id="passwd" placeholder="Password" required="required">
		<small style="color: #aaa">Input Password and Submit [7 to 15 characters which contain only characters, numeric digits, underscore and first character must be a letter]</small>
		<select	name="role" required="required">
			<%
				ResultSet roles = new AuthorityDao().getRoles();
				while (roles.next()) {
			%>
			<option value="<%=roles.getString("roles")%>"><%=roles.getString("roles")%></option>
			<%
				}
			%>
		</select>
		<button type="submit" >Register</button>
	</form>
	<script>
		function validateForm() {
			var passw =  /^[A-Za-z]\w{7,14}$/;
			var psswrd = document.getElementById('passwd');
			if(psswrd.value.match(passw)) {
				return true;
			}
			else{ 
				alert('Please enter read the instruction for strong password');
				psswrd.focus();
				psswrd.style = 'boder: 2px solid red';
				return false;
			}
		}
	</script>
</body>
</html>