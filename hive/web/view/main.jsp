<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/modules/series-label.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
<script src="https://code.highcharts.com/modules/export-data.js"></script>
<script src="https://code.highcharts.com/modules/accessibility.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
</head>
<body>
<h1>Main Page</h1>

<ul>
	<li><a href="shop.mc?id=id01&item=it01&price=30000">오늘의 운세</a></li>
	<li><a href="shop.mc?id=id02&item=it02&price=20000">주간 운세</a></li>
	<li><a href="shop.mc?id=id03&item=it03&price=50000">내 정보</a></li>
	<li><a href="shop.mc?id=id04&item=it04&price=10000">로그아웃</a></li>
</ul>
	
<h3><a href="chart1.mc">주간 운세</a></h3>
<h3><a href="chart2.mc">월간 운세</a></h3>
<h3><a href="chart3.mc">.</a></h3>
	<c:choose>
		<c:when test="${centerpage == null}">
			<jsp:include page="center.jsp"></jsp:include>
		</c:when>
		<c:otherwise>
			<jsp:include page="${centerpage}.jsp"></jsp:include>
		</c:otherwise>
	</c:choose>
</body>
</html>