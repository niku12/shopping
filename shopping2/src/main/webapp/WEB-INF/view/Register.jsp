<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:url var="css" value="/resources/css"/>    
<spring:url var="js" value="/resources/js"/>
<spring:url var="image" value="/resources/image"/>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
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
	<h2>

			</h2>
		<div class="content">
		       <div class="col-md-2 col-md-offset-5">
		    
			<fieldset>
				<legend>Become Member</legend>
				<!-- for triggering webflow events using links,
					 the eventId to be triggered is given in "href" attribute as:
				 -->
				
				<sf:form modelAttribute="user" ><br />
					<sf:label path="name">UserName:</sf:label>
					<sf:input path="name" /><br /><br/>
					<!-- to display validation messages -->
					
					<sf:label path="password">Password: </sf:label>
					<sf:input type="password" path="password" /><br /><br/>
	                    
	
					<sf:label for="role" path="role">Role</sf:label>

								<sf:select path="role" id="role" class="form-control">

									<sf:option value="admin"></sf:option>
									<sf:option value="customer"></sf:option>

								</sf:select></br></br>
					
					
					<input name="_eventId_submit" class="btn btn-success" type="submit" value="Submit" /><br />
				</sf:form>
			</fieldset>
			</div>
		</div>
		<%@include file="./shared1/footer.jsp" %>
	</body>
</html>