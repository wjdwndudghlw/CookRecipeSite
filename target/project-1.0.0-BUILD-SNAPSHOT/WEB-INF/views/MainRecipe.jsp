<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@100;200;300;400;500;600;700;800;900&display=swap" rel="stylesheet">

    <title>food Website Template</title>

    <!-- Bootstrap core CSS -->
    <link href="resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Additional CSS Files -->
    <link rel="stylesheet" href="resources/assets/css/fontawesome.css">
    <link rel="stylesheet" href="resources/assets/css/templatemo-plot-listing.css">
    <link rel="stylesheet" href="resources/assets/css/animated.css">
    <link rel="stylesheet" href="resources/assets/css/owl.css">
</head>
<body>






<div class="recent-listing">
    <div class="container">
      <div class="row">
      
        <div class="col-lg-12">
          <div class="section-heading">
            <h2>제철 음식 추천</h2>
            <h6>${season}</h6>
          </div>
        </div>
        
        <div class="col-lg-12">
          <div class="owl-carousel owl-listing">
  
            <div class="item">
              <div class="row">
              
       		<c:forEach var="SeasonRecipe" items="${SeasonRecipe}" end="4">
                <div class="col-lg-12">
                  <div class="listing-item">
                  
                    <div class="left-image">
                      <a href="#"><img src="${SeasonRecipe.m_img_url}" alt=""></a>
                    </div>
                    <div class="right-content align-self-center">
                      <a href="#"><h4>${SeasonRecipe.m_name}</h4></a>
                      <div>${SeasonRecipe.m_view}> Reviews</div>
                      <span class="price"><div class="icon"><img src="resources/assets/images/listing-icon-01.png" alt=""></div>${SeasonRecipe.i_time}</span>
                      <span class="details"></span>
                      <ul class="info">
                        <li><img src="resources/assets/images/listing-icon-02.png" alt=""> ${SeasonRecipe.i_servings}</li>
                        <li><img src="resources/assets/images/listing-icon-03.png" alt=""> ${SeasonRecipe.i_level}</li>
                      </ul>
                     <form action= "showDetailSeasonRecipe">
                      <div class="main-white-button">
                      <input type="hidden" name="m_url" value="${SeasonRecipe.m_url}">
                      <input type="submit" value="Go to watch Recipe" class="btn btn-secondary">
                      </div>
                      </form>
                    </div>
                    
                  </div>
                </div>
                </c:forEach>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>














</body>
</html>