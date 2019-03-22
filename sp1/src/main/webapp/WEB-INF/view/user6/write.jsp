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
		<form action="<%=cp%>/user6/reuqest" method="post">
			<div>
				<span>이름 : </span>
				<input type="text" name="name"/>
			</div>
			<div>
				<span>취미 : </span>
				<input type="checkbox" name="hobby" value="게임"/>게임
				<input type="checkbox" name="hobby" value="음악"/>음악
				<input type="checkbox" name="hobby" value="영화"/>영화
				<input type="checkbox" name="hobby" value="여행"/>여행
				<input type="checkbox" name="hobby" value="독서"/>독서
			</div>
			<div>
				<button>전송</button>
			</div>
		</form>
	</body>
</html>