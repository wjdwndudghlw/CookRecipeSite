<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Bootstrap core CSS -->
<link href="resources/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

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



  
  
  
  
  
  

<div class="p-3 mb-2 bg-light text-dark">

<nav class="Classification" style="--bs-breadcrumb-divider: '>';" aria-label="breadcrumb">
  <ol class="breadcrumb">
    <li class="breadcrumb-item "><a href="#">전체</a></li>
    <c:forEach var="book_Mark" items="${book_Marks}"  begin="0" end="0">
       <li class="breadcrumb-item active "><a href="#">${book_Mark.u_name } 님</a></li>
    </c:forEach>
    <li class="breadcrumb-item active" aria-current="page">즐겨찾기 : ${book_mark_Count } 개</li>
  </ol>
</nav>
<nav aria-label="Page navigation example">
</nav>
</div>

<div class="number">
  <ul class="pagination">
    <li class="page-item">
  	<form action="book_Mark_Page_number" method="get">
        <input type="hidden" name="u_name" value="${userID}">
  	<c:if test="${book_mark_Count >125}">
      <a class="page-link" href="book_Mark_Page_number?pageNO=1" aria-label="Previous">
        <span aria-hidden="true bg-secondary">&laquo;</span>
      </a>
      </c:if>
    </li>
    <c:if test="${book_mark_Count >25 }">
    <li class="page-item "><input type="submit" name="pageNO" value="1" class="page-link" /></li>
   </c:if>
   <c:if test="${book_mark_Count >25 }">
    <li class="page-item "><input type="submit" name="pageNO" value="2" class="page-link" /></li>
     </c:if>
    
     <c:if test="${book_mark_Count >50 }">
    <li class="page-item "><input type="submit" name="pageNO" value="3" class="page-link" /></li>
      </c:if>
     	
     	<c:if test="${book_mark_Count >75 }">
    <li class="page-item "><input type="submit" name="pageNO" value="4" class="page-link" /></li>
        </c:if>

       <c:if test="${book_mark_Count >100 }">
    <li class="page-item "><input type="submit" name="pageNO" value="5" class="page-link" /></li>
       </c:if>
    <li class="page-item">
    <c:if test="${book_mark_Count > 125 }">
      <a class="page-link" href="book_Mark_Page_number?pageNO=6" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
      </c:if>
  
    
      </form>
    </li>
  </ul>
</div>

	<div class="row row-cols-1 row-cols-md-5 g-4">
   <c:forEach var="book_Mark" items="${book_Marks}" varStatus="status">
	<form action="delete_book_mark" method="get"> 
			<div class="col">
				<div class="card h-100">
					<img src="${book_Mark.u_m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<input type="hidden" name="u_name" value="${book_Mark.u_name }">
					<input type="hidden" name="u_m_url" value="${book_Mark.u_m_url }">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${book_Mark.u_m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${book_Mark.u_m_view} </small> 
        <input type="submit" value="즐겨찾기 삭제" class="btn btn-secondary">
					</div>
				</div>
			</div>
    	 </form>
    	 </c:forEach>
	</div>
	
	




</body>
</html>