package hive;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ChartController {
	String url = "jdbc:hive2://192.168.111.120:10000/default";
	String id = "root";
	String password = "111111";
	
	public ChartController() {
		try {
			Class.forName("org.apache.hive.jdbc.HiveDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	@RequestMapping("/getdata1.mc")
	@ResponseBody
	public void getdata1(HttpServletResponse res) throws Exception {
		
		Connection con = null;
		JSONArray ja = new JSONArray();
		try {
			con = DriverManager.getConnection(url, id, password);
			PreparedStatement pstmt = con.prepareStatement(
					"SELECT * FROM hdi limit 20"
					);
			ResultSet rset = pstmt.executeQuery();
			// [{name: 'Sweden',data:[0.904 81.0 11.0],{}]
			while(rset.next()) {
				JSONObject jo = new JSONObject();
				jo.put("name", rset.getString(2));
				JSONArray jo2 = new JSONArray();
				jo2.add(rset.getFloat(3));
				jo2.add(rset.getFloat(4));
				jo2.add(rset.getFloat(5));
				
				jo.put("data", jo2);
				ja.add(jo);
			}
		}catch(Exception e) {
			throw e;
		}finally {
			con.close();
		}
		
		 res.setCharacterEncoding("UTF-8");
	        res.setContentType("application/json");
	        PrintWriter out = res.getWriter();
	        out.print(ja.toJSONString());
	        out.close();

	
	}
	@RequestMapping("/getdata2.mc")
	@ResponseBody
	public void getdata2(HttpServletResponse res) throws Exception {
		
		Connection con = null;
		JSONArray ja = new JSONArray();
		try {
			con = DriverManager.getConnection(url, id, password);
			PreparedStatement pstmt = con.prepareStatement(
					"SELECT * FROM SUBWAY limit 10"
					);
			ResultSet rset = pstmt.executeQuery();
			while(rset.next()) {
				JSONObject jo = new JSONObject();
				jo.put("name", rset.getString(3));
				JSONArray jo2 = new JSONArray();
				jo2.add(rset.getFloat(4));
				jo2.add(rset.getFloat(5));
				jo2.add(rset.getFloat(6));
				jo.put("data", jo2);
				ja.add(jo);
			}
		}catch(Exception e) {
			throw e;
		}finally {
			con.close();
		}
		
		 res.setCharacterEncoding("UTF-8");
	        res.setContentType("application/json");
	        PrintWriter out = res.getWriter();
	        out.print(ja.toJSONString());
	        out.close();
	}
	


	@RequestMapping("/getdata3.mc")
	@ResponseBody
	public void getdata3(HttpServletResponse res) throws Exception {
		
		Connection con = null;
		JSONArray ja = new JSONArray();
		try {
			con = DriverManager.getConnection(url, id, password);
			PreparedStatement pstmt = con.prepareStatement(
					"SELECT * FROM SUBWAY limit 10"
					);
			ResultSet rset = pstmt.executeQuery();
			while(rset.next()) {
				JSONObject jo = new JSONObject();
				jo.put("name", rset.getString(3));
				JSONArray jo2 = new JSONArray();
				jo2.add(rset.getFloat(4));
				jo2.add(rset.getFloat(5));
				jo2.add(rset.getFloat(6));
				jo.put("data", jo2);
				ja.add(jo);
			}
		}catch(Exception e) {
			throw e;
		}finally {
			con.close();
		}
		
		 res.setCharacterEncoding("UTF-8");
	        res.setContentType("application/json");
	        PrintWriter out = res.getWriter();
	        out.print(ja.toJSONString());
	        out.close();
	}
	
}
