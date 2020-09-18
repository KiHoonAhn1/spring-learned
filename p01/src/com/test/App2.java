package com.test;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;import com.frame.Biz;
import com.vo.MenuVO;


public class App2 {

	public static void main(String[] args) {
		System.out.println("App Start ......");
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("myspring.xml");
		System.out.println("Spring Started ......");
		
		// IoC
		Biz<Integer, MenuVO> biz = 
				(Biz)factory.getBean("mbiz");
//		(register)		
//		UserVo u = new UserVo("id1","pwd01","name¿Ã");
//		try {
//			biz.register(u);
//			System.out.println(u);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		(get)
//		MenuVO u = null;
//		try {
//			m = (MenuVO) biz.get("id1");
//			System.out.println("result:"+m);
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
		MenuVO m = new MenuVO(10001,"ππ¡ˆ",100,100,"bg.jpg","a.a","a.b","1");
		try {
			biz.modify(m);
			System.out.println(m);
		} catch (Exception e) {
			e.printStackTrace();
		}
//		(selectall)
//		ArrayList<MenuVO> list = null;
//		try {
//			list = biz.get();
//			for(MenuVO m:list) {
//				System.out.println(m);
//				}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
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
