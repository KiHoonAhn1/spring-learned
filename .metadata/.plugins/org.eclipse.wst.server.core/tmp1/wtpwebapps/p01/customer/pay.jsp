<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<style>
#cart{
	width:800px;
	height:400px;
	border:2px solid white;
	overflow:auto;
	background:gray;
}
#map{
	width:800px;
	height:400px;
	border:2px solid white;
	overflow:auto;
	background:white;
}

.label {margin-bottom: 96px;}
.label * {display: inline-block;vertical-align: top;}
.label .left {background: url("https://t1.daumcdn.net/localimg/localimages/07/2011/map/storeview/tip_l.png") no-repeat;display: inline-block;height: 24px;overflow: hidden;vertical-align: top;width: 7px;}
.label .center {background: url(https://t1.daumcdn.net/localimg/localimages/07/2011/map/storeview/tip_bg.png) repeat-x;display: inline-block;height: 24px;font-size: 12px;line-height: 24px;}
.label .right {background: url("https://t1.daumcdn.net/localimg/localimages/07/2011/map/storeview/tip_r.png") -1px 0  no-repeat;display: inline-block;height: 24px;overflow: hidden;width: 6px;}


</style>
<head>
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<!--  <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=4ec517b56ac78e11d7fe932244acd0d3"></script>-->
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=4ec517b56ac78e11d7fe932244acd0d3&libraries=services,drawing"></script>

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

<body>

	<!-- ======= 최상단 메뉴 ======= -->
	<div class="collapse navbar-collapse custom-navmenu" id="main-navbar">
		<div class="container py-2 py-md-5">
			<div class="row align-items-start">
				<div class="col-md-2">
					<ul class="custom-menu">
						<li class="active"><a href="main.mc">홈</a></li>
						<li><a href="mypage.mc">마이 페이지</a></li>
						<li><a href="register.mc">회원가입</a></li>
						<li><a href="contact.mc">건의사항</a></li>
						<li><a href="logout.mc">로그아웃</a></li>
					</ul>
				</div>
				<div class="col-md-6 d-none d-md-block  mr-auto">
					<div class="tweet d-flex">
						<span class="icofont-twitter text-white mt-2 mr-3"></span>
						<div>
							<p>
								<em>아무말 적어요 <br> <a href="#">t.co/v82jsk</a>
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
	<!-- M MART 이동 스트링 -->
	<nav class="navbar navbar-light custom-navbar">
		<div class="container">
			<a class="navbar-brand" href="main.mc">M Mart</a> <a href="#"
				class="burger" data-toggle="collapse" data-target="#main-navbar">
				<span></span>
			</a>

		</div>
	</nav>
	<!-- main start 엠마트 오신걸 환영 -->
	<main id="main">

		<!-- ======= Works Section ======= -->
		<section class="section site-portfolio">
			<div class="container">
				<div class="row mb-5 align-items-center">
					<div class="col-md-12 col-lg-6 mb-4 mb-lg-0" data-aos="fade-up">
						<h2>주문이 완료 되었습니다.</h2>
					</div>
				</div>
			</div>
		</section>
		<!-- End  Works Section -->
  <nav class="navbar navbar-light custom-navbar">
    	<!-- 지도 영역 -->
        <div class="container" id="map">
        
        <script>      
var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
    mapOption = {
        center: new kakao.maps.LatLng(37.509628, 127.055516), // 지도의 중심좌표
        level: 6 // 지도의 확대 레벨
    };  
// 지도를 생성합니다    
var map = new kakao.maps.Map(mapContainer, mapOption); 
// 주소-좌표 변환 객체를 생성합니다
var geocoder = new kakao.maps.services.Geocoder();
var coordss;
// 주소로 좌표를 검색합니다
geocoder.addressSearch('${loginuser.adress}', function(result, status) {
    // 정상적으로 검색이 완료됐으면 
     //if (status === kakao.maps.services.Status.OK) {
        coordss = new kakao.maps.LatLng(result[0].y, result[0].x);
        // 결과값으로 받은 위치를 마커로 표시합니다
       var marker1 = new kakao.maps.Marker({
            map: map,
            position: coordss
        });	
		// 인포윈도우로 장소에 대한 설명을 표시합니다
        var infowindow = new kakao.maps.InfoWindow({
            content: '<div style="width:150px;text-align:center;padding:6px 0;">배달 도착 위치</div>'
        });
        infowindow.open(map, marker1);
		map.setCenter(coordss);
     var markerPosition  = new kakao.maps.LatLng(37.509628, 127.055516); 
  // 마커를 생성합니다
   var marker2 = new kakao.maps.Marker({
      position: markerPosition
  });
  var infowindow = new kakao.maps.InfoWindow({
      content: '<div style="width:150px;text-align:center;padding:6px 0;">배달 출발 위치</div>'
  });
  infowindow.open(map, marker2);
  // 마커가 지도 위에 표시되도록 설정합니다
  marker2.setMap(map);
});   
  // 지도 위 선 그리기
var positions;
function map_line(){
  const posilat = coordss.getLat();
  const posilng = coordss.getLng();
  
 var linePath = [
	new kakao.maps.LatLng(37.509628, 127.055516),
	new kakao.maps.LatLng(posilat, posilng)
 ];
positions = [{
	title : "배달 출발 지점",
	latlng : new kakao.maps.LatLng(37.509628, 127.055516)
},{
	title : "배달 도착 지점",
	latlng : new kakao.maps.LatLng(posilat, posilng)
}
];

  var polyline = new kakao.maps.Polyline({
	    path: linePath, // 선을 구성하는 좌표배열 입니다
	    strokeWeight: 5, // 선의 두께 입니다
	    strokeColor: '#FF0000', // 선의 색깔입니다
	    strokeOpacity: 0.7, // 선의 불투명도 입니다 1에서 0 사이의 값이며 0에 가까울수록 투명합니다
	    strokeStyle: 'solid' // 선의 스타일입니다
	});
	// 지도에 선을 표시합니다 
	polyline.setMap(map);  
  }		
  var linePath;
  var lineLine = new kakao.maps.Polyline();
  var distance;
  
  function map_dis(){
  for(var i =0; i<positions.length ;i++){
	  if(i !=0){
		  linePath = [positions[i-1].latlng, positions[i].latlng]
	  };
	  lineLine.setPath(linePath);
	  
	  var drawLine = new kakao.maps.Polyline({
			map : map,
			path : linePath,
			strokeWeight : 3,
			strokeColor : '#db4040',
			strokeOpacity : 1,
			strokeStyle : 'solid'
	  });
	  distance = Math.round(lineLine.getLength());
	  displayCircleDot(positions[i].latlng, distance);
  }}
  function displayCircleDot(position, distance){
	  if(distance > 0){  
		  var a = Math.round(distance/310); 
		  var distanceOverlay = new kakao.maps.CustomOverlay(
			{
				content : '<div class="label"><span class="left"></span><span class="center">거리 '+ distance + 'm</span><span class="right"></span><br><span class="left"></span><span class="center">약 '+a+'분 후 도착 예정</span><span class="right"></span></div>',      //시내 주행 시속 30으로 했을때 예측
				position : position,
				yAnchor : 0,
				zIndex : -2
			});
		  distanceOverlay.setMap(map);
	  }
  }
setTimeout(function() {
	map_line();
	}, 300);
	
setTimeout(function() {
	map_dis();
	}, 500);
//선그리기 끝
</script>
   		</div>
    			<div class="col-md-6 form-group">
                  <input type="submit" class="readmore d-block w-100" value="확인" onclick="location.href='return.mc'" >
                </div>
                 <div class="col-md-6 form-group">
                  <input type="button" class="readmore d-block w-100" value="logout" onclick="location.href='login.mc'">
                </div>
    </nav>
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