<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Hello?</title>
</head>
<body>
<h1>Hello World!</h1>
<c:forEach var="item" items="${item}">
<a>${item}</a><br>
</c:forEach>
</body>
</html>