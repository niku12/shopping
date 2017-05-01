<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
</style>

</head>
<body>

<table class="table">
  <thead class="thead-default">
   
    <tr>
      
      <th></th>
      <th> </th>
      <th></th>
      <th></th>
      <th><a href="${contextRoot}/electro"  class="btn btn-success">ADD ITEM</a></th>
    </tr>
   
    <tr>
      
      <th>Cart Item Id</th>
      <th>Product </th>
      <th>Quantity</th>
      <th>Product Total</th>
      <th></th>
    </tr>
  </thead>
  <tbody>
  
     
    <c:if  test="${not empty cartStatus}">
       
        ${cartStatus} 
    
    </c:if>
  
    <c:set var="grandtotal" value="0" />
    <c:forEach  var="cartItem"   items="${cartItems}">
    <tr>
      <th>${cartItem.id}</th>
      <th>${cartItem.product.name}</th>
      <th>${cartItem.quantity}</th>
      <th>${cartItem.totalPrice}</th>
      <th><a href="/shopping2/customer/${cartItem.id}/removeCartItem"  class="btn btn-danger">DELETE</a></th>
      <c:set  var = "grandtotal" value ="${grandtotal + cartItem.totalPrice} "  />
      
    </tr>
    <tr>
    
    
    </tr>
   
    </c:forEach>
     <tr>
      
      <th></th>
      <th><b>Grand Total :</b></th>
      <th><b>${grandtotal}</b></th>
    </tr>
    
  </tbody>
</table>



<h2><a href="${contextRoot}/customer/Orderdetails"  class="btn btn-success">Check Out</a></h2>

</body>
</html>