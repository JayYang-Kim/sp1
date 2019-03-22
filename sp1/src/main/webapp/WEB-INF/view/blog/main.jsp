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
		<h3>블로그 메인</h3>
		<div>
			<c:forEach var="dto" items="${list}">
				<div>
					<a href="<%=cp%>/blog/${dto.userId}/main">${dto.blogName}</a>
				</div>
			</c:forEach>	
		</div>
	</body>
</html>