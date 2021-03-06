<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="dat152-libs" prefix="T"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="styles.css">
<title>Cart</title>
</head>
<body>
	<p><jsp:include page="chooseLanguage.jsp"></jsp:include>
	
	<fmt:bundle basename="no.hvl.dat152.resources.Messages">
		<h1><strong><fmt:message key="cart"></fmt:message></strong></h1>
		
		<table>
			<tr> 
				<th><fmt:message key="name"></fmt:message></th>
				<th><fmt:message key="shortDesc"></fmt:message></th>
				<th><fmt:message key="price"></fmt:message></th>
				<th><fmt:message key="quantity"></fmt:message></th>
				<th>Total</th>
			</tr>
			<c:forEach items="${products}" var="product">
			
				<tr>
					<td><c:out value="${product.pName}"/></td>
					<td><T:shorttext maxchars = "10"><fmt:message key="descText"></fmt:message></T:shorttext></td>
					<td><c:out value="${product.priceInEuro}"/> </td>
					<td><c:out value="${product.pno}"/></td>
					<td> 19.40 </td>
				</tr>						
			
			</c:forEach>
		</table>
		
		
	
		<p>
			<span><a href="/home"><fmt:message key="home"/></a></span>
			<span><a href="products.jsp"><fmt:message key="products"/></a></span>
		</p>
	
	</fmt:bundle>
	<i><T:copyright since="2008" name="HVL"></T:copyright></i>
</body>
</html>