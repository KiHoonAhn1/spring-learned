<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

</head>
<script type="text/javascript">
alert('아이디/비밀번호를 확인해주세요.');
location.href="<%= request.getContextPath() %>/login.mc"
</script>
<body>

</body>
</html>