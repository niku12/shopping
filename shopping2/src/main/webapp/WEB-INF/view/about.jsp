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

<body>
<!-- home nav -->
	<%@include file="./shared1/log.jsp" %>

<div class="container">
   <h1>About Us</h1>
  <hr/>
  <h2>
				<a href="home" align="right">Home</a>
			</h2>
<div class="row row-centered">

<div class="col-xs-6 col-centered">
  <p>This is about us page</p>
  Ecommerce aims to be the trusted destination,for businesses now across India to source all<br> their indirect spends
   Worstore platform.

Ecommerce is India's largest office products company serving businesses of<br> all sizes for everything.My company is selling
all brands laptop.
  </div>
   </div>
</div>
<!-- footer -->
	<%@include file="./shared1/footer.jsp" %>

</body>