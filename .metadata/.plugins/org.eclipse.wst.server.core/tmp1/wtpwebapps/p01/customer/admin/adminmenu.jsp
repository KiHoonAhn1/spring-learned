<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
<script type="text/javascript">
var products = null;

function display(data){
	$(data).each(function(index,data){
	var result = '';
	if(data.name== '피자'){
		$("#cs").css("color","red");
	}
	result += '<div class="item ' +data.category+ ' col-sm-2 col-md-2 col-lg-2 mb-3">';
	result += '<a href="adminmenudetail.mc?menu_code='+data.menu_code+'"><div id="cs" style="text-align:center;"><p><img style="width:150px;height:120px;" class="img-fluid" src="customer/img/'+data.img1+'">'+data.name+'</p>';
	result += '<p>재고 : '+data.stock+'</p>';
	result += '<p>가격 : '+data.price+'</p>';
	result += '<p> 카테고리 : '+data.category+'</p>';
	result += '</div></a>';
	result += '</div>';
	$('#portfolio-grid').append(result);
	});
};

function getMain(){
	$.ajax({
/* 		type:'get', */
		  url: 'adminmenuselect.mc',
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

$(document).ready(function(){
	getMain();
})
	

	
</script>
		<!-- ======= Works Section ======= -->
		<section class="section site-portfolio">
			<div class="container">
				<div class="row mb-5 align-items-center">
					<div class="col-md-12 col-lg-6 mb-4 mb-lg-0" data-aos="fade-up">
						<h2>메뉴 관리 페이지</h2>
					</div>
					<div class="col-md-12 col-lg-6 text-left text-lg-right"
						data-aos="fade-up" data-aos-delay="100">
						<div id="filters" class="filters">
							<a href="#" data-filter="*" class="active">All</a> <a href="#"
								data-filter=".음식">음식</a> <a href="#" data-filter=".음료">음료</a>
							<a href="#" data-filter=".아이스크림">아이스크림</a>
						</div>
					</div>
					                <div class="col-md-3 form-group">
                  <input type="button" class="readmore d-block w-80" value="메뉴 추가" onclick="location.href='adminmenuadd.mc'" data-aos="fade-up">
                </div>
				</div>
				<div id="portfolio-grid" class="row no-gutter" data-aos="fade-up"
					data-aos-delay="200">
					<!-- append -->
					<div>
					</div>
				</div>
			</div>
		</section>
		<!-- End  Works Section -->


	<!-- End #main -->