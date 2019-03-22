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
		${dto.id}<br/>
		${dto.pwd}<br/>
		${dto.name}<br/>
		${dto.memberType}<br/>
		${dto.hak}<br/>
		<div>
			<c:forEach var="t" items="${memberTypes}">
				${t}<br/>
			</c:forEach>
		</div>
		<div>
			<c:forEach var="h" items="${haks}">
				${h}<br/>
			</c:forEach>
		</div>
	</body>
</html>