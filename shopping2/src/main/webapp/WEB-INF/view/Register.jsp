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
		<div class="content">
			<fieldset>
				<legend>Become Member</legend>
				<!-- for triggering webflow events using links,
					 the eventId to be triggered is given in "href" attribute as:
				 -->
				
				<sf:form modelAttribute="user" ><br />
					<sf:label path="name">UserName:</sf:label>
					<sf:input path="name" /><br />
					<!-- to display validation messages -->
					
					<sf:label path="password">Password: </sf:label>
					<sf:input type="password" path="password" /><br />
					<sf:label for="role" path="role">Role</sf:label>

								<sf:select path="role" id="role" class="form-control">

									<sf:option value="admin"></sf:option>
									<sf:option value="customer"></sf:option>

								</sf:select>
					
					
					<input name="_eventId_submit" type="submit" value="Submit" /><br />
				</sf:form>
			</fieldset>
		</div>
	</body>
</html>