<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <!-- Bootstrap core CSS -->
    <link href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    
</head>
<style>
.page-item {
	position: relative;
	width: 50px;
	top: 11px;
}
.Classification{
position:relative;
left:10px;
font-size:20px;
top:6px;
}
.col{
position:relative;
top:-8px;
}
.number{
position:absolute;
left:1550px;
top:855px;
z-index:99;
}
</style>
<body>


 
  
  
  
  
  
  
  
  
  
  
  
  
  
  

	<div class="row row-cols-1 row-cols-md-5 g-4">
	<c:forEach var="Diet_Recipe" items="${Diet_Recipe}">
       <form action="Diet_Recipe_Detail" method="get">
 
 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Diet_Recipe.m_name}">
<input type="hidden" name="u_m_img_url" value="${Diet_Recipe.m_img_url}">
<input type="hidden" name="u_m_view" value="${Diet_Recipe.m_view}">
<input type="hidden" name="u_m_url" value="${Diet_Recipe.m_url}">


			<div class="col">
				<div class="card h-100">
					<img src="${Diet_Recipe.m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Diet_Recipe.m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Diet_Recipe.m_view} </small> 
						<input type="hidden"  name="m_url" id="m_url"
						value="${Diet_Recipe.m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	  </form>
	  </c:forEach>
	</div>
	


</body>
</html>