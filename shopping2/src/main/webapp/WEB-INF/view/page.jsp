<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:url var="css" value="/resources/css"/>    
<spring:url var="js" value="/resources/js"/>
<spring:url var="image" value="/resources/image"/>


<!DOCTYPE html>
<html lang="en">
<head>
<title>Online Shopping - ${title}</title>
<meta charset="utf-8">

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
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  .bg-4 { 
      background-color: #2f2f2f;
      color: #fff;
  }
  </style>
 
</head>
<body>
<!-- home nav -->
	<%@include file="./shared1/log.jsp" %>
	
	
	
		<!-- nav bar -->
	
	
	<!-- carousel -->
	
	<c:if test="${userClickHome == true }">
	<%@include file="home.jsp" %>
	</c:if>
	<!-- load only when user clicks about -->
	
	<c:if test="${userClickAbout == true }">
	
	<%@include file="about.jsp" %>
	</c:if>
	
	<!-- load electronic page -->
	<c:if test="${userClickElectro ==true }">
	<%@include file="electro.jsp" %>
	</c:if>
	
<!-- footer -->
	<%@include file="./shared1/footer.jsp" %>
	</body>
</html>


