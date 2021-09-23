<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="styles.css">
<title>Home</title>
</head>
<body>
	<p><jsp:include page="chooseLanguage.jsp"></jsp:include>
	
	<h1><strong>Kaffekopper AS</strong></h1>
	
	<img class="logo" src="images/javacoffee.png">
	
	<fmt:bundle basename="no.hvl.dat152.resources.Messages">
		<h3>
			<fmt:message key="greeting"/>
		</h3>
		
		<p> 
			<fmt:message key="lookAt"/> <a href="products.jsp"><fmt:message key="products"/></a>
		</p>
	
	</fmt:bundle>
	<!-- Her må vi egentlig legge til ett custom html element som tar inn et start år og nåværende år
			og som så konverterer dem til romertall -->
	<p><i>&copy; MMVIII-MMXXI Høgskulen på Vestlandet</i></p>
</body>
</html>