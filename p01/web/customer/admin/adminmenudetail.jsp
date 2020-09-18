<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        		  <main id="main">

    <section class="section pb-5">
      <div class="container">
        <div class="row">
          <div class="col-md-6 ml-auto order-0" data-aos="fade-up">
    <section class="section pt-1">
      <div class="container">
<!-- carousel 시작 -->
        <div class="owl-carousel testimonial-carousel">

            <div class="testimonial">
              <img src="customer/img/${adminmenudetail.img1 }" alt="Image" class="img-fluid">
            </div>

            <div class="testimonial">
              <img src="customer/img/${adminmenudetail.img2 }" alt="Image" class="img-fluid">
            </div>
          
           <!-- <div class="testimonial-wrap"> -->
            <div class="testimonial">
              <img src="customer/img/${adminmenudetail.img3 }" alt="Image" class="img-fluid">
            </div>
         <!--  </div> -->

        </div>

      </div>
    </section>
          </div> <!-- End Testimonials Section -->
          <div class="col-md-6 mb-5 mb-md-0" data-aos="fade-up">

           <form action="adminmenuupdate.mc" enctype="multipart/form-data" method="post" role="form" class="php-email-form">
				<!-- 회원가입 입력 창  -->
              <div class="row">
                <div class="col-md-12 form-group">
                  <label for="name">제품명</label>
                  <input type="text" name="name" class="form-control" id="id" data-rule="required" data-msg="제품명을 입력해주세요." value="${adminmenudetail.name }" />
                  <div class="validate"></div>
                </div>
                <div class="col-md-12 form-group">
                  <label for="name">가격</label>
                  <input type="text" name="price" class="form-control" id="id" data-rule="required" data-msg="가격을 입력해주세요." value="${adminmenudetail.price }" />
                  <div class="validate"></div>
                </div>              
                <div class="col-md-12 form-group">
                  <label for="name">재고</label>
                  <input type="text" name="stock" class="form-control" id="id" data-rule="number" data-msg="재고를 입력해주세요." value="${adminmenudetail.stock }" />
                  <div class="validate"></div>
                </div>
<input type="hidden" name="img1" class="form-control" id="img1" value="${adminmenudetail.img1 }" />
<input type="hidden" name="img2" class="form-control" id="img2" value="${adminmenudetail.img2 }" />
<input type="hidden" name="img3" class="form-control" id="img3" value="${adminmenudetail.img3 }" />
                <div class="col-md-12 form-group">
                  <label for="name">카테고리</label>
                  	<select class="form-control">
						<option>음식</option>
						<option>음료</option>
						<option>아이스크림</option>
					</select>
                </div>
<input type="hidden" name="menu_code" class="form-control" id="menu_code" value="${adminmenudetail.menu_code }" />
                <div class="col-md-12 form-group">
                  <label for="name">대표 이미지</label>
                  <input type="file" name="mf" class="form-control" id="mf" data-msg="이미지를 첨부해주세요." />
                  <div class="validate"></div>
                </div>


          <!--       <div class="col-md-12 mb-3">
                  <div class="loading">Loading</div>
                  <div class="error-message"></div>
                  <div class="sent-message">회원가입이 완료되었습니다.</div>
                </div> -->
				
			
                <div class="col-md-6 form-group">
                  <input type="submit" class="readmore d-block w-100" value="수정">
                </div>
                 <div class="col-md-6 form-group">
                  <input type="button" class="readmore d-block w-100" value="삭제" onclick="location.href='adminmenudelete.mc?menu_code=${adminmenudetail.menu_code }'">
                </div>
              </div>

            </form> 

          </div>


<!-- 원래 있던곳 -->
        </div>
        			</div>
			</section>
			</main>