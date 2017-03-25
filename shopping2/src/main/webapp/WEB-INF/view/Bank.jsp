<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sf:form modleAttribute="cart">
<table>
<tr><td>UserName</td><td>${cart.user.name}</td></tr>

<c:forEach var="address" items="${cart.user.addresslist}">
<tr><td>city</td><td>${address.city}</td></tr>
<tr><td>pin</td><td>${address.pin}</td></tr>
</c:forEach>

<tr><td>Garnd Totoal</td><td>${cart.grandtotal}</td></tr>
<tr><td><input name="_eventId_submit" type="submit" value="Conform" /><br /></td></tr>

</table>

</sf:form>
</body>
</html>