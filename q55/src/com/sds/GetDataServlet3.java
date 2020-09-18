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
 * Servlet implementation class GetDataServlet3
 */
@WebServlet({ "/GetDataServlet3", "/getdata3" })
public class GetDataServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1.DB���� �����͸� �����´�.
		ArrayList<User> list = new ArrayList<>();
		list.add(new User("id01","pwd01","�̸���"));
		list.add(new User("id02","pwd02","�踻��"));
		list.add(new User("id03","pwd03","������"));
		list.add(new User("id04","pwd04","�۸���"));
		list.add(new User("id05","pwd05","����"));
		//2. JSON���� �����.
		JSONArray ja = new JSONArray();
		for(User u:list) {
			JSONObject obj = new JSONObject();
			obj.put("id", u.getId());
			obj.put("pwd", u.getPwd());
			obj.put("name", u.getName());
			ja.add(obj);
		}
		
//		JSONArray ja = new JSONArray(); //[]�� ����, object�� {}
//		
//		JSONObject jo1 = new JSONObject();
//		jo1.put("id","id01");
//		jo1.put("pwd","pwd01");
//		jo1.put("name","�̸���");
//		ja.add(jo1);
		//3. Response�Ѵ�.
		response.setContentType("text/json; charset=euc-kr");
		PrintWriter out = response.getWriter();
			out.print(ja.toJSONString());	
	}

}
