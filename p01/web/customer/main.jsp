<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

#map {	
	width: 800px;
	height: 300px;
	border: 2px solid red;
	overflow: auto;
	background: white;
}
#img{
	width:50px;
	height:50px;
}
#cart >div> img {
	width:90px;
	height:60px;
}

#but {
	border-radius:50%;
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
<link href="customer/assets/img/apple-touch-icon.png"
	rel="apple-touch-icon">

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=https://fonts.googleapis.com/css?family=Inconsolata:400,500,600,700|Raleway:400,400i,500,500i,600,600i,700,700i"
	rel="stylesheet">

<!-- Vendor CSS Files -->
<link href="customer/assets/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="customer/assets/vendor/icofont/icofont.min.css"
	rel="stylesheet">
<link href="customer/assets/vendor/aos/aos.css" rel="stylesheet">
<link
	href="customer/assets/vendor/line-awesome/css/line-awesome.min.css"
	rel="stylesheet">
<link
	href="customer/assets/vendor/owl.carousel/assets/owl.carousel.min.css"
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
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script type="text/javascript">
var products = null;
var sum= 0;

function todb(){
	document.frm.action='pay.mc';
};

function display(data){
	$(data).each(function(index,data){
	var result = '';
	result += '<div class="item ' +data.category+ ' col-sm-3 col-md-2 col-lg-3 mb-3">';
	result += '<div class="item-wrap fancybox">';
	result += '<div class="work-info" id="menu">';
	result += '<div num="'+index+'">';
	result += '<p>'+data.name+'</p>';
	result += '<p>'+data.stock+'</p>';
	result += '<p>'+data.price+'</p>';
	result += '</div>';
	result += '</div>';
	result += '<img style="width:250px;height:150px;" class="img-fluid" src="customer/img/'+data.img+'">';
	result += '</div>';
	result += '</div>';
	
	$('#portfolio-grid').append(result);
	});
};


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
	$('#menu > div').mouseover(function(){
		$(this).css("cursor", "pointer");
	});
	$('#menu > div').click(function(){
		var num = $(this).attr('num');
		products[num].count += 1;
		
		if(products[num].count == 1){
		cart(num);
		} else {
		$('#choose'+num).remove();
			cart(num);
		}
	});
	$('#cart').on('click', '#but', function(){
         var num = $(this).parent().parent().parent().parent().parent().attr('num');
		var price = products[num].price;
		
		if(products[num].count == 1) {
			$(this).parent().parent().remove();
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
<section>
	<c:choose>
		<c:when test="${loginuser.id =='admin'}">
			<jsp:include page="adminnav.jsp"></jsp:include>
		</c:when>
		<c:otherwise>
			<jsp:include page="nav.jsp"></jsp:include>
		</c:otherwise>
	</c:choose>
</section>

	<main id="main">

		<!-- ======= Works Section ======= -->
		<section class="section site-portfolio">
			<div class="container">
				<div class="row mb-5 align-items-center">
					<div class="col-md-12 col-lg-6 mb-4 mb-lg-0" data-aos="fade-up">
						<h2>${loginuser.id }님 M 마트에 오신걸 환영합니다</h2>
						<p class="mb-0">즐거운 쇼핑 되세요</p>
					</div>
					<div class="col-md-12 col-lg-6 text-left text-lg-right"
						data-aos="fade-up" data-aos-delay="100">
						<div id="filters" class="filters">
							<a href="#" data-filter="*" class="active">All</a> <a href="#"
								data-filter=".음식">음식</a> <a href="#" data-filter=".음료">음료</a>
							<a href="#" data-filter=".아이스크림">아이스크림</a>
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
             <h3 id="sum" style="margin-left:330px;">총 결제 금액 : <span id="tot"></span></h3>
    </div>
 	<div class="col-md-6 form-group"> <!-- 결제하기 -->
             <button class="btn btn-primary btn-lg btn-block" type="submit" style="margin-left:330px;">결제하기</button>
    </div>
    </form>
    </div>
	</main>
	<!-- End #main -->




	<a href="#" class="back-to-top"><i class="icofont-simple-up"></i></a>

	<!-- Vendor JS Files -->
	<script src="customer/assets/vendor/jquery/jquery.min.js"></script>
	<script
		src="customer/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="customer/assets/vendor/jquery.easing/jquery.easing.min.js"></script>
	<script src="customer/assets/vendor/php-email-form/validate.js"></script>
	<script src="customer/assets/vendor/aos/aos.js"></script>
	<script src="customer/assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
	<script src="customer/assets/vendor/owl.carousel/owl.carousel.min.js"></script>

	<!-- Template Main JS File -->
	<script src="customer/assets/js/main.js"></script>

</body>

</html>