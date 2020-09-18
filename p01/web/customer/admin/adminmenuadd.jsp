<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        		  <main id="main">

    <section class="section pb-5">
      <div class="container">
        <div class="row">
        </div>

      </div>
    </section>
          <div class="col-md-6 mb-5 mb-md-0" data-aos="fade-up">

           <form action="adminmenuaddimpl.mc" enctype="multipart/form-data" method="post" class="php-email-form">
				<!-- 회원가입 입력 창  -->
              <div class="row">
                <div class="col-md-12 form-group">
                  <label for="name">제품명</label>
                  <input type="text" name="name" class="form-control" id="id" data-rule="required" data-msg="제품명을 입력해주세요." />
                  <div class="validate"></div>
                </div>
                <div class="col-md-12 form-group">
                  <label for="name">가격</label>
                  <input type="text" name="price" class="form-control" id="id" data-rule="required" data-msg="가격을 입력해주세요." />
                  <div class="validate"></div>
                </div>              
                <div class="col-md-12 form-group">
                  <label for="name">재고</label>
                  <input type="text" name="stock" class="form-control" id="id" data-rule="number" data-msg="재고를 입력해주세요." />
                  <div class="validate"></div>
                </div>
                <div class="col-md-12 form-group">
                  <label for="name">카테고리</label>
					<select class="form-control">
						<option>음식</option>
						<option>음료</option>
						<option>아이스크림</option>
					</select>
                </div>
                <div class="col-md-12 form-group">
                  <label for="name">대표 이미지</label>
                  <input type="file" name="mf"/>
                </div>


          <!--       <div class="col-md-12 mb-3">
                  <div class="loading">Loading</div>
                  <div class="error-message"></div>
                  <div class="sent-message">회원가입이 완료되었습니다.</div>
                </div> -->
				
			
                <div class="col-md-6 form-group">
                  <input type="submit" class="readmore d-block w-100" value="추가">
                </div>
                 <div class="col-md-6 form-group">
                  <input type="button" class="readmore d-block w-100" value="취소" onclick="location.href='adminmenu.mc'">
                </div>
              </div>

            </form> 

          </div>


<!-- 원래 있던곳 -->
			</main>