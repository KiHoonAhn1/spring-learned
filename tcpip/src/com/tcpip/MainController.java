package com.tcpip;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chat.Client;

@Controller
public class MainController {
	
	Client client;
	
	public MainController() {
		client = new Client("192.168.0.19",5555,"[KihOOn]");
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
		client.sendTarget("/192.168.0.19", "100"); //target은 client
	}
	@RequestMapping("/phone.mc")
	public void phone() {
		System.out.println("Phone Send Start");
		client.sendTarget("/192.168.0.20", "101");
	}
}
