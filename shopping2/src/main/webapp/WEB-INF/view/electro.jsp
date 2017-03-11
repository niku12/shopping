
<%@page isELIgnored="false"%>
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
<!-- adding header -->
<%@include file="./shared1/log.jsp" %>


<div class="container">
		<table id="ta" class="table table-condensed table-hover">
			<thead>
				<tr>
					<th>Product</th>
					<th>name</th>
					<th>price</th>
					<th>Order</th>
					<th>&#160;</th>
				</tr>
			</thead>
		</table>
		

		<script type="text/javascript">
			$(function() {
				$('#ta')
						.DataTable(
								{
									ajax : {
										url : '/shopping2/all/data',
										dataSrc : ''
									},

									columns : [

											{
												data : 'id'
											},
											{
												data : 'name'
											},
											{
												data : 'desc'
											},
											{
												data : null,

												mRender : function(data, type,
														row) {
													return '<img src="/shopping2/resources/image/'+data.id+'.jpg" width="25px" height="25px">';
												}

											},
											{
												data : null,
												mRender : function(data, type,
														row) {
													return '<a href="/shopping2/elec1/'+row.id+'" role="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="">view</a><button type="submit" class="btn btn-danger btn-lg">Add to Cart</button>';
												}

											}

									]

								});
			});
		</script>

	</div>


<!-- footer -->>
<%@include file="./shared1/footer.jsp" %>

</body>