
<%@page isELIgnored="false"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta charaset="utf-8">
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<spring:url value="/resources/css" var="css"/>
<spring:url value="/resources/js" var="js"/>
<spring:url value="/resources/image" var="images"/>
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="${css}/bootstrap.css" />
<link rel="stylesheet" href="${css}/style.css" />
<link rel="stylesheet" href="${css}/dataTables.bootstrap.css" />


<link rel="stylesheet" href="${css}/bootstrap.min.css">
<script src="${js}/jquery.min.js"></script>
<script src="${js}/bootstrap.min.js"></script>
<script src="${js}/jquery.dataTables.js"></script>
<script src="${js}/dataTables.bootstrap.js"></script>
<style>
.bg-4 {
	background-color: #2f2f2f;
	color: #fff;
}
</style>
</head>
<body>
	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="vertical-align">
			<a class="navbar-brand" href="#"><img src="assert/image/star.png" /></a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="${contextRoot}/index">Home</a></li>
			<li><a href="#">About Us </a></li>
		</ul>

	</div>
	</nav>
<sf:form modelAttribute="product" ><br />
<table class="table table-hover">
<tr>
<th>Product Name</th>
<th>Product Price</th>
<th>Product Quantity</th>

<th></th>
</tr>

<tr>
<td>${product.id}</td>
<td>${product.name}</td>
<td>${product.price}</td></tr>
<tr>
<td><a href='delete/${cartItem.id}/cartItem'><input type='button' value='Delete' class='btn btn-primary'></a></td>
</tr>
</table>
</sf:form><br />
			

	



	<footer class="container-fluid bg-4 text-center">
	<p>
		This Site deals with Good Quality Products <a
			href="https://www.gmail.com">www.Star.com</a>
	</p>
	</footer>

</body>
</html>