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
		<form action="<%=cp%>/demo5/request" method="post">
			<span>이름 : </span>
			<input type="text" name="name"/><br/>
			<span>나이 : </span>
			<input type="text" name="age"/><br/>
			<button>보내기</button>
		</form>
	</body>
</html>