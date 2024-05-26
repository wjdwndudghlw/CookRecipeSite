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
    <li class="breadcrumb-item active" aria-current="page">술안주</li>
    <li class="breadcrumb-item active" aria-current="page">Food_level(1)</li>
  </ol>
</nav>
<nav aria-label="Page navigation example">
</nav>
</div>


<div class="number">
  <ul class="pagination">
    <li class="page-item">
  	<form action="Night_Recipe_level1" method="get">
      <a class="page-link" href="getNight_Recipe_level1_1Page" aria-label="Previous">
        <span aria-hidden="true bg-secondary">&laquo;</span>
      </a>
    </li>
    <li class="page-item "><input type="submit" name="pageNO" value="1" class="page-link" /></li>
    <li class="page-item "><input type="submit" name="pageNO" value="2" class="page-link" /></li>
    <li class="page-item "><input type="submit" name="pageNO" value="3" class="page-link" /></li>
    <li class="page-item "><input type="submit" name="pageNO" value="4" class="page-link" /></li>
    <li class="page-item "><input type="submit" name="pageNO" value="5" class="page-link" /></li>

    <li class="page-item">
      <a class="page-link" href="getNight_Recipe_level1_6Page" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
      </form>
    </li>
  </ul>
</div>



		<div class="row row-cols-1 row-cols-md-5 g-4">
       <form action="Night_Recipe_Detail" method="get">
 
 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[0].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[0].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[0].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[0].m_url}">


			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[0].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[0].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[0].m_view} </small> 
						<input type="hidden"  name="m_url" id="m_url"
						value="${Night_Recipe[0].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	  </form>
	
	<form action="Night_Recipe_Detail" method="get">
	 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[1].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[1].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[1].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[1].m_url}">






			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[1].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[1].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[1].m_view} </small> 
						<input type="hidden"  name="m_url"
						value="${Night_Recipe[1].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	</form>
		<form action="Night_Recipe_Detail" method="get">
	 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[2].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[2].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[2].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[2].m_url}">




			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[2].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[2].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[2].m_view} </small> 
						<input type="hidden"  name="m_url"
						value="${Night_Recipe[2].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	</form>
		<form action="Night_Recipe_Detail" method="get">
	 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[3].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[3].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[3].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[3].m_url}">



			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[3].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[3].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[3].m_view} </small> 
						<input type="hidden"  name="m_url"
						value="${Night_Recipe[3].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	</form>
		<form action="Night_Recipe_Detail" method="get">
	 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[4].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[4].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[4].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[4].m_url}">



			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[4].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[4].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[4].m_view} </small> 
						<input type="hidden"  name="m_url"
						value="${Night_Recipe[4].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	</form>






		<form action="Night_Recipe_Detail" method="get">
	 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[5].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[5].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[5].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[5].m_url}">




			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[5].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[5].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[5].m_view} </small> 
						<input type="hidden"  name="m_url"
						value="${Night_Recipe[5].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	</form>

		<form action="Night_Recipe_Detail" method="get">
	 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[6].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[6].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[6].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[6].m_url}">


			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[6].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[6].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[6].m_view} </small> 
						<input type="hidden"  name="m_url"
						value="${Night_Recipe[6].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	</form>

		<form action="Night_Recipe_Detail" method="get">
	 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[7].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[7].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[7].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[7].m_url}">


			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[7].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[7].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[7].m_view} </small> 
						<input type="hidden"  name="m_url"
						value="${Night_Recipe[7].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	</form>

		<form action="Night_Recipe_Detail" method="get">
	 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[8].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[8].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[8].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[8].m_url}">



			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[8].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[8].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[8].m_view} </small> 
						<input type="hidden"  name="m_url"
						value="${Night_Recipe[8].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	</form>

		<form action="Night_Recipe_Detail" method="get">
	 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[9].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[9].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[9].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[9].m_url}">



			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[9].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[9].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[9].m_view} </small> 
						<input type="hidden"  name="m_url"
						value="${Night_Recipe[9].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	</form>
	
	
	
	
	
	
	
	
	       <form action="Night_Recipe_Detail" method="get">
	 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[10].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[10].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[10].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[10].m_url}">


			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[10].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[10].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[10].m_view} </small> 
						<input type="hidden"  name="m_url"
						value="${Night_Recipe[10].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	  </form>
	
	<form action="Night_Recipe_Detail" method="get">
	 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[11].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[11].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[11].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[11].m_url}">



			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[11].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[11].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[11].m_view} </small> 
						<input type="hidden"  name="m_url"
						value="${Night_Recipe[11].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	</form>
		<form action="Night_Recipe_Detail" method="get">
	 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[12].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[12].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[12].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[12].m_url}">



			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[12].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[12].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[12].m_view} </small> 
						<input type="hidden"  name="m_url"
						value="${Night_Recipe[12].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	</form>
		<form action="Night_Recipe_Detail" method="get">
	 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[13].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[13].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[13].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[13].m_url}">



			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[13].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[13].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[13].m_view} </small> 
						<input type="hidden"  name="m_url"
						value="${Night_Recipe[13].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	</form>
		<form action="Night_Recipe_Detail" method="get">
	 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[14].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[14].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[14].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[14].m_url}">


			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[14].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[14].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[14].m_view} </small> 
						<input type="hidden"  name="m_url"
						value="${Night_Recipe[14].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	</form>






		<form action="Night_Recipe_Detail" method="get">
	 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[15].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[15].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[15].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[15].m_url}">



			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[15].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[15].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[15].m_view} </small> 
						<input type="hidden"  name="m_url"
						value="${Night_Recipe[15].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	</form>

		<form action="Night_Recipe_Detail" method="get">
	 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[16].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[16].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[16].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[16].m_url}">



			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[16].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[16].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[16].m_view} </small> 
						<input type="hidden"  name="m_url"
						value="${Night_Recipe[16].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	</form>

		<form action="Night_Recipe_Detail" method="get">
	 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[17].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[17].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[17].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[17].m_url}">



			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[17].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[17].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[17].m_view} </small> 
						<input type="hidden"  name="m_url"
						value="${Night_Recipe[17].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	</form>

		<form action="Night_Recipe_Detail" method="get">
	 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[18].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[18].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[18].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[18].m_url}">



			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[18].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[18].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[18].m_view} </small> 
						<input type="hidden"  name="m_url"
						value="${Night_Recipe[18].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	</form>

		<form action="Night_Recipe_Detail" method="get">
	 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[19].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[19].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[19].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[19].m_url}">



			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[19].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[19].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[19].m_view} </small> 
						<input type="hidden"  name="m_url"
						value="${Night_Recipe[19].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	</form>
	
			<form action="Night_Recipe_Detail" method="get">
	 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[20].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[20].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[20].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[20].m_url}">



			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[20].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[20].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[20].m_view} </small> 
						<input type="hidden"  name="m_url"
						value="${Night_Recipe[20].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	</form>
	
			<form action="Night_Recipe_Detail" method="get">
	 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[21].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[21].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[21].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[21].m_url}">



			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[21].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[21].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[21].m_view} </small> 
						<input type="hidden"  name="m_url"
						value="${Night_Recipe[21].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	</form>
	
			<form action="Night_Recipe_Detail" method="get">
		 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[22].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[22].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[22].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[22].m_url}">



			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[22].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[22].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[22].m_view} </small> 
						<input type="hidden"  name="m_url"
						value="${Night_Recipe[22].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	</form>
	
			<form action="Night_Recipe_Detail" method="get">
	 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[23].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[23].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[23].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[23].m_url}">


			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[23].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[23].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[23].m_view} </small> 
						<input type="hidden"  name="m_url"
						value="${Night_Recipe[23].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	</form>
	
			<form action="Night_Recipe_Detail" method="get">
	 <input type="hidden" name="u_name" value="${userID}">
<input type="hidden" name="u_m_name" value="${Night_Recipe[24].m_name}">
<input type="hidden" name="u_m_img_url" value="${Night_Recipe[24].m_img_url}">
<input type="hidden" name="u_m_view" value="${Night_Recipe[24].m_view}">
<input type="hidden" name="u_m_url" value="${Night_Recipe[24].m_url}">



			<div class="col">
				<div class="card h-100">
					<img src="${Night_Recipe[24].m_img_url}" class="card-img-top" alt="..."
						style="height: 400px;">
					<div class="card-body">
						<h5 class="card-title">Making Declicious Food</h5>
						<p class="card-text" style="height:40px;">${Night_Recipe[24].m_name}</p>
					</div>
					<div class="card-footer">
						<small class="text-muted">조회수:${Night_Recipe[24].m_view} </small> 
						<input type="hidden"  name="m_url"
						value="${Night_Recipe[24].m_url}">
        <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
					</div>
				</div>
			</div>
	</form>
	</div>
	
	




</body>
</html>