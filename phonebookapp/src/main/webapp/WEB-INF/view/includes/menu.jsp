<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<s:url var="url_loutout" value="./logout"/>

<!-- GUEST USER MENU -->
<c:if test="${sessionScope.userId==null}">

<a href="#">Home</a> | <a href="#">About</a>| <a href="#">Sign In</a> | <a href="#">Sign Up</a>

</c:if>

<!-- REGISERED USER MENU -->
<c:if test="${sessionScope.userId!=null && sessionScope.role==2}">

<a href="#">Home</a> | <a href="#">Contact List</a>| <a href="${url_loutout}">Logout</a> 

</c:if>

<!-- ADMIN USER MENU -->
<c:if test="${sessionScope.userId!=null && sessionScope.role==1}">

<a href="#">Home</a> | <a href="#">User List</a>| <a href="${url_loutout}">Logout</a> 

</c:if>