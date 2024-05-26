<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="java.net.URLEncoder" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
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

<title>food Website Template</title>

<!-- Bootstrap core CSS -->
<link href="resources/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Additional CSS Files -->
<link rel="stylesheet" href="resources/assets/css/fontawesome.css">
<link rel="stylesheet"
	href="resources/assets/css/templatemo-plot-listing.css">
<link rel="stylesheet" href="resources/assets/css/animated.css">
<link rel="stylesheet" href="resources/assets/css/owl.css">
<!--

TemplateMo 564 Plot Listing

https://templatemo.com/tm-564-plot-listing

-->
</head>
<script>
function check_level() {

	var Search_Type  = document.getElementById("chooseCategory1");
	var Search_Level  = document.getElementById("chooseCategory2");
	

	var Search_Type_value = (Search_Type.options[Search_Type.selectedIndex].value);
	var Search_Level_value = (Search_Level.options[Search_Level.selectedIndex].value);
	//alert("value = "+Search_value);
	
	if (Search_Type_value === "Desert" && Search_Level_value ==="중급" ) {
		alert("디저트는 아직 중급 이상의 레시피가 없습니다")
		return false;
	}
	else if (Search_Type_value === "Speed"   && Search_Level_value ==="중급" ) {
		alert("초스피드는 아직 중급 이상의 레시피가 없습니다")
		return false;
	}
}



function check_login() {

	var Login_Check_ID  = document.getElementById("Login_Check_ID").value;

	
    alert(Login_Check_ID)

	//alert("value = "+Search_value);
	
	if (Search_Type_value === "Desert" && Search_Level_value ==="중급" ) {
		alert("디저트는 아직 중급 이상의 레시피가 없습니다")
		return false;
	}
	else if (Search_Type_value === "Speed"   && Search_Level_value ==="중급" ) {
		alert("초스피드는 아직 중급 이상의 레시피가 없습니다")
		return false;
	}
}
</script>
<style>
a{
  text-decoration: none;
}

#top_container{
position:absolute;
left:200px;
}
</style>
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

    <input type="hidden" id="Login_Check_ID" value="${userID }">
	<!-- ***** Preloader Start ***** -->
	<div id="js-preloader" class="js-preloader">
		<div class="preloader-inner">
			<span class="dot"></span>
			<div class="dots">
				<span></span> <span></span> <span></span>
			</div>
		</div>
	</div>
	<!-- ***** Preloader End ***** -->

	<!-- ***** Header Area Start ***** -->
	<header class="header-area header-sticky wow slideInDown"
		data-wow-duration="0.75s" data-wow-delay="0s">
		<div class="container" id="top_container">
			<div class="row">
				<div class="col-12">
					<nav class="main-nav" style="float: middle;">
						<!-- ***** Menu Start ***** -->
						<ul class="nav">
							<%
								if (userID == null && ManagerID == null) {
							%>
							<li><a href="#" class="active">추천 레시피</a></li>
							<li><a href="#" class="active">검색 기록 확인</a></li>
							<li><a href="#" class="active">즐겨찾기</a></li>
							<li><a href="Manager" class=""><img src="resources/img/manager.png" style="width:30px; height:30px">&nbsp;  관리자</a></li>
							<li><div class="main-white-button">
									<a href="login_signUp"><i class="fa fa-plus"></i>로그인/ 회원가입</a>
								</div></li>
								
							

						</ul>
						<%
							} else if(userID != null && ManagerID == null) {
						%>
						
						<li><a href="#" class="active">추천 레시피</a></li>
						<li><a href="search_history_Page?u_name=${userID}">검색 기록 확인</a></li>
						<li><a href="book_Mark_Page?u_name=${userID}">즐겨찾기</a></li>
						<li><a href="#" class="active"><img src="resources/img/manager.png" style="width:30px; height:30px">&nbsp;  관리자</a></li>
						<li><div class="main-white-button">
								<a href="logoutAction"><i class="fa fa-plus"></i>로그아웃</a>
							</div></li>
							
						
						

						</ul>
						<%
							}  else {
						%>
							<li><a href="#" class="active">추천 레시피</a></li>
							<li><a href="#" class="active">검색 기록 확인</a></li>
							<li><a href="#" class="active">즐겨찾기</a></li>
							<li><a href="#" class=""><img src="resources/img/manager.png" style="width:30px; height:30px">&nbsp;  관리자</a></li>
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


	<div class="main-banner">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="top-text header-text">
						<h6>다양한 레시피가 있습니다.</h6>
						<h2>Find Recipe</h2>
					</div>
				</div>
				<div class="col-lg-12">
					<form id="search-form" name="gs" method="get" role="search"
						action="Recipe_Search" >
						<div class="row">
							<div class="col-lg-3 align-self-center">
								<fieldset>
									<select name="Food_Type" class="form-select"
										aria-label="Default select example"
										id="chooseCategory1"  >
										<option  selected value="All">전체</option>
										<option  value="Desert">디저트</option>
										<option  value="Speed">초스피드</option>
										<option  value="Night">술안주</option>
										<option  value="Diet">다이어트</option>
										<option  value="Guest">손님접대</option>
									</select>
								</fieldset>
							</div>
							<div class="col-lg-3 align-self-center">
								<fieldset>
									<input name="m_name" class="searchText" placeholder="음식 이름"
										autocomplete="on">
								</fieldset>
							</div>
							<div class="col-lg-3 align-self-center">
								<fieldset>
									<select name="m_level" class="form-select"
										aria-label="Default select example" id="chooseCategory2"
										>
										<option value="all">Food level (All)</option>
										<option value="아무나">Food level (1)</option>
										<option value="초급">Food level (2)</option>
										<option value="중급">Food level (3)</option>
									</select>
								</fieldset>
							</div>
							<div class="col-lg-3">
								<fieldset>
									<button class="main-button" type="submit" value="submit" onclick="return check_level()">
										<i class="fa fa-search" ></i> Search Now
									</button>
								</fieldset>
							</div>
						</div>
					</form>
				</div>
				<div class="col-lg-10 offset-lg-1">
					<ul class="categories">
						<li><a href="Main"><span class="icon"><img
									src="resources/assets/images/search-icon-01.png" alt="Home"></span>
								Home</a></li>
						<li><a href="board1"><span class="icon"><img
									src="resources/assets/images/search-icon-02.png" alt="Food"></span>
								Board </a></li>
						<li><a href="getSearch_video_Main_first"><span class="icon"><img
									src="resources/assets/images/search-icon-03.png" alt="Vehicle"></span>Video</a></li>
						<li><a href="#"><span class="icon"><img
									src="resources/assets/images/search-icon-04.png" alt="Shopping"></span>
								Shopping</a></li>
						<li><a href="Search_Place"><span class="icon"><img
									src="resources/assets/images/search-icon-05.png" alt="Travel"></span>
								Traveling</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>






	<jsp:include page="${cp }" />
































	<div class="popular-categories">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="section-heading">
						<h2>게시판 & 공지</h2>
						<h6>회원들과 자유롭게 소통하세요</h6>
					</div>
				</div>
				<div class="col-lg-12">
					<div class="naccs">
						<div class="grid">
							<div class="row">
								<div class="col-lg-3">
									<div class="menu">
										<div class="first-thumb active">
											<div class="thumb">
												<span class="icon"><img
													src="resources/assets/images/search-icon-01.png" alt=""></span>
												공지
											</div>
										</div>
										<div>
											<div class="thumb">
												<span class="icon"><img
													src="resources/assets/images/search-icon-02.png" alt=""></span>
												자유 게시판
											</div>
										</div>
										<div>
											<div class="thumb">
											
												<span class="icon"><img
									src="resources/assets/images/search-icon-03.png" alt="Vehicle"></span>영상 검색
												
											</div>
										</div>
										<div>
											<div class="thumb">
												<span class="icon"><img
													src="resources/assets/images/search-icon-04.png" alt=""></span>
												쇼핑
											</div>
										</div>
										<div class="last-thumb">
											<div class="thumb">
												<span class="icon"><img
													src="resources/assets/images/search-icon-05.png" alt=""></span>
												지도 검색
											</div>
										</div>
									</div>
								</div>
								<div class="col-lg-9 align-self-center">
									<ul class="nacc">
										<li class="active">
											<div>
												<div class="thumb">
													<div class="row">
														<div class="col-lg-5 align-self-center">
															<div class="left-text">
																<h4>최근 공지</h4>
																<p>다양한 공지를 보실수있습니다.</p>
																<div class="main-white-button">
																	<a href="notice1"><i class="fa fa-eye"></i> 공지 더보러가기</a>
																</div>
															</div>
														</div>
														<div class="col-lg-7 align-self-center">
															<div class="right-image">
																<img src="resources/assets/images/tabs-image-01.jpg"
																	alt="">
															</div>
														</div>
													</div>
												</div>
											</div>
										</li>
										<li>
											<div>
												<div class="thumb">
													<div class="row">
														<div class="col-lg-5 align-self-center">
															<div class="left-text">
																<h4>게시판</h4>
																<p>회원가입을 하고 다양한 글을 작성해보세요</p>
																<div class="main-white-button">
																	<a href="board1"><i class="fa fa-eye"></i> 게시판 가기</a>
																</div>
															</div>
														</div>
														<div class="col-lg-7 align-self-center">
															<div class="right-image">
																<img src="resources/assets/images/tabs-image-02.jpg"
																	alt="Foods on the table">
															</div>
														</div>
													</div>
												</div>
											</div>
										</li>
										<li>
											<div>
												<div class="thumb">
													<div class="row">
														<div class="col-lg-5 align-self-center">
															<div class="left-text">
																<h4>동영상으로 레시피를 보고 싶으시다면?</h4>
																<p>더 많은 레시피 정보를 영상으로 확인하고 싶으시다면 
																클릭하셔서 본인이 원하는 정보를 얻어보세요!
											</p>
																<div class="main-white-button">
																	<a href="getSearch_video_Main_first"><i class="fa fa-eye"></i>
																		More Watching</a>
																</div>
															</div>
														</div>
														<div class="col-lg-7 align-self-center">
															<div class="right-image">
																<img src="resources/assets/images/tabs-image-03.jpg"
																	alt="cars in the city">
															</div>
														</div>
													</div>
												</div>
											</div>
										</li>
										<li>
											<div>
												<div class="thumb">
													<div class="row">
														<div class="col-lg-5 align-self-center">
															<div class="left-text">
																<h4>Shopping List: Images from Unsplash</h4>
																<p>Image credits go to Unsplash website that
																	provides free stock photos for anyone. Images used in
																	this Plot Listing template are from Unsplash.</p>
																<div class="main-white-button">
																	<a href="#"><i class="fa fa-eye"></i> Discover More</a>
																</div>
															</div>
														</div>
														<div class="col-lg-7 align-self-center">
															<div class="right-image">
																<img src="resources/assets/images/tabs-image-04.jpg"
																	alt="Shopping Girl">
															</div>
														</div>
													</div>
												</div>
											</div>
										</li>
										<li>
											<div>
												<div class="thumb">
													<div class="row">
														<div class="col-lg-5 align-self-center">
															<div class="left-text">
																<h4>원하는 맛집을 탐색하고 계신가요?</h4>
																<p>지도로 검색해서 본인이 원하는 정보를 간편하고 손쉽게 얻어가세요</p>
																<div class="main-white-button">
																	<a rel="" href="Search_Place"><i
																		class="fa fa-eye"></i> Search More</a>
																</div>
															</div>
														</div>
														<div class="col-lg-7 align-self-center">
															<div class="right-image">
																<img src="resources/assets/images/tabs-image-05.jpg"
																	alt="Traveling Beach">
															</div>
														</div>
													</div>
												</div>
											</div>
										</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>





	<footer>
		<div class="container">
			<div class="row">
				<div class="col-lg-4">
					<div class="about">
						<div class="logo">
							<img src="resources/assets/images/black-logo.png"
								alt="Plot Listing">
						</div>
						<p>
							If you consider that <a rel="nofollow"
								href="https://templatemo.com/tm-564-plot-listing"
								target="_parent">Plot Listing template</a> is useful for your
							website, please <a rel="nofollow"
								href="https://www.paypal.me/templatemo" target="_blank">support
								us</a> a little via PayPal.
						</p>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="helpful-links">
						<h4>Helpful Links</h4>
						<div class="row">
							<div class="col-lg-6 col-sm-6">
								<ul>
									<li><a href="#">Categories</a></li>
									<li><a href="#">Reviews</a></li>
									<li><a href="#">Listing</a></li>
									<li><a href="#">Contact Us</a></li>
								</ul>
							</div>
							<div class="col-lg-6">
								<ul>
									<li><a href="#">About Us</a></li>
									<li><a href="#">Awards</a></li>
									<li><a href="#">Useful Sites</a></li>
									<li><a href="#">Privacy Policy</a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="contact-us">
						<h4>Contact Us</h4>
						<p>27th Street of New Town, Digital Villa</p>
						<div class="row">
							<div class="col-lg-6">
								<a href="#">010-020-0340</a>
							</div>
							<div class="col-lg-6">
								<a href="#">090-080-0760</a>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-12">
					<div class="sub-footer">
						<p>
							Copyright © 2021 Plot Listing Co., Ltd. All Rights Reserved. <br>
							Design: <a rel="nofollow" href="https://templatemo.com"
								title="CSS Templates">TemplateMo</a>
						</p>
					</div>
				</div>
			</div>
		</div>
	</footer>




	<!-- Scripts -->
	<script src="resources/vendor/jquery/jquery.min.js"></script>
	<script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="resources/assets/js/owl-carousel.js"></script>
	<script src="resources/assets/js/animation.js"></script>
	<script src="resources/assets/js/imagesloaded.js"></script>
	<script src="resources/assets/js/custom.js"></script>

</body>

</html>
