<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h2>내 정보</h2><p></p>
            <form action="customerupdate.mc" method="post" role="form" class="php-email-form">
				<!-- 회원가입 입력 창  -->
              <div class="row">
                <div class="col-md-12 form-group">
                  <label for="name">아이디</label>
                  <input type="text" value="${mycustomer.id }" name="id" class="form-control" id="id" data-rule="minlen:4" data-msg="아이디를 4글자 이상 입력해주세요." readonly />
                  <div class="validate"></div>
                </div>
                <div class="col-md-12 form-group">
                  <label for="name">비밀번호</label>
                  <input type="password" value="${mycustomer.pwd }" class="form-control" name="pwd" id="pwd" data-rule="minlen:4" data-msg="비밀번호를 5글자 이상 입력해주세요." readonly />
                  <div class="validate"></div>
                </div>
                <div class="col-md-12 form-group">
                  <label for="name">이름</label>
                  <input type="text" value="${mycustomer.name }" class="form-control" name="name" id="name" data-rule="required" data-msg="이름을 입력해주세요." readonly />
                  <div class="validate"></div>
                </div>
                <div class="col-md-12 form-group">
                  <label for="name">주소</label>
          
                <div class="col-md-12 mb-5 form-group">
                <input type="text" id="sample4_postcode" placeholder="우편번호" readonly>
				<input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기"><br><br>
				<input type="text" value="${mycustomer.adress }" name="adress" id="adress" placeholder="도로명주소" size="70" readonly >
				<span id="guide" style="color:#999;display:none"></span><br><br>
				<input type="text" id="sample4_detailAddress" placeholder="상세주소" size="70" readonly >
           		
             <!-- 주소 검색  -->
                </div>
                </div>

       <!--         <div class="col-md-12 mb-3">
                  <div class="loading">Loading</div>
                  <div class="error-message"></div>
                  <div class="sent-message">회원가입이 완료되었습니다.</div>
                </div>-->

			
                <div class="col-md-6 form-group">
                  <input type="button" class="readmore d-block w-100" value="정보 수정" onclick="location.href='customerupdate.mc?id=${mycustomer.id }'" >
                </div>
                 <div class="col-md-6 form-group">
                  <input type="button" class="readmore d-block w-100" value="삭제" onclick="location.href='customerdelete.mc?id=${mycustomer.id }'">
                </div>
              </div>

            </form>

