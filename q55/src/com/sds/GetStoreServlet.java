package com.sds;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Servlet implementation class GetStoreServlet
 */
@WebServlet({ "/GetStoreServlet", "/store" })
public class GetStoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String cmd = request.getParameter("cmd");
		
		ArrayList<Store> list = new ArrayList<>();
		if(cmd.equals("0")) {
		list.add(new Store("�Ƶ����� �Ｚ����",37.508259, 127.058771));
		list.add(new Store("�Ƶ����� �ＺDT��",37.511331, 127.047556));
		list.add(new Store("�Ƶ����� �Ｚ�ڿ�����",37.509400, 127.062026));
		}else if(cmd.equals("1")) {
		list.add(new Store("�Ƶ����� ���� 3ȣ��", 35.154546, 129.061095));
		list.add(new Store("�Ƶ����� ���� DT��", 35.165319, 129.064711));
		list.add(new Store("�Ƶ����� ������", 35.155358, 129.038390));
		}
		
		JSONArray ja = new JSONArray();
		for(Store s:list) {
			
			JSONObject jo = new JSONObject();
			jo.put("name", s.getName());
			jo.put("lat", s.getLat());
			jo.put("lng", s.getLng());
			
			ja.add(jo);
			
		}	
		
			response.setContentType("text/json;charset=euc-kr");
			PrintWriter out = response.getWriter();
				out.print(ja.toJSONString());
	}

}
