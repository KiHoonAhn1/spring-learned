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
 * Servlet implementation class GetServer
 */
@WebServlet({ "/GetServer", "/getS" })
public class GetServer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		ArrayList<Item> list = new ArrayList<>();
		
		if(cmd.equals("0")) {
		list.add(new Item("001","�Ұ�����",3000,"h1.png",10));
		list.add(new Item("002","Ʈ����ġ������",4000,"h2.png",20));
		list.add(new Item("003","ġ�����",3000,"h3.png",30));
		list.add(new Item("004","1955����",4500,"h4.png",40));
		list.add(new Item("005","�������",5000,"h5.png",50));
		}else if(cmd.equals("1")) {
		list.add(new Item("001","��������",1500,"s1.png",10));
		list.add(new Item("002","ġ�ƽ",2000,"s2.png",20));
		list.add(new Item("003","�Ƴʰ�",1800,"s3.jpg",30));
		list.add(new Item("004","����Ƣ��",2000,"s4.png",40));
		list.add(new Item("005","����",3300,"s5.png",50));	
		}else if(cmd.equals("2")) {
		list.add(new Item("001","�ݶ�",1500,"b1.png",10));
		list.add(new Item("002","���̴�",1000,"b2.png",20));
		list.add(new Item("003","ȯŸ",1000,"b3.png",30));
		list.add(new Item("004","�����ݶ�",1000,"b4.png",40));
		list.add(new Item("005","���̽�Ƽ",1500,"b5.png",50));	
		}
		
		JSONArray ja = new JSONArray();
		for(Item u :list) {
			JSONObject obj = new JSONObject();
			obj.put("name", u.getName());
			obj.put("price", u.getPrice());
			obj.put("img", u.getImg());
			obj.put("stock", u.getStock());
			ja.add(obj);
		}
		
		response.setContentType("text/json;charset=euc-kr");
		PrintWriter out = response.getWriter();
		out.print(ja.toJSONString());

	}

}
