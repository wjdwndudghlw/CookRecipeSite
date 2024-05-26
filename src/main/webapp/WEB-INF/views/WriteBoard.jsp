<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.lee.project.Notice.Notice"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:wght@100;200;300;400;500;600;700;800;900&display=swap"
	rel="stylesheet">

<title></title>

<!-- Bootstrap core CSS -->
<link href="resources/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">


<!-- Additional CSS Files -->
<link rel="stylesheet" href="resources/assets/css/fontawesome.css">
<link rel="stylesheet"
	href="resources/assets/css/templatemo-plot-listing.css">
<link rel="stylesheet" href="resources/assets/css/animated.css">
<link rel="stylesheet" href="resources/assets/css/owl.css">





<!-- jQuery -->

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>



<!-- Bootstrap CSS -->

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
<title>board</title>
<style>
a,button {
	width:80px;
	height:50px;
}
</style>


<script>

	$(document).on('click', '#btnSave', function(e){

		e.preventDefault();

		

		$("#form").submit();

	});

	

	$(document).on('click', '#btnList', function(e){

		e.preventDefault();

		

		location.href="${pageContext.request.contextPath}/board/getBoardList";

	});
	
	
	
	
	
	
	
	
	
	
	function isEmpty(input) {
		return (!input);
	}

	//<input>, 글자 수를 넣었을 때
	//그 글자수보다 적으면 true, 그 글자수 이상이면 false
	function atLeastLetter(input, len) {
	return (input.length < len);
	}

	//<input> x 2 넣었을 때 (pw, pw확인)
	//내용이 다르면 true, 같으면 false
	function notEqualPw(input1, input2) {
	return (input1 != input2);
	}


	//<input>, 문자열세트 넣었을 때
	//없으면 true, 있으면 false (입력한 pw에 지정한 문자열이 없는 경우)
	function notContain(input, passSet) {
		let iv = input;
		for (let i = 0; i < passSet.length; i++) {
			if (iv.indexOf(passSet[i]) != -1) {
				return false;
			}
		}
		return true;
	}
	
	
	
	function check_level() {

		var title  = document.getElementById("title").value;
		var userName  = document.getElementById("userName").value;
		var content  = document.getElementById("contents").value;

		
		if (isEmpty(title) || isEmpty(userName) || isEmpty(content) ) {
			alert("입력이 안된 사항이 있습니다");
			title="";
			title.focus();
			return false;
		}

		
	}
	
	
	
	
	
	
	

</script>

<style>

body {

  padding-top: 40px;

  padding-bottom: 20px;

}



</style>

</head>

<body>

		<%
		String userID = null;
		if (session.getAttribute("userID") != null) {
			userID = (String) session.getAttribute("userID");
		}
		
		String ManagerID = null;
		if (session.getAttribute("ManagerID") != null) {
			ManagerID = (String) session.getAttribute("ManagerID");
		}
	%>

	<!-- ***** Preloader Start ***** -->
	<div id="js-preloader" class="js-preloader">
		<div class="preloader-inner">
			<span class="dot"></span>
			<div class="dots">
				<span></span> <span></span> <span></span>
			</div>
		</div>
	</div>
	
	
	
	
	
	<header class="header-area header-sticky wow slideInDown"
		data-wow-duration="0.75s" data-wow-delay="0s">
		<div class="container">
			<div class="row">
				<div class="col-12">
					<nav class="main-nav" style="float: middle;">
						<!-- ***** Menu Start ***** -->
						<ul class="nav">
							<%
								if (userID == null) {
							%>
							<li><a href="#" class="active">추천 레시피</a></li>
							<li><a href="#" class="active">검색 기록 확인</a></li>
							<li><a href="#" class="active">즐겨찾기</a></li>
							<li><div class="main-white-button">
									<a href="login_signUp"><i class="fa fa-plus"></i>로그인/ 회원가입</a>
								</div></li>

						</ul>
						<%
							} else {
						%><li><a href="#" class="active">추천 레시피</a></li>
						<li><a href="listing.jsp">검색 기록 확인</a></li>
						<li><a href="contact.jsp">즐겨찾기</a></li>
						<li><div class="main-white-button">
								<a href="logoutAction"><i class="fa fa-plus"></i>로그아웃</a>
							</div></li>

						</ul>
						<%
							}
						%>
						<!--             <a class='menu-trigger'>
                <span>Menu</span>
            </a> -->
						<!-- ***** Menu End ***** -->
					</nav>
				</div>
			</div>
		</div>
	</header>
	<!-- ***** Header Area End ***** -->

	<div class="page-heading">
		<div class="container">
			<div class="row">
				<div class="col-lg-8">
					<div class="top-text header-text">
						<h6>Check Out Our Listings</h6>
						<h2>Item listings of Different Categories</h2>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	
	
	
	
	
	
	<%
		if(userID !=null || ManagerID == null){
	%>

	<article>

		<div class="container" role="main">

			<h2>board Form</h2>

			<form name="form" id="form" role="form" method="get" action="WrtieBoard_Action" onsubmit="return check_level()">

				<div class="mb-3">

					<label for="title">제목</label>

					<input type="text" class="form-control" name="title" id="title" placeholder="제목을 입력해 주세요">

				</div>

				

				<div class="mb-3">

					<label for="reg_id">작성자</label>

					<input type="text" class="form-control" name="userName" id="userName"  readonly value="${userID  }">

				</div>

				

				<div class="mb-3">

					<label for="content">내용</label>

					<textarea class="form-control" rows="5" name="contents" id="contents" placeholder="내용을 입력해 주세요" ></textarea>

				</div>

				

				<div class="mb-3">

					<label for="tag">TAG</label>

					<input type="text" class="form-control" name="tag" id="tag" placeholder="태그를 입력해 주세요">

				</div>

			

			</form>
         
			<div >

				<button type="button" class="btn btn-sm btn-secondary" id="btnSave">저장</button>
			
				<a href="board1" class="btn btn-sm btn-secondary" >목록</a>

	

			</div>

		</div>

	</article>









<%
}else if(userID ==null || ManagerID != null){
	%>

	<article>

		<div class="container" role="main">

			<h2>Notice Form</h2>

			<form name="form" id="form" role="form" method="get" action="WrtieManager_Action" onsubmit="return check_level()">

				<div class="mb-3">

					<label for="title">제목</label>

					<input type="text" class="form-control" name="m_title" id="title" placeholder="제목을 입력해 주세요">

				</div>

				

				<div class="mb-3">

					<label for="reg_id">작성자</label>

					<input type="text" class="form-control" name="m_name" id="userName"  readonly value="${ManagerID  }">

				</div>

				

				<div class="mb-3">

					<label for="content">내용</label>

					<textarea class="form-control" rows="5" name="m_contents" id="contents" placeholder="내용을 입력해 주세요" ></textarea>

				</div>

				

				<div class="mb-3">

					<label for="tag">TAG</label>

					<input type="text" class="form-control" name="tag" id="tag" placeholder="태그를 입력해 주세요">

				</div>

			

			</form>
         
			<div >

				<button type="button" class="btn btn-sm btn-secondary" id="btnSave">저장</button>
			
				<a href="notice1" class="btn btn-sm btn-secondary" >목록</a>

	

			</div>

		</div>

	</article>


<%
		}
%>

	<!-- Scripts -->

	<script src="resources/vendor/jquery/jquery.min.js"></script>
	<script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="resources/assets/js/owl-carousel.js"></script>
	<script src="resources/assets/js/animation.js"></script>
	<script src="resources/assets/js/imagesloaded.js"></script>
	<script src="resources/assets/js/custom.js"></script>
</body>

</html>