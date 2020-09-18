<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
  <main id="main">

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
          <div class="col-md-12 mb-5 mb-md-0" data-aos="fade-up">

            <form action="admincontactupdate.mc" method="post" role="form" class="php-email-form">

              <div class="row">
                <input type="hidden" name=id value="${admincontactdetail.id }" readonly/>
                <div class="col-md-6 form-group">
                  <label for="name">이름</label>
                  <input type="text" name="name" value="${admincontactdetail.name }" class="form-control" id="name" data-rule="minlen:2" data-msg="이름을 입력해주세요." readonly />
                  <div class="validate"></div>
                </div>
                <div class="col-md-6 form-group">
                  <label for="name">이메일</label>
                  <input type="email" class="form-control" value="${admincontactdetail.email }" name="email" id="email" data-rule="email" data-msg="Please enter a valid email" readonly />
                  <div class="validate"></div>
                </div>
                <div class="col-md-12 form-group">
                  <label for="name">제목</label>
                  <input type="text" class="form-control" name="subject" value="${admincontactdetail.subject }" id="subject" data-rule="required" data-msg="제목을 입력해주세요." readonly />
                  <div class="validate"></div>
                </div>
                <div class="col-md-12 form-group">
                  <label for="name">내용</label>
                  <textarea class="form-control" name="message" cols="30" rows="10" data-rule="required" data-msg="Please write something for us" readonly>${admincontactdetail.message }</textarea>
                  <div class="validate"></div>
                  <input type="hidden" name=regdate value="${admincontactdetail.regdate }" readonly/>
                </div>

                <div class="col-md-6 form-group">
                  <input type="button" class="readmore d-block w-100" value="글 목록" onclick="location.href='contactselect.mc'">
                </div>
                </div>
            </form>
              </div>


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


    </section>

  </main><!-- End #main -->

  <!-- ======= Footer ======= -->
  <footer class="footer" role="contentinfo">
    <div class="container">
      <div class="row">
        <div class="col-sm-6">
          <p class="mb-1">&copy; Copyright MyPortfolio. All Rights Reserved</p>
          <div class="credits">
            <!--
            All the links in the footer should remain intact.
            You can delete the links only if you purchased the pro version.
            Licensing information: https://bootstrapmade.com/license/
            Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/buy/?theme=MyPortfolio
          -->
            Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
          </div>
        </div>
        <div class="col-sm-6 social text-md-right">
          <a href="#"><span class="icofont-twitter"></span></a>
          <a href="#"><span class="icofont-facebook"></span></a>
          <a href="#"><span class="icofont-dribbble"></span></a>
          <a href="#"><span class="icofont-behance"></span></a>
        </div>
      </div>
    </div>
  </footer>

  <a href="#" class="back-to-top"><i class="icofont-simple-up"></i></a>
