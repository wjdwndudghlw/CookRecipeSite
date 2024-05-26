<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:wght@100;200;300;400;500;600;700;800;900&display=swap"
	rel="stylesheet">

<title>Plot Listing Page</title>
<style type="text/css">
@import url("https://fonts.googleapis.com/css2?family=Nunito:wght@200;1000&display=swap");
* {
	font-family: "Nunito", sans-serif;
	margin: 0;
	box-sizing: border-box;
}
body {
	min-height: 100vh;
	display: flex;
	flex-direction: column;
	justify-content: space-between;
}
body:has(#navToggle:checked) aside {
	right: 0;
}
body:has(#navToggle:checked) .bar {
	top: initial;
	bottom: initial;
}
body:has(#navToggle:checked) .bar:nth-of-type(1) {
	transform: rotate(45deg);
}
body:has(#navToggle:checked) .bar:nth-of-type(2) {
	opacity: 0;
}
body:has(#navToggle:checked) .bar:nth-of-type(3) {
	transform: rotate(-45deg);
}
nav {
	width: 100%;
	height: 60px;
	background-color: #cde3b3;
	box-shadow: 0 3px 3px 0 rgba(0, 0, 0, 0.2);
	padding: 10px;
	display: flex;
	justify-content: space-between;
	align-items: center;
	position: relative;
	z-index: 4;
}
nav > .brand {
	font-size: 2rem;
	font-weight: 1000;
	text-decoration: none;
	color: #283618;
}
nav > .input-group > input {
	background-color: transparent;
	border: none;
	outline: none;
	font-size: 1.2rem;
	width: 150px;
	color: #283618;
}
nav > .input-group > i {
	color: #283618;
}
.toggle {
	width: 30px;
	height: 30px;
	margin-right: 70px;
	position: relative;
	display: flex;
	flex-direction: column;
	justify-content: space-evenly;
	align-items: center;
}
.bar {
	width: 100%;
	height: 2px;
	background-color: #000;
	position: absolute;
	transition: all 0.3s;
}
.bar:nth-of-type(1) {
	top: 5px;
}
.bar:nth-of-type(2) {
	bottom: 5px;
}
#navToggle {
	-webkit-appearance: none;
	display: block;
	width: 30px;
	height: 30px;
	position: absolute;
	z-index: 3;
	cursor: pointer;
}

main {
	/* 	opacity:0; */
	padding: 20px 40px;
	display: flex;
	justify-content: space-between;
	align-items: center;
}
.content,
.img {
	width: 45%;
}
.icon {
	width: 100px;
	height: 100px;
	font-size: 3rem;
	border-radius: 50rem;
	display: flex;
	justify-content: center;
	align-items: center;
	background-color: #eefae0;
	color: #283618;
	margin-bottom: 10px;
}
.content h1 {
	font-size: 3rem;
}
.content .lead {
	font-size: 1.2rem;
	margin-bottom: 15px;
}
.content button {
	background-color: #eefae0;
	color: #283618;
	border: none;
	padding: 10px 15px;
	display: block;
	margin-top: 30px;
	font-size: 1.2rem;
	cursor: pointer;
	transition: all 0.3s;
}
.content button i {
	margin-left: 10px;
}
.content button:hover {
	background-color: #606c38;
	color: #fefae0;
}
.img img {
	width: 100%;
}
footer {
	width: 100%;
	background-color: #cde3b3;
	box-shadow: 0 -3px 3px 0 rgba(0, 0, 0, 0.2);
	padding: 10px;
	display: flex;
	justify-content: space-evenly;
	align-items: center;
	position: relative;
	z-index: 4;
}

aside {
	position: fixed;
	top: 0;
	right: -300px;
	width: 300px;
	height: 100vh;
	background-color: #eefae0;
	transition: right 0.3s;
	padding: 100px 20px;
	display: flex;
	flex-direction: column;
	align-items: center;
	justify-content: center;
}
aside a i {
	margin-right: 10px;
}
aside a {
	font-size: 1.1rem;
	color: #283618;
	text-decoration: none;
	position: relative;
	height: 30px;
	margin: 10px 0;
	display: inline-block;
}
aside a::before {
	content: "";
	position: absolute;
	bottom: -2px;
	left: 0;
	width: 100%;
	height: 1px;
	background-color: #283618;
	transform: scaleX(0);
	transition: transform 0.3s;
}
aside a:hover::before {
	transform: scaleX(1);
}

</style>


<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<nav>
<div></div>
	<div class="toggle">
		<div class="bar"></div>
		<div class="bar"></div>
		<div class="bar"></div>
		<input type="checkbox" id="navToggle" />
	</div>
</nav>
<main>
	<div class="content">
		<h1><c:out value="${notices.title }"/></h1>
		<p class="lead"><c:out value="${notices.contents }"/></p>
		<p></p>
	</div>
	<div class="img">
		<img src="<c:out value="${DetailNotice.noticeImgUrl }"/>" 
		onerror="this.src='https://images.unsplash.com/photo-1672862817339-51ef2610a5d0?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1818&q=80'" 
		alt="" style="height: 300px">
	</div>
</main>
<footer>
	Comments
</footer>
<jsp:include page="comment.jsp"></jsp:include>

<aside>
	<a href="/project"><i class="fas fa-home"></i>Home</a>
	<a href="/project/mainBoard"><i class="fa-solid fa-people-group"></i>board</a>
</aside>


</body>
</html>