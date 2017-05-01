<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<spring:url var="css" value="/resources/css"/>    
<spring:url var="js" value="/resources/js"/>
<spring:url var="image" value="/resources/image"/>

<%@taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>


<nav class="navbar navbar-inverse ">
	<div class="container-fluid">
		<div class="vertical-align">
			<a class="navbar-brand" href="#"><img src="" /></a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="${contextRoot}/home">Home</a></li>
			
			<li><a href="${contextRoot}/about">About Us </a></li>
			<security:authorize access="hasAuthority('admin')">
			<li class="active"><a href="${contextRoot}/Admin">Admin </a></li>
			</security:authorize>
		
				<li><a href="${contextRoot}/electro">Product</a></li>
				<li><a href="#"></a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
		
     <security:authorize access="isAnonymous()">      	
			<li><a href="${contextRoot}/Register"><span
					class="glyphicon glyphicon-user"></span> Sign Up</a></li>
		</security:authorize>
<security:authorize access="isAnonymous()">	
				<li><a href="${contextRoot}/login"><span
						class="glyphicon glyphicon-log-in"></span>Login</a></li>
						</security:authorize>
			
			<security:authorize access="isAuthenticated()">
                 <li><a href="${contextRoot}/customer/viewCart">View Cart</a></li>
				<li><a href="${contextRoot}/logout"><span
						class="glyphicon glyphicon-log-in"></span>Logout</a></li>
			</security:authorize>


		</ul>
	</div>
</nav>
