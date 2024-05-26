<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script charset="UTF-8">
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


function check(){
	
	var  Join_ID  = document.getElementById("Join_ID").value;
	var  Join_Email= document.getElementById("Join_Email").value;
	var  Join_Password= document.getElementById("Join_Password").value;
	var  Join_Password2 = document.getElementById("Join_Password2").value;



    if (isEmpty(Join_ID) || isEmpty(Join_Password) || isEmpty(Join_Password2) || isEmpty(Join_Email) ) {
		alert("입력이 안된 사항이 있습니다")
		return false;
	}
    if (atLeastLetter(Join_ID,5)) {
		alert("아이디는 5자이상 이여야 합니다")
		return false;
	}
    if (atLeastLetter(Join_Password,8) ) {
		alert("비밀번호는 8자이상 이여야 합니다")
		return false;
	}
    if (notEqualPw(Join_Password,Join_Password2) ) {
		alert("비밀번호가 일치하지 않습니다")
		return false;
	}
    if (notContain(Join_Password,"!@#$%^&*") ) {
		alert("비밀번호는 특수문자를 포함해야 합니다")
		return false;
	}
	
}
</script>


<style>
@import url('https://fonts.googleapis.com/css?family=Poppins:400,500,600,700,800,900');

body{
  font-family: 'Poppins', sans-serif;
  font-weight: 300;
  font-size: 15px;
  line-height: 1.7;
  color: #c4c3ca;
  background-color: #1f2029;
  overflow-x: hidden;
}
a {
  cursor: pointer;
  transition: all 200ms linear;
}
a:hover {
  text-decoration: none;
}
.link {
  color: #c4c3ca;
}
.link:hover {
  color: #ffeba7;
}
p {
  font-weight: 500;
  font-size: 14px;
  line-height: 1.7;
}
h4 {
  font-weight: 600;
}
h6 span{
  padding: 0 20px;
  text-transform: uppercase;
  font-weight: 700;
}
.section{
  position: relative;
  width: 100%;
  display: block;
}
.full-height{
  min-height: 100vh;
}
[type="checkbox"]:checked,
[type="checkbox"]:not(:checked){
  position: absolute;
  left: -9999px;
}
.checkbox:checked + label,
.checkbox:not(:checked) + label{
  position: relative;
  display: block;
  text-align: center;
  width: 60px;
  height: 16px;
  border-radius: 8px;
  padding: 0;
  margin: 10px auto;
  cursor: pointer;
  background-color: #ffeba7;
}
.checkbox:checked + label:before,
.checkbox:not(:checked) + label:before{
  position: absolute;
  display: block;
  width: 36px;
  height: 36px;
  border-radius: 50%;
  color: #ffeba7;
  background-color: #102770;
  font-family: 'unicons';
  content: '\eb4f';
  z-index: 20;
  top: -10px;
  left: -10px;
  line-height: 36px;
  text-align: center;
  font-size: 24px;
  transition: all 0.5s ease;
}
.checkbox:checked + label:before {
  transform: translateX(44px) rotate(-270deg);
}


.card-3d-wrap {
  position: relative;
  width: 440px;
  max-width: 100%;
  height: 400px;
  -webkit-transform-style: preserve-3d;
  transform-style: preserve-3d;
  perspective: 800px;
  margin-top: 60px;
}
.card-3d-wrapper {
  width: 100%;
  height: 100%;
  position:absolute;    
  top: 0;
  left: 0;  
  -webkit-transform-style: preserve-3d;
  transform-style: preserve-3d;
  transition: all 600ms ease-out; 
}
.card-front, .card-back {
  width: 100%;
  height: 100%;
  background-color: #2a2b38;
  background-image: url('https://s3-us-west-2.amazonaws.com/s.cdpn.io/1462889/pat.svg');
  background-position: bottom center;
  background-repeat: no-repeat;
  background-size: 300%;
  position: absolute;
  border-radius: 6px;
  left: 0;
  top: 0;
  -webkit-transform-style: preserve-3d;
  transform-style: preserve-3d;
  -webkit-backface-visibility: hidden;
  -moz-backface-visibility: hidden;
  -o-backface-visibility: hidden;
  backface-visibility: hidden;
}
.card-back {
  transform: rotateY(180deg);
}
.checkbox:checked ~ .card-3d-wrap .card-3d-wrapper {
  transform: rotateY(180deg);
}
.center-wrap{
  position: absolute;
  width: 100%;
  padding: 0 35px;
  top: 50%;
  left: 0;
  transform: translate3d(0, -50%, 35px) perspective(100px);
  z-index: 20;
  display: block;
}


.form-group{ 
  position: relative;
  display: block;
    margin: 0;
    padding: 0;
}
.form-style {
  padding: 13px 20px;
  padding-left: 55px;
  height: 48px;
  width: 100%;
  font-weight: 500;
  border-radius: 4px;
  font-size: 14px;
  line-height: 22px;
  letter-spacing: 0.5px;
  outline: none;
  color: #c4c3ca;
  background-color: #1f2029;
  border: none;
  -webkit-transition: all 200ms linear;
  transition: all 200ms linear;
  box-shadow: 0 4px 8px 0 rgba(21,21,21,.2);
}
.form-style:focus,
.form-style:active {
  border: none;
  outline: none;
  box-shadow: 0 4px 8px 0 rgba(21,21,21,.2);
}
.input-icon {
  position: absolute;
  top: 0;
  left: 18px;
  height: 48px;
  font-size: 24px;
  line-height: 48px;
  text-align: left;
  color: #ffeba7;
  -webkit-transition: all 200ms linear;
    transition: all 200ms linear;
}

.form-group input:-ms-input-placeholder  {
  color: #c4c3ca;
  opacity: 0.7;
  -webkit-transition: all 200ms linear;
    transition: all 200ms linear;
}
.form-group input::-moz-placeholder  {
  color: #c4c3ca;
  opacity: 0.7;
  -webkit-transition: all 200ms linear;
    transition: all 200ms linear;
}
.form-group input:-moz-placeholder  {
  color: #c4c3ca;
  opacity: 0.7;
  -webkit-transition: all 200ms linear;
    transition: all 200ms linear;
}
.form-group input::-webkit-input-placeholder  {
  

</style>
<body>


<% 

String userID = null;
if(session.getAttribute("userID") !=null){
	userID=(String) session.getAttribute("userID");
}

%>







  <div class="section">
    <div class="container">
      <div class="row full-height justify-content-center">
        <div class="col-12 text-center align-self-center py-5">
          <div class="section pb-5 pt-5 pt-sm-2 text-center">
            <h6 class="mb-0 pb-3"><span>Log In </span><span>Sign Up</span></h6>
                  <input class="checkbox" type="checkbox" id="reg-log" name="reg-log"/>
                  <label for="reg-log"></label>
            <div class="card-3d-wrap mx-auto" id="login_card">
              <div class="card-3d-wrapper">
                <div class="card-front">
                  <div class="center-wrap">
                    <div class="section text-center">
                    
                    
                    <form action="Login_User" method="post" name="l_form">
                      <h4 class="mb-4 pb-3">Log In</h4>
                      <div class="form-group">
                        <input type="text" name="u_name" class="form-style" placeholder="Your ID" id="your name" autocomplete="off">
                        <i class="input-icon uil uil-at"></i>
                      </div>  
                      <div class="form-group mt-2">
                        <input type="password" name="u_password" class="form-style" placeholder="Your Password" id="logpass" autocomplete="off">
                        <i class="input-icon uil uil-lock-alt"></i>
                      </div>
                     <input type="submit" class="btn mt-4" value="submit"> 
                     </form>
                                    <p class=><a href="Find_ID_Password" class="link">Forgot your password?</a></p>
                        </div>
                      </div>
                    </div>
                <div class="card-back">
                  <div class="center-wrap">
                    <div class="section text-center">
                    
                    
                    
                    <form action="Join_User" method="post" name="l_form" >
                      <h4 class="mb-4 pb-3">Sign Up</h4>
                      <div class="form-group">
                        <input type="text" name="u_name" class="form-style" placeholder="Your Full Name"  autocomplete="off" id="Join_ID">
                        <i class="input-icon uil uil-user"></i>
                      </div>  
                      <div class="form-group mt-2">
                        <input type="email" name="u_email" class="form-style" placeholder="Your Email"  autocomplete="off" id="Join_Email" >
                        <i class="input-icon uil uil-at"></i>
                      </div>  
                      <div class="form-group mt-2">
                        <input type="password" name="u_password" class="form-style" placeholder="Your Password"  autocomplete="off" id="Join_Password">
                        <i class="input-icon uil uil-lock-alt"></i>
                      </div>
                      
                      <div class="form-group mt-2">
                        <input type="password" name="u_password1" class="form-style" placeholder="Your Password Check"  autocomplete="off" id="Join_Password2">
                        <i class="input-icon uil uil-lock-alt"></i>
                      </div>
                      <input type="submit" value="submit" class="btn mt-4" onclick="return check()">             
                      </form>
                      
                      
                      
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
      </div>
  </div>








</body>
</html>