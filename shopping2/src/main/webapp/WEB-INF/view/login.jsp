<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<html>
<head>

</head>
<body>
	<center>
		<form  method="post">
			<table>
				<h1>Login form</h1>
				<tr>
					<td>Enter name</td>
					<td><input type="name" placeholder="enter name" name="username" /></td>
					${error}
				<tr>
					<td>Enter Password</td>
					<td><input type="password" placeholder="enter password" name="password"/></td>
					<td><input type="submit" value="submit" /></td>
				</tr>
			</table>

		</form>
	</center>

</body>

</html>