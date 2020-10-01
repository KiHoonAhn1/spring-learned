package hiveapp;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

public class App {

	String url;
	
	public App() {
	}
	
	public void getData() {
		for(int i=1;i<60;i++) {
			
			Random r = new Random();
			double speed = r.nextInt(200);
			CarStatus cstatus = new CarStatus("car01",speed, 24, 90, 1500);
			
			try {
				sendData(cstatus);
				System.out.println("Send Data..."+speed);
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
	
	public void sendData(CarStatus cs) throws Exception {
				url = "http://192.168.0.222/hive/carstatus.mc";
				url += "?id="+cs.getId()+"&speed="+cs.getSpeed()+"&temp="+cs.getTemp()+
						"&oiltemp="+cs.getOiltemp()+"&rpm="+cs.getRpm();
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
	      App app = new App();
	      app.getData();
	}
	
}

