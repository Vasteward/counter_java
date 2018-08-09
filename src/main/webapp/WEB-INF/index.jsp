<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-rc.2/css/materialize.min.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css">    
</head>
<body>
	<div id="container">
		<h1>Welcome User!</h1>
		<h2 class="white-text"> # </h2>
		<a href="<c:url value="/your_server/counter" />" id="right" class="button waves-effect waves-light btn-floating red darken-3"><i class="material-icons right">add_to_photos</i>TIME</a>
		<a href="<c:url value="/your_server/reset"/>" id="left" class="button waves-effect waves-light btn-floating red darken-3"><i class="material-icons right">format_color_reset
	</i>RESET</a>
		<a href="<c:url value="/your_server/increment"/>" id="right" class="button waves-effect waves-light btn-floating red darken-3"><i class="material-icons right">filter_2</i>INCREMENT</a>
		
	</div>
</body>
</html>