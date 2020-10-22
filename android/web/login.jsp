<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
    String id = request.getParameter("id");
    String pwd = request.getParameter("pwd");
/*     String quiz = request.getParameter("quiz"); */
    System.out.println(id+" "+pwd);
    Thread.sleep(1000);
    if(id.equals("id01") && pwd.equals("pwd01")){
    	out.print("1");
    }else{
    	out.print("2");
    }
%>