package com.app;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Service;
import com.vo.User;


public class App {

	public static void main(String[] args) {
		System.out.println("App Start ......");
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("myspring.xml");
		System.out.println("Spring Started ......");
		
		// IoC
		Service service = 
				(Service)factory.getBean("uservice");
//		(register)		
		User user = new User("id09","pwd01","name");
		try {
			service.register(user);
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
//		(get)
//		User dbuser = null;
//		try {
//			dbuser = (User) service.get("id01");
//			System.out.println("result:"+dbuser);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		(remove)
//			try {
//				service.remove("id01");
//				System.out.println("OK");
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		(modify)
//		User user = new User("id11","pwd03","name1");
//		try {
//			service.modify(user);
//			System.out.println(user);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		(selectall)
//		ArrayList<User> list = null;
//		try {
//			list = service.get();
//			for(User u:list) {
//				System.out.println(u);
//				}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		factory.close();
		System.out.println("Spring End ......");
		System.out.println("App End ......"
);
		
		
	}

}
