package com.test;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;import com.frame.Biz;
import com.vo.UserVo;


public class App2 {

	public static void main(String[] args) {
		System.out.println("App Start ......");
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("myspring.xml");
		System.out.println("Spring Started ......");
		
		// IoC
		Biz<String,UserVo> biz = 
				(Biz)factory.getBean("ubiz");
//		(register)		
//		UserVo u = new UserVo("id04","pwd04","name");
//		try {
//			biz.register(u);
//			System.out.println(u);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		(get)
//		UserVo u = null;
//		try {
//			u = (UserVo) biz.get("id01");
//			System.out.println("result:"+u);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		(remove)
//			try {
//				biz.remove("id011");
//				System.out.println("OK");
//			} catch (Exception e) {
//				e.printStackTrace();	
//			}
//		(modify)
//		ContentsVo c = new ContentsVo(100,"title1","contents1","ÀÌ¹é¼÷");
//		try {
//			biz.modify(c);
//			System.out.println(c);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		(selectall)
		ArrayList<UserVo> list = null;
		try {
			list = biz.get();
			for(UserVo c:list) {
				System.out.println(c);
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
//		(search)
//		ArrayList<ContentsVo> list = null;
//		HashMap<String, Integer> smap = new HashMap<>();
//		smap.put("start", 20);
//		smap.put("end", 40);
//		try {
//			list = biz.search(smap);
//			for(ContentsVo cv : list) {
//				System.out.println(cv);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		factory.close();
		System.out.println("Spring End ......");
		System.out.println("App End ......"
);
		
		
	}

}
