<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
    String id = request.getParameter("id");
    String pwd = request.getParameter("pwd");
    String quiz = request.getParameter("quiz");
    
   	System.out.println(id+" "+pwd+" "+quiz);
    Thread.sleep(1000);
    if(id.equals("id01") && pwd.equals("pwd01") && Integer.parseInt(quiz)== 50){
   	 	out.print("1");
   	}else if(id.equals("id01") && pwd.equals("pwd01") && Integer.parseInt(quiz) < 50){
   	 	out.print("3");
  	  }else if(id.equals("id01") && pwd.equals("pwd01") && Integer.parseInt(quiz) > 50){
  	  	out.print("4");
  	  }else{
  	  	out.print("2");
  	  }
   %>