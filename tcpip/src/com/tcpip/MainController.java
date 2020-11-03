package com.tcpip;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chat.Client;

@Controller
public class MainController {
	
	Client client;
	
	public MainController() {
		client = new Client("192.168.0.9",5555,"[KihOOn]");
		try {
			client.connect();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("/main.mc")
	public ModelAndView main() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("main");
		return mv;
	}
	@RequestMapping("/iot.mc")
	public void iot() {
		System.out.println("IoT Send Start");
		client.sendTarget("/192.168.0.28", "100"); //target은 client
	}
	@RequestMapping("/phone.mc")
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		URL url = null;
		try {
			url = new URL(" 	");
		} catch (MalformedURLException e) {
			System.out.println("Error while creating Firebase URL | MalformedURLException");
			e.printStackTrace();
		}
		HttpURLConnection conn = null;
		try {
			conn = (HttpURLConnection) url.openConnection();
		} catch (IOException e) {
			System.out.println("Error while createing connection with Firebase URL | IOException");
			e.printStackTrace();
		}
		conn.setUseCaches(false);
		conn.setDoInput(true);
		conn.setDoOutput(true);
		conn.setRequestProperty("Content-Type", "application/json");

		// set my firebase server key
		conn.setRequestProperty("Authorization", "key="
				+ "AAAA1QPOVlw:APA91bEV9bt3wUWPWsqHx-5v6NEpvE8_pbIX0RY87BnAQzlrmrkMTGsbFR3xnblWvgut9Rj-xQWsyrl3rwn7ags1NEiCdZm0gqu7kCIYZxK0qoz2xUEIPgGq74HAJ_FeVmPhUYVps3rG" + 
				"");

		// create notification message into JSON format
		JSONObject message = new JSONObject();
		message.put("to", "/topics/car");
		message.put("priority", "high");
		JSONObject notification = new JSONObject();
		
		notification.put("title", "title1");
		notification.put("body", "body1");
		message.put("notification", notification);
		
		JSONObject data = new JSONObject();
		data.put("control", "control1");
		data.put("data", 100);
		message.put("data", data);


		try {
			OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
			out.write(message.toString());
			out.flush();
			conn.getInputStream();
			System.out.println("OK...............");

		} catch (IOException e) {
			System.out.println("Error while writing outputstream to firebase sending to ManageApp | IOException");
			e.printStackTrace();
		}	
			
}
}
