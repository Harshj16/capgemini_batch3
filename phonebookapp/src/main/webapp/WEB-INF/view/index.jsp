<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PhoneBook | Index</title>
</head>
<body>
	<table border="1" width="80%" align="center">
		<tr>
			<td height="60px">
				<jsp:include page="includes/header.jsp"/>
			</td>
		</tr>
		<tr>
			<td height="20px">
			<jsp:include page="includes/menu.jsp"/>
			</td>
		</tr>
		<tr>
			<td height="400px" valign="top">
				<h3>Login Form</h3>
				<form:form action="#" method="post">
					<table border="1">
						<tr>
							<td>Login Name</td>
							<td><input type="text"></td>
						</tr>
						<tr>
							<td>Password</td>
							<td><input type="password"></td>
						</tr>
						<tr>
						
							<td colspan="2" align="right">
								<button>Login</button> <br>
								<a href="#">New User Registration</a>
							</td>
						</tr>
					</table>
				</form:form>
				
			</td>
		</tr>
		<tr>
			<td height="20px">
				<jsp:include page="includes/footer.jsp"/>
			</td>
		</tr>

	</table>
</body>
</html>