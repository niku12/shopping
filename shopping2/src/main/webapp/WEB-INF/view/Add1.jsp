
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="/WEB-INF/view/include.jsp"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>

<!DOCTYPE head PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

</head>
<body>
<!-- adding header -->
<%@include file="./shared1/log.jsp" %>


<div class="container">

	<div class="col-lg-3"></div>
	<div class="col-lg-7">

	<form:form action="${contextRoot}/laptop.do" method="POST" commandName="laptop">
		<table>
			
			<tr>
					<td align="center">Product Id :</td>
					<td><form:input type="text" path="id" id="id" /></td><font color="green"> </font>
				  <div class="has-error">
				  
				  <form:errors path="id"/>
				  </div>
				</tr>
				
				
			
			<tr>
					<td align="center">Product name :</td>
					<td><form:input type="text" path="name" id="name" /></td>
					<div class="has-error">
					  <form:errors path="name"/>
					  </div>
				</tr>
				
		<!-- 	<tr>
					<td align="center">image :</td>
					<td><form:input type="text" path="imageURL" id="imageURL" /></td>
					  <form:errors path="imageURL"/>
				</tr> -->
				
			
			<tr>
					<td align="center">Product desc :</td>
					<td><form:input type="text" path="desc" id="desc" /></td>
					<div class="has-error">
					  <form:errors path="desc"/>
					  </div>
				</tr>
               <div class="form-group">
					<label for="image">Image Upload</label>
					<form:input path="imageURL" type="file"/>
					</div>
	
				
				<tr>
					<td align="center" colspan = "2"><input type="submit" class="btn btn-md btn-primary" name="action" value="add" />
					<input type="submit" class="btn btn-md btn-success" name="action" value="update" />
			
					<input type="submit" class="btn btn-md btn-warning" name="action" value="delete" />
					<input type="submit" class="btn btn-md btn-danger" name="action" value="search" /></td>
				</tr>
				
		</table>



	</form:form>
		
		</div>
		</div class="col-lg-2">
		</div>
	 	</div class="container">
		<%@include file="electro1.jsp" %>
		</div>
		</div> 

</body>
</html>