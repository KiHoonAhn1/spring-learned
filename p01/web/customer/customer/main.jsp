<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<style>
#cart {
   width: 650px;
   height: 400px;
   border-style: solid;
   border-color: #e9eaf1;
   border-width: 2px;
   overflow: auto;
   background: white;
   display: block;
   margin-top: 0px;
   margin-bottom: 0px;
}

#portfolio-grid > div > div > div > img {
	width : 100px;
	height : 80px;	
}
#portfolio-grid > div > div > div {
	text-align : center;
}
#img{
	width:50px;
	height:50px;
}
</style>
<head>
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1.0" name="viewport">

<title>어서오세요. M마트입니다.</title>
<meta content="" name="descriptison">
<meta content="" name="keywords">

<!-- Favicons -->
<link href="customer/assets/img/favicon.png" rel="icon">
<link href="customer/assets/img/apple-touch-icon.png" rel="apple-touch-icon">

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=https://fonts.googleapis.com/css?family=Inconsolata:400,500,600,700|Raleway:400,400i,500,500i,600,600i,700,700i"
	rel="stylesheet">

<!-- Vendor CSS Files -->
<link href="customer/assets/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="customer/assets/vendor/icofont/icofont.min.css" rel="stylesheet">
<link href="customer/assets/vendor/aos/aos.css" rel="stylesheet">
<link href="customer/assets/vendor/line-awesome/css/line-awesome.min.css"
	rel="stylesheet">
<link href="customer/assets/vendor/owl.carousel/assets/owl.carousel.min.css"
	rel="stylesheet">

<!-- Template Main CSS File -->
<link href="customer/assets/css/style.css" rel="stylesheet">

<!-- =======================================================
  * Template Name: MyPortfolio - v2.1.0
  * Template URL: https://bootstrapmade.com/myportfolio-bootstrap-portfolio-website-template/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
<script type="text/javascript">
var products = null;
var sum = 0;

function todb(){
	document.frm.action='pay.mc';
};

function display(data){
	$('#sum > span').text(sum);
	$(data).each(function(index,data){
	var result = '';
	result += '<div class="item burg col-sm-3 col-md-2 col-lg-3 mb-3">';
	result += '<div class="item-wrap fancybox">';
	result += '<div class="work-info" id="it">';
	result += '<div num="'+index+'">';
	result += '<p>'+data.name+'</p>'
	result += '<p>'+data.stock+'</p>'
	result += '<p>'+data.price+'</p>'
	result += '</div>';
	result += '</div>';
	result += '<img class="img-fluid" src="customer/img/'+data.img+'">'
	result += '</div>';
	$('#portfolio-grid').append(result);
	});
};
//portfolio-grid
function getMain(){
	$.ajax({
/* 		type:'get', */
		  url: 'menuselect.mc',
		  dataType: 'json',
		async:false,
		success: function(ja){
			products = ja;
			display(ja);
		},
		error: function(){
			alert('get Error.........');
		}
	});
};


function cart(n){
	   var name = products[n].name;
	   var price = products[n].price;
	   var img = products[n].img;
	   var count = products[n].count;
	   var result = '';
	      result += '<div num="'+n+'" id="choose'+n+'">';
	  	  result += '<table class="table" id="tt">';
	      result += '<tbody>';
	      result += '<tr>';
	      result += '<td>'+'<img src = "customer/img/'+img+'" id = "img">'+'</td>';
	      result += '<td>'+name+'<input type = "hidden" name ="menu_code" value = "'+products[n].menu_code+'"><input type = "hidden" name ="total" value = "'+products[n].count*price+'"></td>';
	      result += '<td>'+price+'<input type = "hidden" name ="quantity" value = "'+products[n].count+'"><input type = "hidden" name ="menu_name" value = "'+products[n].name+'"></td>';
	      result += '<td>' + count +'</td><input type = "hidden" name ="menu_price" value = "'+products[n].price+'">';
	      result += '<td>' + '<button id="but">X</button>' +'</td>';
	      result += '</tr>';
	      result += '</tbody>';
	      result += '</table>';
	     // result += '<input type ="button" value ="." onclick="location.href='orderlistadd.mc?id=${order.getMenu_code()}'">';
	      result += '</div>';
	      sum += price;
	      $('#sum > span').text(sum);
	      $('#cart').append(result);
	   };


	$(document).ready(function(){
	   getMain();
	   $('#it > div').mouseover(function(){
	      $(this).css("cursor", "pointer");
	   });
	   $('#it > div').click(function(){
		   var num = $(this).attr('num');
		   alert(products[num].count);
	      products[num].count += 1;
	      
	      if(products[num].count ==1){
	    	  alert(products[num].count);
	      cart(num);
	      } else{
	    	  alert(products[num].count);
	  		 $('#choose'+num).remove();
	         cart(num);
	      }
	   });
	   
	   
	   $('#cart').on('click', '#but', function(){
		      var num = $(this).parent().attr('num');
		      var price = products[num].price;
		      
		      if(products[num].count == 1) {
		         $(this).parent().remove();
		         products[num].count = 0;
		         sum -= price;
		  	   $('#sum > span').text(sum);
		      } else {
		         products[num].count = products[num].count - 1;
		         $('#choose'+num).remove();
		         cart(num);
		         sum -= 2*price;
		  	   $('#sum > span').text(sum);
		      }
		   });
	   })
	   
	   
	   
</script>
<body>

	<!-- ======= Navbar ======= -->
	<div class="collapse navbar-collapse custom-navmenu" id="main-navbar">
		<div class="container py-2 py-md-5">
			<div class="row align-items-start">
				<div class="col-md-2">
					<ul class="custom-menu">
						<li class="active"><a href="main.mc">홈</a></li>
						<li><a href="mypage.mc">마이 페이지</a></li>
						<li><a href="contact.mc">건의사항</a></li>
						<li><a href="logout.mc">로그아웃</a></li>
						<li><a href="admin.mc">관리자</a></li>
					</ul>
				</div>
				<div class="col-md-6 d-none d-md-block  mr-auto">
					<div class="tweet d-flex">
						<span class="icofont-twitter text-white mt-2 mr-3"></span>
						<div>
							<p>
								<em>안녕하세요 <br> <a href="#">t.co/v82jsk</a>
								</em>
							</p>
						</div>
					</div>
				</div>
				<div class="col-md-4 d-none d-md-block">
					<h3>Hire Me</h3>
					<p>
						Lorem ipsum dolor sit amet consectetur adipisicing elit. Quisquam
						necessitatibus incidunt ut officiisexplicabo inventore. <br>
						<a href="#">myemail@gmail.com</a>
					</p>
				</div>
			</div>

		</div>
	</div>

	<nav class="navbar navbar-light custom-navbar">
		<div class="container">
			<a class="navbar-brand" href="main.mc">M Mart</a> <a href="#"
				class="burger" data-toggle="collapse" data-target="#main-navbar">
				<span></span>
			</a>

		</div>
	</nav>

	<main id="main">

		<!-- ======= Works Section ======= -->
		<section class="section site-portfolio">
			<div class="container">
				<div class="row mb-5 align-items-center">
					<div class="col-md-12 col-lg-6 mb-4 mb-lg-0" data-aos="fade-up">
						<h2>M 마트에 오신걸 환영합니다.</h2>
						<p class="mb-0">즐거운 쇼핑 되세요.</p>
					</div>
					<div class="col-md-12 col-lg-6 text-left text-lg-right"
						data-aos="fade-up" data-aos-delay="100">
						<div id="filters" class="filters">
							<a href="#" data-filter="*" class="active">All</a> <a href="#"
								data-filter=".burg">Burger</a> <a href="#" data-filter=".side">Side</a>
							<a href="#" data-filter=".beverage">Beverage</a>
						</div>
					</div>
				</div>
				<div id="portfolio-grid" class="row no-gutter" data-aos="fade-up"
					data-aos-delay="200">
					<!-- append -->
					
				</div>
			</div>
		</section>
		<!-- End  Works Section -->
	<div>
  <form class="pay-form" action="pay.mc" method="post">
  
    <div class="container" id="cart">
    <table class = "table" id = "tabl">
    	<thead><tr><th>선택메뉴</th><th>상품명</th><th>가격</th><th>개수</th><th>취소</th></tr></thead>
    </table>
    </div> 

    <!-- 총 결제 금액 -->
    <div class="col-md-5 form-group">
             <h3 id="sum">총 결제 금액 : <span id="tot"></span></h3>
    </div>
 	<div class="col-md-6 form-group"> <!-- 결제하기 -->
             <button class="btn btn-primary btn-lg btn-block" type="submit">결제하기</button>
    </div>
    </form>
    </div>
	</main>
	<!-- End #main -->
	<a href="#" class="back-to-top"><i class="icofont-simple-up"></i></a>

	<!-- Vendor JS Files -->
	<script src="customer/assets/vendor/jquery/jquery.min.js"></script>
	<script src="customer/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="customer/assets/vendor/jquery.easing/jquery.easing.min.js"></script>
	<script src="customer/assets/vendor/php-email-form/validate.js"></script>
	<script src="customer/assets/vendor/aos/aos.js"></script>
	<script src="customer/assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
	<script src="customer/assets/vendor/owl.carousel/owl.carousel.min.js"></script>

	<!-- Template Main JS File -->
	<script src="customer/assets/js/main.js"></script>

</body>
</html>