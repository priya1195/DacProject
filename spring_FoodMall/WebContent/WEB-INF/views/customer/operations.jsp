<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5>Hello ${sessionScope.customer_dtls.getName()}</h5>
<h5>Select Operation to perform</h5>
<h5>
		<a href="<spring:url value='product/list'/>">Buy Ready To Eat Food</a>
</h5>
<h5>
		<a href="product/list">Buy Vegetables</a>
</h5>
<h5>
		<a href="product/list">Buy Grocery</a>
</h5>
</body>
</html>