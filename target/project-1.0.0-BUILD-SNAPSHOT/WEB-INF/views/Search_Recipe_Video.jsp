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
</style>
<body>

	<div class="p-5 mb-2 bg-light text-dark">
		<form class="row row-cols-lg-auto g-3 align-items-center"
			id="search_bar" action="getSearch_video_Main" method="get">
			<div class="col-12">
				<label class="visually-hidden" for="inlineFormInputGroupUsername"></label>
				<div class="input-group">
					<input type="text" class="form-control"
						id="inlineFormInputGroupUsername" placeholder="" name="m_name">
				</div>
			</div>

			<div class="col-12">
				<label class="visually-hidden" for="inlineFormSelectPref">Preference</label>
				<select class="form-select" id="inlineFormSelectPref" name="pageType"> 
					<option  value="조회수순">조회수 순</option>
					<option  value="좋아요순">좋아요 순</option>
					<option  value="최신순">최신 순</option>
				</select>
			</div>
       
			<div class="col-12">
				<button type="submit" class="btn btn-secondary" >Submit</button>
			</div>
			   </form>
	</div>
	
	
	
	<div class="void">
<div class="row row-cols-1 row-cols-md-4 g-4">


<c:forEach var="Search_Video_Main" items="${Search_Video_Mains}">
  <div class="col">
    <div class="card h-100">
        ${Search_Video_Main.m_iframe}
      <div class="card-body">
      	<h5 class="card-title">${Search_Video_Main.m_name }</h5>
        <p class="card-text">
        <a href="${Search_Video_Main.m_url}" target="_blank"><input type="submit" value="Go to Watch Video" class="btn btn-secondary"></a>
        </p>
      </div>
      <div class="card-footer">
      <c:if test="${Search_Video_Main.m_view >= 10000 }">
        <small class="text-muted">조회수 :${Search_Video_Main.m_view / 10000 }만회</small>
      </c:if>
      
      <c:if test="${Search_Video_Main.m_view <= 10000 }">
         <small class="text-muted">조회수 :${Search_Video_Main.m_view }회 </small>
      </c:if>

      </div>
    </div>
  </div>
  </c:forEach>
  
</div>
</div>












</body>
</html>