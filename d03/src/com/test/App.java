package com.test;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;import com.frame.Biz;
import com.vo.ContentsVo;


public class App {

	public static void main(String[] args) {
		System.out.println("App Start ......");
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("myspring.xml");
		System.out.println("Spring Started ......");
		
		// IoC
		Biz<Integer,ContentsVo> biz = 
				(Biz)factory.getBean("cbiz");
//		(register)		
		ContentsVo c = new ContentsVo("title6","contents6","������");
		try {
			biz.register(c);
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
//		(get)
//		ContentsVo c = null;
//		try {
//			c = (ContentsVo) biz.get(100);
//			System.out.println("result:"+c);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		(remove)
//			try {
//				biz.remove(140);
//				System.out.println("OK");
//			} catch (Exception e) {
//				e.printStackTrace();	
//			}
//		(modify)
//		ContentsVo c = new ContentsVo(100,"title1","contents1","�̹��");
//		try {
//			biz.modify(c);
//			System.out.println(c);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		(selectall)
//		ArrayList<ContentsVo> list = null;
//		try {
//			list = biz.get();
//			for(ContentsVo c:list) {
//				System.out.println(c);
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
