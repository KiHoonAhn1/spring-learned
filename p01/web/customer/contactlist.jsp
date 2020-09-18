<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

 <div id="cont" style="width: 800px; text-align:center;">
	<div style="margin: 70px; margin-left: 120px; margin-top:0; width: 100%;">
		<div style="float: right;">
			<select name="year" id="year">
				<option value="-전체검색-" selected="">전체검색</option>
				<option value="제목">제목</option>
				<option value="작성자">작성자</option>
			</select> <input type="text" name="text">
			<button type="button" name="검색">검색</button>
			<p></p>
		</div>
		<table border="1" style="clear: both; width: 100%; text-align:center;">
				<tr>
					<td width="50">번호</td>
					<td width="430">제목</td>
					<td width="60">작성자</td>
					<td width="110">등록일시</td>
				</tr>
<c:forEach var="c" items="${admincontactlist }">
	
	<tr>
	
	<td width="50">${c.contact_code }</td>
		<td width="430"><a href="contactdetail.mc?contact_code=${c.contact_code }">${c.subject }</a></td>
		<td width="60">${c.id }</td>
		<td width="110">${c.regdate }</td>
	</tr>
</c:forEach>
		</table>
	<p></p>
	<div style="float: right;">
		<button type="button" name="목록">목록</button>
		<button type="button" name="글쓰기"
			onclick="location.href='contact.mc'">글쓰기</button>
	</div>
	</div>
</div>
        
