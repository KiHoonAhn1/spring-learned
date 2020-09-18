<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
*{
	margin:0;
	padding:0;
}
header{
	width:700px;
	height:150px;
	background:red;
	margin:0 auto;
}
section{
	width:700px;
	height:600px;
	background:gray;
	margin:0 auto;
}
footer{
	width:700px;
	height:30px;
	background:black;
	margin:0 auto;
}
header > h1 {
	margin:0 auto;
	width: 200px;
}
header > ul {
	margin:0 auto;
	width:500px;
	list-style:none;
}
header > ul > li{
	float:left;
	margin:0 10px;;
}
section > #center{
	width:500px;
	background:white;
	margin:0 auto;
	text-align: center;
	width:500px;
}
</style>
</head>
<body>
<header>
	<h1>Main Page</h1>
	<c:choose>
		<c:when test="${loginuser == null}">
			<ul>
				<li><a href="main.mc">Main</a></li>
				<li><a href="login.mc">Login</a></li>
			</ul>
		</c:when>
		<c:otherwise>
			<ul>
				<li>${loginuser.name }��</li>
				<li><a href="main.mc">Main</a></li>
				<li><a href="logout.mc">LOGOUT</a></li>
				<li><a href="useradd.mc">UserADD</a></li>
				<li><a href="userselect.mc">UserSELECT</a></li>
				<li><a href="shopadd.mc">ShopADD</a></li>
				<li><a href="shopselect.mc">ShopSelect</a></li>
			</ul>
		</c:otherwise>
	</c:choose>
</header>
<section>
	<c:choose>
		<c:when test="${centerpage == null}">
			<jsp:include page="center.jsp"></jsp:include>
		</c:when>
		<c:otherwise>
			<jsp:include page="${centerpage}.jsp"></jsp:include>
		</c:otherwise>
	</c:choose>
</section>
<footer>

</footer>
</body>
</html>