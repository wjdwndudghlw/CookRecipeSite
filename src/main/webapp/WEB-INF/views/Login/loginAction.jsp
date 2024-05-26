<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.lee.project.User.UserDAO" %>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="user" class="com.lee.project.User.User" scope="page" />
<jsp:setProperty name="user" property="u_id"/>
<jsp:setProperty name="user" property="u_password"/>
<!--  만약 클래스로 지정한 user.user 클래스가있다면 그것의 객체를 id값으로 지정하고
setproperty name이랑 usebean id값이랑 맞춘다음에 객체의 변수 ex(u_id,u_email 
을 properyy 값으로 지정한다 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name='viewport' content="width=device-width" ,initial-scale='1'>
<title>JSP 게시판 웹 사이트</title>

</head>
<script>
alert("asdads");
</script>
<body>


<% 




%>


</body>
</html>