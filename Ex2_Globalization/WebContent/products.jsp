<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="dat152-libs" prefix="T"%>  

  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="styles.css">
<title>Products</title>
</head>
<body>
	<p><jsp:include page="chooseLanguage.jsp"></jsp:include>
	
	<fmt:bundle basename="no.hvl.dat152.resources.Messages">

		<h1><strong><fmt:message key="products"></fmt:message></strong></h1>
		
		<h2><strong>White Coffee Cup(TM) </strong></h2>
		
		<img class="product-image" src="images/whitecup.jpg">
			
		<div class="product-text">
			<p><fmt:message key="name"></fmt:message>: White Coffee Cup(TM) </p>
			<p><fmt:message key="price"></fmt:message>: 52.00 </p>
			<p><fmt:message key="description"></fmt:message>:<fmt:message key="descText"></fmt:message></p>
			<button type="button"><fmt:message key="add"></fmt:message></button>
		</div>
		
		<h2><strong>Black Coffee Cup</strong></h2>
		
		<img class="product-image" src="images/blackcup.jpeg">
		
		<div class="product-text">
			<p><fmt:message key="name"></fmt:message>: White Coffee Cup(TM) </p>
			<p><fmt:message key="price"></fmt:message>: 52.00 </p>
			<p><fmt:message key="description"></fmt:message>:<fmt:message key="descText"></fmt:message></p>
			<button type="button"><fmt:message key="add"></fmt:message></button>
		</div>
		
		<p>
			<span><a href="/home"><fmt:message key="home"/></a></span>
			<span><a href="cart"><fmt:message key="cart"/></a></span>
		</p>
	</fmt:bundle>
	<i><T:copyright since="2008" name="HVL"></T:copyright></i>
</body>
</html>