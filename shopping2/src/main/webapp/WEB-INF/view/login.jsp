<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<html>
<head>
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
  .bg-4 { 
      background-color: #2f2f2f;
      color: #fff;
  }
   
  </style>
</head>
<body>
	<%@include file="./shared1/log.jsp" %>
	<center>
		<form  method="post">
			<table>
				<h1>Login form</h1>
				<tr>
					<td>Enter name</td>
					<td><input type="text" placeholder="enter name" name="username" /></td>
					${error}
				</tr>
				
				<tr>
					<td>Enter Password</td>
					<td><input type="password" placeholder="enter password" name="password"/></td></tr>
					<tr><td><input type="submit" class="btn btn-success" value="submit" /></td>
				</tr>
			</table>
		</form>
	</center>
	<%@include file="./shared1/footer.jsp" %>
</body>
</html>