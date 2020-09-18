<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="center">
<h1>Register Page</h1>

<form enctype="multipart/form-data" 
 action="shopaddimpl.mc" method="post">
NAME<input type="text" name="name"><br>
PRICE<input type="number" name="price"><br>
IMG<input type="file" name="mf"><br>
<input type="submit" value="REGISTER">
</form>

</div>
