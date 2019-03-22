<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
	String cp=request.getContextPath();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h3>블로그 메인화면</h3>
		<div>
			<div>
				<h4>${dto.userName}의 블로그입니다.</h4>
			</div>
			<div>
				<span>주제 : ${dto.blogName}</span>
			</div>
			<div>
				<a href="<%=cp%>/blog">돌아가기</a>
			</div>
		</div>
		
	</body>
</html>