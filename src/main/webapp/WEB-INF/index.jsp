<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<p>What is the code?</p>
		<p><c:out value ="${error}"></c:out></p>
		<form action="/codeProcess" method = "POST">
			<input type = "text"  name = "code">
			<button>Try Code</button>
		</form>
	</div>
</body>
</html>
