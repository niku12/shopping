<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Spring Mvc WebFlow Demo</title>
		<link href="style.css" rel="stylesheet" type="text/css" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="${css}/style.css">
<!-- style for carousel -->
 <style>
  .bg-4 { 
      background-color: #2f2f2f;
      color: #fff;
  }
  
 
  </style>


</head>
<body>
<%@include file="./shared1/log.jsp" %>
<div class="content">
		       <div class="col-md-2 col-md-offset-5">
		
<sf:form modleAttribute="cart">
<table>
<tr><td>UserName</td><td>${cart.user.name}</td></tr>

<c:forEach var="address" items="${cart.user.addresslist}">
<tr><td>city</td><td>${address.city}</td></tr>
<tr><td>pin</td><td>${address.pin}</td></tr>
</c:forEach>

<tr><td>Grand Total</td><td>${cart.grandtotal}</td></tr>
<tr><td><input name="_eventId_submit" class="btn btn-info" type="submit" value="Conform" /><br /></td></tr>

</table>

</sf:form>
</div>
</div>
	<%@include file="./shared1/footer.jsp" %>

</body>
</html>