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
		<style type="text/css">
			*{padding:0;margin:0;}
		</style>
		<script type="text/javascript" src="http://code.jquery.com/jquery-1.12.4.min.js"></script>
		<script type="text/javascript">
			function send() {
				var f = document.myForm;
			
				f.submit();
			}
		</script>
	</head>
	<body>
		<form name="myForm" action="<%=cp%>/lotto/write" method="post">
			<div>
				<div>
				</div>
				<div>
					<p>구매개수 : </p>
					<input type="text" name="count"/>
					
				</div>
				<div>
					<p>포함할 수 : (0-6개)</p>
					<div>
						<div id="includeInput"></div>
						<div>
							<button type="button" id="addInput">+</button>
							<button type="button" id="removeInput">+</button>
						</div>
					</div>
				</div>
				<div>
					<button type="button" onclick="send()">구매</button>
				</div>
			</div>
		</form>
	</body>
</html>