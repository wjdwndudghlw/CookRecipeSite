<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
#ingredient{
position:absolute;
left:1200px;
top:1000px;
}
#ingredient1{
position:absolute;
left:1500px;
top:1000px;
}
#Text{
font-size:13pt;
}
</style>
<body>


	<%
		String userID = null;
		if (session.getAttribute("userID") != null) {
			userID = (String) session.getAttribute("userID");
		}
	%>



  
  
  <div class="p-3 mb-2 bg-light text-dark">

<nav class="Classification" style="--bs-breadcrumb-divider: '>';" aria-label="breadcrumb">
  <ol class="breadcrumb">
    <li class="breadcrumb-item "><a href="#">전체</a></li>
    <li class="breadcrumb-item active" aria-current="page">디저트</li>
    <li class="breadcrumb-item active" aria-current="page">요리 설명</li>
  </ol>
</nav>
  </div>





<form action="book_Mark" method="GET">
<input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Desert_Recipe_Mainimage[0].m_name}">
<input type="hidden" name="u_m_img_url" value="${Desert_Recipe_Mainimage[0].m_img_url}">
<input type="hidden" name="u_m_view" value="${Desert_Recipe_Mainimage[0].m_view}">
<input type="hidden" name="u_m_url" value="${Desert_Recipe_Mainimage[0].m_url}">




<div id="Text">
<div class="card mb-3 col col-md-6  border border-5">
  <img src="${Desert_Recipe_Mainimage[0].m_img_url}" class="card-img-top" alt="..." style="height:500px">
  <div class="card-body">
    <h5 class="card-title" style="font-size:15pt;">Making delicious Food</h5>
    <p class="card-text" style="font-size:15pt;">${Desert_Recipe_Mainimage[0].m_name}</p>
    <p class="card-text"><small class="text-muted" style="font-size:15pt;"
							
							>조회수 : ${Desert_Recipe_Mainimage[0].m_view} &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
    			<%
				   if (userID != null) {
				%>
<input type="submit" value="즐겨찾기" class="btn btn-secondary"><img src="resources/img/star.png" style="width:40px;height:40px"></small></p>

       <%
			 }
        %>
  </div>
</div>
</form>



<div class="card text-bg-primary mb-3"  style="max-width: 30rem; height:30rem"  id="ingredient">
  <div class="card-header">레시피 재료 </div>
  <div class="card-body text-secondary">
    <h5 class="card-title">재료 이름  &emsp; 재료 수량</h5>
    <c:forEach var="i" items="${Desert_Recipe_ingredient}">
    <div class="card-text" style="height:1.1rem">${i.i_ingredient}  &emsp;&emsp;&emsp;&emsp; ${i.i_ingredient_dose} </div>
    </c:forEach>
  </div>
  </div>
  
  
  <div class="card text-bg-primary mb-3" style="max-width: 30rem; height:30rem" id="ingredient1" >
  <div class="card-header">레시피 소개</div>
  <div class="card-body text-secondary">
    <h5 class="card-title">Secondary card title</h5>
  
    <div class="card-text"><img src="resources/img/clock.png" style="width:70px;height:70px">&emsp; ${Desert_Recipe_introduce[0].i_time}</div><p>
    <div class="card-text"><img src="resources/img/hot-food.png" style="width:70px;height:70px">&emsp;${Desert_Recipe_introduce[0].i_servings } </div><p>
    <div class="card-text"><img src="resources/img/level-up.png" style="width:70px;height:70px"> &emsp;${Desert_Recipe_introduce[0].i_level } </div>

  </div>
  </div>
</div>





<div class="row row-cols-1 row-cols-md-3 g-4">
<c:forEach var="s" items="${ Desert_Recipe_seqence}" varStatus="status">
  <div class="col">
    <div class="card ">
      <img src="${s.s_img}" class="card-img-top" alt="..." style="height:400px">
      <div class="card-body">
        <h5 class="card-title">요리 순서 :${status.count }번</h5>
        <p class="card-text">${s.s_seq}</p> 
    </div>
  </div>
  </div>
  </c:forEach>
  </div>
  
  
</body>
</html>