<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<div id="center">
<h1>Login Page</h1>
<form action="loginimpl.mc" method="post">
ID<input type="text" name="id" value="id01"><br>
PWD<input type="password" name="pwd" value="pwd01"><br>
<input type="submit" value="LOGIN">
</form>
</div>