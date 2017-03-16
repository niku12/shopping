<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table width="120%" height="120%">
  <tr><td width="120%" height="120%"></td></tr>

</table>

	<center><table>
		<tr>
		<td><img src="/shopping2/resources/image/${product.id}.jpg" width="20%" height="20%" /></td>
			<td>${product.id}</td>
			<td>${product.name}</td>
			<td>${product.desc}</td>
			
		</tr>
		</table></center>
</body>
</html>