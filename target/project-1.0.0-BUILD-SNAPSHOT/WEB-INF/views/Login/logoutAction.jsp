<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name='viewport' content="width=device-width" , initial-scale='1'>
<title>Insert title here</title>
</head>
<body>

	<%
		session.invalidate();
	%>
	<script>
		location.href = "http://localhost/project/Main"
	</script>
</body>
</html>