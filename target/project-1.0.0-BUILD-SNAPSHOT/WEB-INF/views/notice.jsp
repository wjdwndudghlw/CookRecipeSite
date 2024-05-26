<%@page import="com.lee.project.Notice.Notice"%>
<%@page import="java.util.List"%>
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
<meta charset="UTF-8">
<title>Insert title here</title>
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
	<!-- ***** Preloader End ***** -->

	<!-- ***** Header Area Start ***** -->
	<header class="header-area header-sticky wow slideInDown"
		data-wow-duration="0.75s" data-wow-delay="0s">
		<div class="container">
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
							<li><a href="Manager" class=""><img
									src="resources/img/manager.png"
									style="width: 30px; height: 30px">&nbsp; 관리자</a></li>
							<li><div class="main-white-button">
									<a href="login_signUp"><i class="fa fa-plus"></i>로그인/ 회원가입</a>
								</div></li>



						</ul>
						<%
							} else if (userID != null && ManagerID == null) {
						%>

						<li><a href="#" class="active">추천 레시피</a></li>
						<li><a href="search_history_Page?u_name=${userID}">검색 기록
								확인</a></li>
						<li><a href="book_Mark_Page?u_name=${userID}">즐겨찾기</a></li>
						<li><a href="#" class="active"><img
								src="resources/img/manager.png"
								style="width: 30px; height: 30px">&nbsp; 관리자</a></li>
						<li><div class="main-white-button">
								<a href="logoutAction"><i class="fa fa-plus"></i>로그아웃</a>
							</div></li>




						</ul>
						<%
							} else {
						%>
						<li><a href="#" class="active">추천 레시피</a></li>
						<li><a href="#" class="active">검색 기록 확인</a></li>
						<li><a href="#" class="active">즐겨찾기</a></li>
						<li><a href="#" class=""><img
								src="resources/img/manager.png"
								style="width: 30px; height: 30px">&nbsp; 관리자</a></li>
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

	<div class="listing-page">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="naccs">
						<div class="grid">
							<div class="row">
								<div class="col-lg-3">
									<div class="menu">

										<div class="first-thumb active">
											<div class="thumb">
												<a href="notice1"><span class="icon"><img
														src="resources/assets/images/search-icon-04.png" alt=""></span></a>
												공지
											</div>
										</div>


										<div>
											<div class="thumb">
												<a href="board1"><span class="icon"><img
														src="resources/assets/images/search-icon-02.png" alt=""></span></a>
												자유 게시판
											</div>
										</div>

										<div>
											<div class="thumb">
												<a href="Main"><span class="icon"><img
														src="resources/assets/images/search-icon-01.png" alt=""></span></a>
												메인
											</div>
										</div>

										<div>
											<div class="thumb">
												<a href="getSearch_video_Main_first"><span class="icon"><img
														src="resources/assets/images/search-icon-03.png" alt=""></span></a>
												영상 검색
											</div>
										</div>
										<div class="last-thumb">
											<div class="thumb">
												<a href="Search_Place"><span class="icon"><img
														src="resources/assets/images/search-icon-05.png" alt=""></span></a>
												지도 검색
											</div>
										</div>
									</div>
								</div>
								<div class="col-lg-9">
									<ul class="nacc" style="height: 100px">
										<!-- first category listing of items -->
										<li class="active" style="height: 100px">
											<div class="card mb-3">
												<div class="card-header">
													<i class="fa fa-bar-chart"></i> 공지
													<div class="card-body">
														<div class="table-responsive">
															<div class="col-lg-12">
																<div class="item">
																	<%
																		if (ManagerID != null) {
																	%>
																	<form action="WriteBoard">
																		<input type="submit" value="글 작성하기"
																			class="btn btn-secondary">
																	</form>
																	<%
																		}
																	%>
																	<c:forEach items="${DetailManagerpage }"
																		var="DetailManager">

																		<div class="row">
																			<div class="col-lg-12">
																				<div class="listing-item">
																					<div class="left-image">
																						<img
																							src="<c:out value="${DetailManager.noticeImgUrl }"/>"
																							onerror="this.src='resources/assets/images/listing-04.jpg'"
																							style="height: 170px"></a>
																						<div class="hover-content">
																							<div class="main-white-button">
																								<a
																									href="<c:url value="/Notice/${DetailManager.m_no }"/>"><i
																									class="fa fa-eye"></i>+</a>
																							</div>
																						</div>
																					</div>
																					<div class="right-content" style="height: 170px">
																						<a href="#"><h4>
																								제목:
																								<c:out value="${DetailManager.m_title }" />
																							</h4></a>
																						<h6>
																							작성자:
																							<c:out value="${DetailManager.m_name }" />
																						</h6>
																						<p>
																							작성 시간:
																							<c:out value="${DetailManager.m_date }" />
																						</p>




																					</div>
																				</div>
																			</div>
																		</div>
																	</c:forEach>


																</div>
															</div>
														</div>
													</div>
													<div style="text-align: center;">
														<c:set var="totalPages"
															value="${Math.ceil(DetailManager.size() / 5)}" />
														<c:set var="startPage" value="${page - 2}" />
														<c:set var="endPage" value="${page + 2}" />

														<c:if test="${totalPages <= 5}">
															<c:set var="startPage" value="1" />
															<c:set var="endPage" value="${totalPages}" />
														</c:if>
														<c:if test="${page > 3 && totalPages > 5}">
															<c:set var="startPage" value="${page - 2}" />
															<c:set var="endPage" value="${page + 2}" />
														</c:if>
														<c:if test="${endPage > totalPages}">
															<c:set var="startPage" value="${totalPages - 4}" />
															<c:set var="endPage" value="${totalPages}" />
														</c:if>
														<c:if test="${startPage < 1}">
															<c:set var="startPage" value="1" />
														</c:if>

														<a href="notice1"> < </a>
														<c:forEach var="i" begin="${startPage}" end="${endPage}"
															step="1">
															<c:if test="${i <= totalPages}">
																<a href="notice${i}">${i}</a>
															</c:if>
														</c:forEach>
														<a href="notice${totalPages}"> > </a>
										</li>
								</div>
							</div>
						</div>
					</div>
					<!-- /Card Columns-->

				</div>
			</div>
		</div>
	</div>


	<!-- Scripts -->

	<script src="resources/vendor/jquery/jquery.min.js"></script>
	<script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="resources/assets/js/owl-carousel.js"></script>
	<script src="resources/assets/js/animation.js"></script>
	<script src="resources/assets/js/imagesloaded.js"></script>
	<script src="resources/assets/js/custom.js"></script>

</body>
</html>