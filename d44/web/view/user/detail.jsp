<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<style>
h1{
	font-size:200%;
	color:red;
}
</style>
<div id="center">
	<h1>User Detail page</h1>
	<h2>���̵� : ${userdetail.id }</h2>
	<h2>��й�ȣ : ${userdetail.id }</h2>
	<h2>�̸� : ${userdetail.name }</h2>
	<h3><a href="userdelete.mc?id=${shopdetail.id }">DELETE</a></h3>
	<h3><a href="userupdate.mc?id=${shopdetail.id }">UPDATE</a></h3>
</div>