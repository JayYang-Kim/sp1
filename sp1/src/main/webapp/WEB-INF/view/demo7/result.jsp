<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	String cp = request.getContextPath();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h3>가입현황</h3>
		<div>
			<div>${dto.id}</div>
			<div>${dto.pwd}</div>
			<div>${dto.name}</div>
			<div>${dto.age}</div>
		</div>
		<h3>${msg}</h3>
	</body>
</html>