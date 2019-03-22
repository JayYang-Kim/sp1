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
		<form action="<%=cp%>/demo2/request" method="post">
			<p>
				<span>이름 : </span>
				<input type="text" name="name"/>
			</p>
			<p>
				<span>나이 : </span>
				<input type="text" name="age"/>
			</p>
			<p>
				<span>취미 : </span>
				<input type="checkbox" name="hobby[0]" value="게임"/>게임
				<input type="checkbox" name="hobby[1]" value="영화"/>영화
				<input type="checkbox" name="hobby[2]" value="음악"/>음악
				<input type="checkbox" name="hobby[3]" value="독서"/>독서
				<input type="checkbox" name="hobby[4]" value="여행"/>여행
			</p>
			<p>
				<button>보내기</button>
			</p>
		</form>
	</body>
</html>