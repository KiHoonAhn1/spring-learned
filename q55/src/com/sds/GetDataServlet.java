package com.sds;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetDataServlet
 */
@WebServlet({ "/GetDataServlet", "/getdata" })
public class GetDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("Call Service Method");
		//DATA �����ؼ� Response
		//AJAX
		Random r = new Random();
		int num = r.nextInt(100)+1;
		
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter();
		if(num < 50) {
			out.print(num+"����");			
		} else {
			out.print("dd"+num);
		}
		
	}

}
