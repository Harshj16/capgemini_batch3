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
<link href="./static/css/style.css" rel="stylesheet" type="text/css"/>
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
				<c:if test="${errMsg!=null}">
					<p class="error">${errMsg}</p>
				</c:if>
				
				<c:if test="${param.act eq 'lo'}">
				<p class="success">Logout Successfully! Thanks for using phonebook app</p>
				</c:if>
				<s:url var="url_login" value="./loginHandle"/>
				<form:form action="${url_login}" method="post" modelAttribute="command">
					<table border="1">
						<tr>
							<td>Login Name</td>
							<td><form:input path="loginName"/></td>
						</tr>
						<tr>
							<td>Password</td>
							<td><form:password path="pwd"/></td>
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