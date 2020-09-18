<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
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
<body>

	<!-- ======= Navbar ======= -->
	<div class="collapse navbar-collapse custom-navmenu" id="main-navbar">
		<div class="container py-2 py-md-5">
			<div class="row align-items-start">
				<div class="col-md-2">
					<ul class="custom-menu">
						<li class="active"><a href="main.mc">홈</a></li>
						<li><a href="mypage.mc">마이 페이지</a></li>
						<li><a href="contactselect.mc">건의사항</a></li>
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
						<a href="adminmenu.mc">메뉴 관리</a> 
						<a href="admincustomer.mc">고객 관리</a> 
						<a href="adminchart.mc">판매 차트</a>
				  		<a href="admincontactselect.mc">건의사항 관리</a> 
							  			
	<a href="#" class="burger" data-toggle="collapse" data-target="#main-navbar">
				<span></span>
			</a>
										


		</div>
		
	</nav>
	
	<main id="main">

		<!-- ======= Works Section ======= -->
            <section>
	<c:choose>
		<c:when test="${centerpage == null}">
			<jsp:include page="adminfail.jsp"></jsp:include>
		</c:when>
		<c:otherwise>
			<jsp:include page="${centerpage}.jsp"></jsp:include>
		</c:otherwise>
	</c:choose>
			</section>
</main>			


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