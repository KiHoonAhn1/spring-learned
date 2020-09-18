<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
								<em>${loginuser.name }님 안녕하세요 <br>
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
