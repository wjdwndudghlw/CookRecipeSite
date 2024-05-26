<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>키워드로 장소검색하고 목록으로 표출하기</title>
<style>
.map_wrap, .map_wrap * {
	margin: 0;
	padding: 0;
	font-family: 'Malgun Gothic', dotum, '돋움', sans-serif;
	font-size: 20px;
}

.map_wrap a, .map_wrap a:hover, .map_wrap a:active {
	color: #000;
	text-decoration: none;
}

.map_wrap {
	position: relative;
	width: 100%;
	height: 500px;
}

#menu_wrap {
	position: absolute;
	top: 0;
	left: 0;
	width: 600px;
	overflow-y: auto;
	background: rgba(255, 255, 255, 0.7);
	z-index: 1;
	font-size: 12px;
	border-radius: 10px;
}

.bg_white {
	background: #fff;
}

#menu_wrap hr {
	display: block;
	height: 1px;
	border: 0;
	border-top: 2px solid #5F5F5F;
	margin: 3px 0;
}

#map {
	position: absolute;
	left: 0px;
	top: 0px;
}

#menu_wrap {
	position: absolute;
	left: 1230px;
	top: -70px;
	z-index: 999;
}

#search_bar {
	position: absolute;
	right: 30px;
	top: 860px;
}

#list_video {
	position: absolute;
	top: 1000px;
}

input, select {
	height: 45px;
}

.form-select {
	width: 40px;
}

.checkbox {
	width: 30px;
}
</style>
</head>
<body>
	<div class="p-5  mb-2 bg-light text-dark">

<form action="#" onsubmit='return check_Type()'>
		<div class="row row-cols-lg-auto g-3 align-items-center"
			id="search_bar" >

			<input type="checkbox" id=Type1 name="Type" value="무료주차"
				class="checkbox">
			<h4>무료주차</h4>
			<input type="checkbox" id=Type2 name="Type" value="유아의자"
				class="checkbox">
			<h4>유아의자</h4>
			<input type="checkbox" id=Type3 name="Type" value="반려동물"
				class="checkbox">
			<h4>반려동물</h4>
			<input type="checkbox" id=Type4 name="Type" value="채식메뉴"
				class="checkbox">
			<h4>채식메뉴</h4>


			<div class="col-12">
				<button type="submit" class="btn btn-secondary"
					>Submit</button>
			</div>
				
			<div class="col-12">
				<a href="Search_Place2" class="btn btn-secondary"
					>키워드로 검색하기</a>
			</div>
		</div>
	</div>
</form>





	<div class="map_wrap">
		<div id="map" style="width: 100%; height: 600px; overflow: hidden;"></div>
	</div>



	<script type="text/javascript"
		src="http://dapi.kakao.com/v2/maps/sdk.js?appkey=cfbf58e8b2cfb131a87580a36c553b67"></script>
	<script>
		var mapContainer = document.getElementById('map'), // 지도를 표시할 div  
		mapOption = {
			center : new kakao.maps.LatLng(37.2959805, 126.9758547), // 지도의 중심좌표
			level : 3
		// 지도의 확대 레벨
		};

		var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

		function check_Type() {
			var msg = "";
			var checkBoxes = document.getElementsByName("Type");

			for (var i = 0; i < checkBoxes.length; i++) {
				if (checkBoxes[i].checked) {
					msg += (checkBoxes[i].value + "\n");
				}
			}
			if (msg.includes("무료주차") && msg.includes("유아의자") && msg.includes("반려동물") && msg.includes("채식메뉴") ) {
				
			}
			//2번쨰
			else if (msg.includes("무료주차") && msg.includes("유아의자") && msg.includes("반려동물")) {
				//마커를 표시할 위치와 내용을 가지고 있는 객체 배열입니다 
				var positions = [ {
					content : '<div>광안리남매</div>',
					latlng : new kakao.maps.LatLng(35.146716, 129.114074)
				}, {
					content : '<div>그럼피베이비</div>',
					latlng : new kakao.maps.LatLng(33.290804, 126.300704)
				}, {
					content : '<div>브리틀리</div>',
					latlng : new kakao.maps.LatLng(33.450879, 126.569940)
				}, {
					content : '<div>쏭타이</div>',
					latlng : new kakao.maps.LatLng(37.532744,126.99439)
				}, {
					content : '<div>양가형제</div>',
					latlng : new kakao.maps.LatLng(33.307358,126.254021)
				}, {
					content : '<div>유제이스모크하우스</div>',
					latlng : new kakao.maps.LatLng(34.888735,128.694185)
				}, {
					content : '<div>툼브로이</div>',
					latlng : new kakao.maps.LatLng(35.195789,129.20592)
				} ];

				for (var i = 0; i < positions.length; i++) {
					// 마커를 생성합니다
					var marker = new kakao.maps.Marker({
						map : map, // 마커를 표시할 지도
						position : positions[i].latlng
					// 마커의 위치
					});

					// 마커에 표시할 인포윈도우를 생성합니다 
					var infowindow = new kakao.maps.InfoWindow({
						content : positions[i].content
					// 인포윈도우에 표시할 내용
					});

					// 마커에 mouseover 이벤트와 mouseout 이벤트를 등록합니다
					// 이벤트 리스너로는 클로저를 만들어 등록합니다 
					// for문에서 클로저를 만들어 주지 않으면 마지막 마커에만 이벤트가 등록됩니다
					kakao.maps.event.addListener(marker, 'mouseover',
							makeOverListener(map, marker, infowindow));
					kakao.maps.event.addListener(marker, 'mouseout',
							makeOutListener(infowindow));
				}
			}
			
			
			
			
			//3번쨰
			else if (msg.includes("무료주차") && msg.includes("유아의자") && msg.includes("채식메뉴")) {
				
				
				var positions = [ {
					content : '<div>루니코</div>',
					latlng : new kakao.maps.LatLng(35.186676,129.210673)
				}, {
					content : '<div>Deira Restaurant</div>',
					latlng : new kakao.maps.LatLng(35.856048,128.49299)
				}, {
					content : '<div>h"123,37"</div>',
					latlng : new kakao.maps.LatLng(37.381629,126.657917)
				}];

				for (var i = 0; i < positions.length; i++) {
					// 마커를 생성합니다
					var marker = new kakao.maps.Marker({
						map : map, // 마커를 표시할 지도
						position : positions[i].latlng
					// 마커의 위치
					});

					// 마커에 표시할 인포윈도우를 생성합니다 
					var infowindow = new kakao.maps.InfoWindow({
						content : positions[i].content
					// 인포윈도우에 표시할 내용
					});

					// 마커에 mouseover 이벤트와 mouseout 이벤트를 등록합니다
					// 이벤트 리스너로는 클로저를 만들어 등록합니다 
					// for문에서 클로저를 만들어 주지 않으면 마지막 마커에만 이벤트가 등록됩니다
					kakao.maps.event.addListener(marker, 'mouseover',
							makeOverListener(map, marker, infowindow));
					kakao.maps.event.addListener(marker, 'mouseout',
							makeOutListener(infowindow));
				}
			}
			
			
			
			//4번쨰
			else if (msg.includes("반려동물") && msg.includes("유아의자") && msg.includes("채식메뉴")) {
				var positions = [ {
					content : '<div>인디안그릴</div>',
					latlng : new kakao.maps.LatLng(37.564936,126.9237)
				}];

				for (var i = 0; i < positions.length; i++) {

					var marker = new kakao.maps.Marker({
						map : map, 
						position : positions[i].latlng
					});
					var infowindow = new kakao.maps.InfoWindow({
						content : positions[i].content
					});
					kakao.maps.event.addListener(marker, 'mouseover',
							makeOverListener(map, marker, infowindow));
					kakao.maps.event.addListener(marker, 'mouseout',
							makeOutListener(infowindow));
				}
			}
			
			
			//5번쨰
			else if (msg.includes("반려동물") && msg.includes("유아의자")) {
				var positions = [ {
					content : '<div>광안리남매</div>',
					latlng : new kakao.maps.LatLng(35.146716,129.114074)
				},{
					content : '<div>그럼피베이비</div>',
					latlng : new kakao.maps.LatLng(3.290804,126.300704)
				},{
					content : '<div>라이너스 바베큐</div>',
					latlng : new kakao.maps.LatLng(37.533789,126.989682)
				},{
					content : '<div>브리틀리</div>',
					latlng : new kakao.maps.LatLng(34.89716,128.628544)
				},{
					content : '<div>쏭타이</div>',
					latlng : new kakao.maps.LatLng(37.532744,126.99439)
				},{
					content : '<div>양가형제</div>',
					latlng : new kakao.maps.LatLng(33.307358,126.254021)
				},{
					content : '<div>유제이스모크하우스</div>',
					latlng : new kakao.maps.LatLng(34.888735,128.694185)
				},{
					content : '<div>인디안그릴</div>',
					latlng : new kakao.maps.LatLng(37.564936,126.9237)
				},{
					content : '<div>툼브로이</div>',
					latlng : new kakao.maps.LatLng(35.195789,129.20592)
				},{
					content : '<div>퍼햅스투데이</div>',
					latlng : new kakao.maps.LatLng(37.536754,126.999707)
				}];

				for (var i = 0; i < positions.length; i++) {

					var marker = new kakao.maps.Marker({
						map : map, 
						position : positions[i].latlng
					});
					var infowindow = new kakao.maps.InfoWindow({
						content : positions[i].content
					});
					kakao.maps.event.addListener(marker, 'mouseover',
							makeOverListener(map, marker, infowindow));
					kakao.maps.event.addListener(marker, 'mouseout',
							makeOutListener(infowindow));
				}
			}
			
			
			
			
			//6번쨰
			else if (msg.includes("반려동물") && msg.includes("무료주차")) {
				var positions = [ {
					content : '<div>거루캥테이블</div>',
					latlng : new kakao.maps.LatLng(35.186914,129.203753)
				},{
					content : '<div>게리가</div>',
					latlng : new kakao.maps.LatLng(33.263498,126.640829)
				},{
					content : '<div>고메303 바베큐</div>',
					latlng : new kakao.maps.LatLng(35.32255,128.994697)
				},{
					content : '<div>골드홀릭</div>',
					latlng : new kakao.maps.LatLng(37.472142,126.596255)
				},{
					content : '<div>골든타이</div>',
					latlng : new kakao.maps.LatLng(37.514709,127.119435)
				},{
					content : '<div>광안리남매</div>',
					latlng : new kakao.maps.LatLng(35.146716,129.114074)
				},{
					content : '<div>그라치에</div>',
					latlng : new kakao.maps.LatLng(37.558459,126.945622)
				},{
					content : '<div>그럼피베이비</div>',
					latlng : new kakao.maps.LatLng(33.290804,126.300704)
				},{
					content : '<div>그로또</div>',
					latlng : new kakao.maps.LatLng(37.251808,127.078943)
				},{
					content : '<div>김녕함바그집</div>',
					latlng : new kakao.maps.LatLng(33.556844,126.755347)
				},{
					content : '<div>꾸띠 자르당</div>',
					latlng : new kakao.maps.LatLng(37.533448,126.994608)
				},{
					content : '<div>꾸안</div>',
					latlng : new kakao.maps.LatLng(37.285528,127.014703)
				},{
					content : '<div>꾸잉</div>',
					latlng : new kakao.maps.LatLng(37.534855,126.994914)
				},{
					content : '<div>뀌쏭82</div>',
					latlng : new kakao.maps.LatLng(37.481653,127.044772)
				},{
					content : '<div>난산리식당</div>',
					latlng : new kakao.maps.LatLng(33.399126,126.867785)
				},{
					content : '<div>김녕함바그집</div>',
					latlng : new kakao.maps.LatLng(37.536754,126.999707)
				},{
					content : '<div>내니스</div>',
					latlng : new kakao.maps.LatLng(37.397321,127.113562)
				},{
					content : '<div>냠냠</div>',
					latlng : new kakao.maps.LatLng(35.319041,128.988798)
				},{
					content : '<div>누커리</div>',
					latlng : new kakao.maps.LatLng(37.585585,127.093745)
				},{
					content : '<div>다이닝타일드</div>',
					latlng : new kakao.maps.LatLng(37.626109,127.151357)
				},{
					content : '<div>당근과자점</div>',
					latlng : new kakao.maps.LatLng(35.824525,128.637661)
				},{
					content : '<div>띤띤익스프레스</div>',
					latlng : new kakao.maps.LatLng(37.24203,127.400444)
				},{
					content : '<div>라메사</div>',
					latlng : new kakao.maps.LatLng(36.959139,127.042265)
				},{
					content : '<div>리틀방콕 왕십리뉴타운점</div>',
					latlng : new kakao.maps.LatLng(37.56679,127.026125)
				},{
					content : '<div>리틀포포유</div>',
					latlng : new kakao.maps.LatLng(37.526168,126.966894)
				},{
					content : '<div>마마타타</div>',
					latlng : new kakao.maps.LatLng(37.773735,128.878709)
				},{
					content : '<div>마쵸무쵸</div>',
					latlng : new kakao.maps.LatLng(37.609996,127.34929)
				},{
					content : '<div>마켓포</div>',
					latlng : new kakao.maps.LatLng(37.564543,126.912804)
				},{
					content : '<div>마크사이공제주</div>',
					latlng : new kakao.maps.LatLng(33.389246,126.231379)
				}];

				for (var i = 0; i < positions.length; i++) {

					var marker = new kakao.maps.Marker({
						map : map, 
						position : positions[i].latlng
					});
					var infowindow = new kakao.maps.InfoWindow({
						content : positions[i].content
					});
					kakao.maps.event.addListener(marker, 'mouseover',
							makeOverListener(map, marker, infowindow));
					kakao.maps.event.addListener(marker, 'mouseout',
							makeOutListener(infowindow));
				}
			}
			
			
			
			//7번쨰
			else if (msg.includes("유아의자") && msg.includes("무료주차")) {
				var positions = [ {
					content : '<div>가스트로 통</div>',
					latlng : new kakao.maps.LatLng(37.578656,126.972608)
				},{
					content : '<div>광안리남매</div>',
					latlng : new kakao.maps.LatLng(35.146716,129.114074)
				},{
					content : '<div>그랜마스 서귀포직영점</div>',
					latlng : new kakao.maps.LatLng(33.252791,126.510373)
				},{
					content : '<div>그럼피베이비</div>',
					latlng : new kakao.maps.LatLng(33.290804,126.300704)
				},{
					content : '<div>금용문</div>',
					latlng : new kakao.maps.LatLng(37.572771,126.974038)
				},{
					content : '<div>네키드윙즈</div>',
					latlng : new kakao.maps.LatLng(37.533808,126.989409)
				},{
					content : '<div>그라치에</div>',
					latlng : new kakao.maps.LatLng(37.533808,126.989409)
				},{
					content : '<div>다 안토니오 이탈리안 컨템포러리</div>',
					latlng : new kakao.maps.LatLng(37.524979,127.456202)
				},{
					content : '<div>더메콩</div>',
					latlng : new kakao.maps.LatLng(37.560108,126.832082)
				},{
					content : '<div>데판야</div>',
					latlng : new kakao.maps.LatLng(33.304973,126.316352)
				},{
					content : '<div>두에꼬제</div>',
					latlng : new kakao.maps.LatLng(37.534483,127.007518)
				},{
					content : '<div>듀크서프비스트로</div>',
					latlng : new kakao.maps.LatLng(33.25136,126.423964)
				},{
					content : '<div>디마떼오</div>',
					latlng : new kakao.maps.LatLng(37.580019,127.003936)
				},{
					content : '<div>띤띤</div>',
					latlng : new kakao.maps.LatLng(37.567478,126.985151)
				},{
					content : '<div>라벨라치타</div>',
					latlng : new kakao.maps.LatLng(35.150103,129.114849)
				},{
					content : '<div>김녕함바그집</div>',
					latlng : new kakao.maps.LatLng(35.161601,129.187122)
				},{
					content : '<div>라벨라치타</div>',
					latlng : new kakao.maps.LatLng(35.169324,129.196998)
				},{
					content : '<div>레플랑시</div>',
					latlng : new kakao.maps.LatLng(37.498108,127.025923)
				},{
					content : '<div>로리스 더 프라임립</div>',
					latlng : new kakao.maps.LatLng(35.186676,129.210673)
				},{
					content : '<div>루니코</div>',
					latlng : new kakao.maps.LatLng(35.823028,127.123815)
				},{
					content : '<div>마살라</div>',
					latlng : new kakao.maps.LatLng(162292,128.59994)
				},{
					content : '<div>마츠</div>',
					latlng : new kakao.maps.LatLng(33.410815,126.267592)
				},{
					content : '<div>모디카</div>',
					latlng : new kakao.maps.LatLng(36.608743,129.413727)
				},{
					content : '<div>베르데레스토랑</div>',
					latlng : new kakao.maps.LatLng(35.845759,128.591092)
				},{
					content : '<div>벱하노이</div>',
					latlng : new kakao.maps.LatLng(34.89716,128.628544)
				},{
					content : '<div>브리틀리</div>',
					latlng : new kakao.maps.LatLng(37.773735,128.878709)
				},{
					content : '<div>소브레메사</div>',
					latlng : new kakao.maps.LatLng(38.188831,128.590826)
				},{
					content : '<div>선사로길</div>',
					latlng : new kakao.maps.LatLng(37.502731,127.023903)
				},{
					content : '<div>써니사이드</div>',
					latlng : new kakao.maps.LatLng(37.493452,127.13351)
				}];

				for (var i = 0; i < positions.length; i++) {

					var marker = new kakao.maps.Marker({
						map : map, 
						position : positions[i].latlng
					});
					var infowindow = new kakao.maps.InfoWindow({
						content : positions[i].content
					});
					kakao.maps.event.addListener(marker, 'mouseover',
							makeOverListener(map, marker, infowindow));
					kakao.maps.event.addListener(marker, 'mouseout',
							makeOutListener(infowindow));
				}
			}
			
			
			
			
			//8번쨰
			else if (msg.includes("유아의자") && msg.includes("채식메뉴")) {
				var positions = [ {
					content : '<div>가스트로 통</div>',
					latlng : new kakao.maps.LatLng(37.578656,126.972608)
				},{
					content : '<div>광안리남매</div>',
					latlng : new kakao.maps.LatLng(35.146716,129.114074)
				},{
					content : '<div>그랜마스 서귀포직영점</div>',
					latlng : new kakao.maps.LatLng(33.252791,126.510373)
				},{
					content : '<div>그럼피베이비</div>',
					latlng : new kakao.maps.LatLng(33.290804,126.300704)
				},{
					content : '<div>금용문</div>',
					latlng : new kakao.maps.LatLng(37.572771,126.974038)
				},{
					content : '<div>네키드윙즈</div>',
					latlng : new kakao.maps.LatLng(37.533808,126.989409)
				},{
					content : '<div>그라치에</div>',
					latlng : new kakao.maps.LatLng(37.533808,126.989409)
				},{
					content : '<div>다 안토니오 이탈리안 컨템포러리</div>',
					latlng : new kakao.maps.LatLng(37.524979,127.456202)
				},{
					content : '<div>더메콩</div>',
					latlng : new kakao.maps.LatLng(37.560108,126.832082)
				},{
					content : '<div>데판야</div>',
					latlng : new kakao.maps.LatLng(33.304973,126.316352)
				},{
					content : '<div>두에꼬제</div>',
					latlng : new kakao.maps.LatLng(37.534483,127.007518)
				},{
					content : '<div>듀크서프비스트로</div>',
					latlng : new kakao.maps.LatLng(33.25136,126.423964)
				},{
					content : '<div>디마떼오</div>',
					latlng : new kakao.maps.LatLng(37.580019,127.003936)
				},{
					content : '<div>띤띤</div>',
					latlng : new kakao.maps.LatLng(37.567478,126.985151)
				},{
					content : '<div>라벨라치타</div>',
					latlng : new kakao.maps.LatLng(35.150103,129.114849)
				},{
					content : '<div>김녕함바그집</div>',
					latlng : new kakao.maps.LatLng(35.161601,129.187122)
				},{
					content : '<div>라벨라치타</div>',
					latlng : new kakao.maps.LatLng(35.169324,129.196998)
				},{
					content : '<div>레플랑시</div>',
					latlng : new kakao.maps.LatLng(37.498108,127.025923)
				},{
					content : '<div>로리스 더 프라임립</div>',
					latlng : new kakao.maps.LatLng(35.186676,129.210673)
				},{
					content : '<div>루니코</div>',
					latlng : new kakao.maps.LatLng(35.823028,127.123815)
				},{
					content : '<div>마살라</div>',
					latlng : new kakao.maps.LatLng(162292,128.59994)
				},{
					content : '<div>마츠</div>',
					latlng : new kakao.maps.LatLng(33.410815,126.267592)
				},{
					content : '<div>모디카</div>',
					latlng : new kakao.maps.LatLng(36.608743,129.413727)
				},{
					content : '<div>베르데레스토랑</div>',
					latlng : new kakao.maps.LatLng(35.845759,128.591092)
				},{
					content : '<div>벱하노이</div>',
					latlng : new kakao.maps.LatLng(34.89716,128.628544)
				},{
					content : '<div>브리틀리</div>',
					latlng : new kakao.maps.LatLng(37.773735,128.878709)
				},{
					content : '<div>소브레메사</div>',
					latlng : new kakao.maps.LatLng(38.188831,128.590826)
				},{
					content : '<div>선사로길</div>',
					latlng : new kakao.maps.LatLng(37.502731,127.023903)
				},{
					content : '<div>써니사이드</div>',
					latlng : new kakao.maps.LatLng(37.493452,127.13351)
				}];

				for (var i = 0; i < positions.length; i++) {

					var marker = new kakao.maps.Marker({
						map : map, 
						position : positions[i].latlng
					});
					var infowindow = new kakao.maps.InfoWindow({
						content : positions[i].content
					});
					kakao.maps.event.addListener(marker, 'mouseover',
							makeOverListener(map, marker, infowindow));
					kakao.maps.event.addListener(marker, 'mouseout',
							makeOutListener(infowindow));
				}
			}
			
			
			
			//9번쨰
			else if (msg.includes("유아의자")) {
				var positions = [ {
					content : '<div>가스트로 통</div>',
					latlng : new kakao.maps.LatLng(37.578656,126.972608)
				},{
					content : '<div>광안리남매</div>',
					latlng : new kakao.maps.LatLng(35.146716,129.114074)
				},{
					content : '<div>그랜마스 서귀포직영점</div>',
					latlng : new kakao.maps.LatLng(33.252791,126.510373)
				},{
					content : '<div>그럼피베이비</div>',
					latlng : new kakao.maps.LatLng(33.290804,126.300704)
				},{
					content : '<div>금용문</div>',
					latlng : new kakao.maps.LatLng(37.572771,126.974038)
				},{
					content : '<div>네키드윙즈</div>',
					latlng : new kakao.maps.LatLng(37.533808,126.989409)
				},{
					content : '<div>그라치에</div>',
					latlng : new kakao.maps.LatLng(37.533808,126.989409)
				},{
					content : '<div>다 안토니오 이탈리안 컨템포러리</div>',
					latlng : new kakao.maps.LatLng(37.524979,127.456202)
				},{
					content : '<div>더메콩</div>',
					latlng : new kakao.maps.LatLng(37.560108,126.832082)
				},{
					content : '<div>데판야</div>',
					latlng : new kakao.maps.LatLng(33.304973,126.316352)
				},{
					content : '<div>두에꼬제</div>',
					latlng : new kakao.maps.LatLng(37.534483,127.007518)
				},{
					content : '<div>듀크서프비스트로</div>',
					latlng : new kakao.maps.LatLng(33.25136,126.423964)
				},{
					content : '<div>디마떼오</div>',
					latlng : new kakao.maps.LatLng(37.580019,127.003936)
				},{
					content : '<div>띤띤</div>',
					latlng : new kakao.maps.LatLng(37.567478,126.985151)
				},{
					content : '<div>라벨라치타</div>',
					latlng : new kakao.maps.LatLng(35.150103,129.114849)
				},{
					content : '<div>김녕함바그집</div>',
					latlng : new kakao.maps.LatLng(35.161601,129.187122)
				},{
					content : '<div>라벨라치타</div>',
					latlng : new kakao.maps.LatLng(35.169324,129.196998)
				},{
					content : '<div>레플랑시</div>',
					latlng : new kakao.maps.LatLng(37.498108,127.025923)
				},{
					content : '<div>로리스 더 프라임립</div>',
					latlng : new kakao.maps.LatLng(35.186676,129.210673)
				},{
					content : '<div>루니코</div>',
					latlng : new kakao.maps.LatLng(35.823028,127.123815)
				},{
					content : '<div>마살라</div>',
					latlng : new kakao.maps.LatLng(162292,128.59994)
				},{
					content : '<div>마츠</div>',
					latlng : new kakao.maps.LatLng(33.410815,126.267592)
				},{
					content : '<div>모디카</div>',
					latlng : new kakao.maps.LatLng(36.608743,129.413727)
				},{
					content : '<div>베르데레스토랑</div>',
					latlng : new kakao.maps.LatLng(35.845759,128.591092)
				},{
					content : '<div>벱하노이</div>',
					latlng : new kakao.maps.LatLng(34.89716,128.628544)
				},{
					content : '<div>브리틀리</div>',
					latlng : new kakao.maps.LatLng(37.773735,128.878709)
				},{
					content : '<div>소브레메사</div>',
					latlng : new kakao.maps.LatLng(38.188831,128.590826)
				},{
					content : '<div>선사로길</div>',
					latlng : new kakao.maps.LatLng(37.502731,127.023903)
				},{
					content : '<div>써니사이드</div>',
					latlng : new kakao.maps.LatLng(37.493452,127.13351)
				}];

				for (var i = 0; i < positions.length; i++) {

					var marker = new kakao.maps.Marker({
						map : map, 
						position : positions[i].latlng
					});
					var infowindow = new kakao.maps.InfoWindow({
						content : positions[i].content
					});
					kakao.maps.event.addListener(marker, 'mouseover',
							makeOverListener(map, marker, infowindow));
					kakao.maps.event.addListener(marker, 'mouseout',
							makeOutListener(infowindow));
				}
			}

			alert(msg);

		}
		
		
		
		
		


		//인포윈도우를 표시하는 클로저를 만드는 함수입니다 
		function makeOverListener(map, marker, infowindow) {
			return function() {
				infowindow.open(map, marker);
			};
		}

		//인포윈도우를 닫는 클로저를 만드는 함수입니다 
		function makeOutListener(infowindow) {
			return function() {
				infowindow.close();
			};
		}
	</script>
</body>
</html>