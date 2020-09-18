<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>MyPortfolio Bootstrap Template - Contact</title>
  <meta content="" name="descriptison">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="customer/assets/img/favicon.png" rel="icon">
  <link href="customer/assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=https://fonts.googleapis.com/css?family=Inconsolata:400,500,600,700|Raleway:400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="customer/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="customer/assets/vendor/icofont/icofont.min.css" rel="stylesheet">
  <link href="customer/assets/vendor/aos/aos.css" rel="stylesheet">
  <link href="customer/assets/vendor/line-awesome/css/line-awesome.min.css" rel="stylesheet">
  <link href="customer/assets/vendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">

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

<section>
	<c:choose>
		<c:when test="${mycustomer.id =='admin'}">
			<jsp:include page="adminnav.jsp"></jsp:include>
		</c:when>
		<c:otherwise>
			<jsp:include page="nav.jsp"></jsp:include>
		</c:otherwise>
	</c:choose>
</section>

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
          <div class="col-md-6 mb-5 mb-md-0" data-aos="fade-up">

            <form action="contactaddimpl.mc" method="post" role="form" class="php-email-form">

              <div class="row">
                <input type="hidden" name=id value="${mycustomer.id }" />
                <div class="col-md-6 form-group">
                  <label for="name">이름</label>
                  <input type="text" name="name" value="${mycustomer.name }" class="form-control" id="name" data-rule="minlen:2" data-msg="이름을 입력해주세요." readonly />
                  <div class="validate"></div>
                </div>
                <div class="col-md-6 form-group">
                  <label for="name">이메일</label>
                  <input type="email" class="form-control" name="email" id="email" data-rule="email" data-msg="Please enter a valid email" />
                  <div class="validate"></div>
                </div>
                <div class="col-md-12 form-group">
                  <label for="name">제목</label>
                  <input type="text" class="form-control" name="subject" id="subject" data-rule="required" data-msg="제목을 입력해주세요." />
                  <div class="validate"></div>
                </div>
                <div class="col-md-12 form-group">
                  <label for="name">내용</label>
                  <textarea class="form-control" name="message" cols="30" rows="10" data-rule="required" data-msg="내용을 입력해주세요."></textarea>
                  <div class="validate"></div>
                </div>

                <div class="col-md-6 form-group">
                  <input type="submit" class="readmore d-block w-100" value="글쓰기" onclick="location.href='contactselect.mc'">
                </div>
                <div class="col-md-6 form-group">
                   <input type="button" class="readmore d-block w-100" value="취소" onclick="location.href='contactselect.mc'">
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