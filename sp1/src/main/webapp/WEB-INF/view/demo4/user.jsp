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
		<!-- c:url value값이 cp값이 된다. -->
		<!-- 자동으로 인코딩이 된다. -->
		<c:url var="url" value="/header/result"> <!-- value값 안에 파라미터를 넣으면 인코딩이 안된다. -->
			<c:param name="name" value="자바"/> <!-- c:param 태그에서는 인코딩을 해준다. -->
		</c:url>
		<a href="${url}">헤더 확인</a>
		<!-- <a href="/sp1/header/result?name=%ec%9e%90%eb%b0%94">확인</a> -->
		<a href="<%=cp%>/cookie/set">쿠키 설정</a><br/>
		<a href="<%=cp%>/cookie/get">쿠키 확인</a><br/>
	</body>
</html>