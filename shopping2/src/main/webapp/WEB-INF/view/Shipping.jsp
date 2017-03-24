<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Spring Mvc WebFlow Demo</title>
		<link href="style.css" rel="stylesheet" type="text/css" />
	</head>

	<body>
	<h2>
				<a href="home" align="right">Home</a>
			</h2>
		<div class="content">
			<fieldset>
				<legend>Become Member</legend>
				<!-- for triggering webflow events using links,
					 the eventId to be triggered is given in "href" attribute as:
				 -->
				
				<sf:form modelAttribute="address" ><br />
				
					<%-- <sf:label path="shipping">Shipping:</sf:label>
					<sf:input path="shipping" /><br /><br/>
					 --%>
					
					<sf:label path="city">City: </sf:label>
					<sf:input  path="city" /><br /><br/>
	                    
	
					<sf:label path="pin">Pin: </sf:label>
					<sf:input  path="pin" /><br /><br/>
	                					
					
					<input name="_eventId_back" type="submit" value="Back" /><br />
					<input name="_eventId_bank" type="submit" value="Bank" /><br />
				</sf:form>
			</fieldset>
		</div>
	</body>
</html>