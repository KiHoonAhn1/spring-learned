package a01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OracleTest {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:oracle:thin:@192.168.111.101:1521:xe";
		String id = "shop";
		String password = "111111";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, id, password);
		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM ITEMS");
		ResultSet rset = pstmt.executeQuery();
		while(rset.next()) {
			String did = rset.getString("ID");
			String name = rset.getString("NAME");
			String price = rset.getString("PRICE");
			System.out.println(did+" "+name+" "+price);
		}
		con.close();
	}

}
