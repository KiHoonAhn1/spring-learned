package com.app;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Search;
import com.frame.Service;
import com.vo.Item;
import com.vo.User;


public class SearchApp {

	public static void main(String[] args) {
		System.out.println("App Start ......");
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("myspring.xml");
		System.out.println("Spring Started ......");
		
		// IoC
		Search search = 
				(Search)factory.getBean("iservice");
	
//		(register)		
//		Item item = new Item("id0111","name1", 10000, null);
//		try {
//			service.register(item);
//			System.out.println("OK");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		(get)
//		Item dbitem = null;
//		try {
//			dbitem = (Item) service.get("id0111");
//			System.out.println("result:"+dbitem);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		(remove)
//			try {
//				service.remove("id0111");
//				System.out.println("OK");
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		(modify)
//		Item item = new Item("it88","¹ÝÆÈ",10000,new Date());
//		try {
//			service.modify(item);
//			System.out.println(item);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		(selectall)
//		ArrayList<Item> list = null;
//		try {
//			list = service.get();
//			for(Item i : list) {
//				System.out.println(i);
//				}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		(search)
		ArrayList<User> list = null;
		try {
			list = search.search("±è");
			for(User u : list) {
				System.out.println(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
			}
		
		factory.close();
		System.out.println("Spring End ......");
		System.out.println("App End ......"
);
		
		
	}

}
