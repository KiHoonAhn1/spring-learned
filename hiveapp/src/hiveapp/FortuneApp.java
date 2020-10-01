package hiveapp;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

public class FortuneApp {

	String url;
	
	public FortuneApp() {
	}
	
	public void getData() {
		String luck = null;
		for(int i=1;i<8;i++) {
			Random r = new Random();
			int lucky = r.nextInt(4);
			if(lucky == 0) {
				luck = "대흉";
			}else if(lucky==1) {
				luck = "흉";
			}else if(lucky==2) {
				luck = "길";
			}else {
				luck = "대길";
			}
			
			FortuneToday fstatus = new FortuneToday("기훈", 27, "남", luck);
			
			try {
				sendData(fstatus);
				System.out.println("Send Data..."+luck);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
	
	public void sendData(FortuneToday ft) throws Exception {
				url = "http://192.168.0.222/hive/fortunetoday.mc";
				url += "?name="+ft.getName()+"&age="+ft.getAge()+"&gender="+ft.getGender()+
						"&luck="+ft.getLuck();
				System.out.println(url);
				URL curl = new URL(url);
				HttpURLConnection con = 
				(HttpURLConnection)curl.openConnection();
				try{
				con.getInputStream();
				con.setReadTimeout(5000);
				con.setRequestMethod("POST");
				}catch(Exception e) {
					throw e;
				}finally {
				con.disconnect();
				}
	}
	
	public static void main(String[] args) {
	      FortuneApp app = new FortuneApp();
	      app.getData();
	}
	
}

