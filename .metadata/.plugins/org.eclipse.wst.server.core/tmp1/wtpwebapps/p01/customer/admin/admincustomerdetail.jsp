<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script>
    //본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.
    function sample4_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var roadAddr = data.roadAddress; // 도로명 주소 변수
                var extraRoadAddr = ''; // 참고 항목 변수

                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraRoadAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraRoadAddr !== ''){
                    extraRoadAddr = ' (' + extraRoadAddr + ')';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample4_postcode').value = data.zonecode;
                document.getElementById("adress").value = roadAddr;
                
                // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
            //    if(roadAddr !== ''){
            //        document.getElementById("sample4_extraAddress").value = extraRoadAddr;
            //    } else {
            //        document.getElementById("sample4_extraAddress").value = '';
            //    }

                var guideTextBox = document.getElementById("guide");
                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
                if(data.autoRoadAddress) {
                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                    guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                    guideTextBox.style.display = 'block';

                } else {
                    guideTextBox.innerHTML = '';
                    guideTextBox.style.display = 'none';
                }
            }
        }).open();
    }
</script>
                <section class="section pb-5">
      <div class="container">

        <div class="row mb-5 align-items-end">
          <div class="col-md-6" data-aos="fade-up">
            <h2>Contact</h2>
            <p class="mb-0">Lorem ipsum dolor sit amet consectetur adipisicing elit. Quisquam necessitatibus incidunt ut
              officiis explicabo inventore.
            </p>
          </div>

        </div>

        <div class="row">
          <div class="col-md-6 mb-5 mb-md-0" data-aos="fade-up">
            
            <form action="customerupdateimpl.mc" method="post" role="form" class="php-email-form">
				<!-- 회원가입 입력 창  -->
              <div class="row">
                <div class="col-md-12 form-group">
                  <label for="name">아이디</label>
                  <input type="text" value="${admincustomerdetail.id }" name="id" class="form-control" id="id" data-rule="minlen:4" data-msg="아이디를 4글자 이상 입력해주세요." />
                  <div class="validate"></div>
                </div>
                <div class="col-md-12 form-group">
                  <label for="name">비밀번호</label>
                  <input type="password" value="${admincustomerdetail.pwd }" class="form-control" name="pwd" id="pwd" data-rule="minlen:4" data-msg="비밀번호를 5글자 이상 입력해주세요." />
                  <div class="validate"></div>
                </div>
                <div class="col-md-12 form-group">
                  <label for="name">이름</label>
                  <input type="text" value="${admincustomerdetail.name }" class="form-control" name="name" id="name" data-rule="required" data-msg="이름을 입력해주세요." />
                  <div class="validate"></div>
                </div>
                <div class="col-md-12 form-group">
                  <label for="name">주소</label>
          
                <div class="col-md-12 mb-5 form-group">
				<input type="text" value="${admincustomerdetail.adress }" name="adress" id="adress" placeholder="도로명주소" size="70" >
				<span id="guide" style="color:#999;display:none"></span><br><br>
           		
             <!-- 주소 검색  -->
                </div>
                </div>

       <!--         <div class="col-md-12 mb-3">
                  <div class="loading">Loading</div>
                  <div class="error-message"></div>
                  <div class="sent-message">회원가입이 완료되었습니다.</div>
                </div>-->

			
                <div class="col-md-6 form-group">
                  <input type="submit" class="readmore d-block w-100" value="정보 수정">
                </div>
                 <div class="col-md-6 form-group">
                  <input type="button" class="readmore d-block w-100" value="삭제" onclick="location.href='admincustomerdelete.mc?id=${admincustomerdetail.id }'">
                </div>
                <div class="col-md-12 form-group">
                  <input type="button" class="readmore d-block w-100" value="주문 내역" onclick="location.href='customerorder.mc?id=${admincustomerdetail.id }'">
                </div>
              </div>

            </form>

          </div>
          <div class="col-md-4 ml-auto order-2" data-aos="fade-up">
            <ul class="list-unstyled">
              <li class="mb-3">
                <strong class="d-block mb-1">Address</strong>
                <span>203 Fake St. Mountain View, San Francisco, California, USA</span>
              </li>
              <li class="mb-3">
                <strong class="d-block mb-1">Phone</strong>
                <span>+1 232 3235 324</span>
              </li>
              <li class="mb-3">
                <strong class="d-block mb-1">Email</strong>
                <span>youremail@domain.com</span>
              </li>
            </ul>
          </div>

        </div>

      </div>

    </section>

  </main><!-- End #main -->