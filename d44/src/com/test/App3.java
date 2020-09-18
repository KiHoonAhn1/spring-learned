package com.test;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;import com.frame.Biz;
import com.vo.ShopVO;
import com.vo.UserVo;


public class App3 {

	public static void main(String[] args) {
		System.out.println("App Start ......");
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("myspring.xml");
		System.out.println("Spring Started ......");
		
		// IoC
		Biz<Integer,ShopVO> biz = 
				(Biz)factory.getBean("sbiz");
//		(register)		
//		ShopVo u = new ShopVo("¹ÙÁö",10000,"pants.jpg");
//		try {
//			biz.register(u);
//			System.out.println(u);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		(get)
//		ShopVo s = null;
//		try {
//			s = (ShopVo) biz.get(100);
//			System.out.println("result:"+s);
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
//		ArrayList<ShopVo> list = null;
//		try {
//			list = biz.get();
//			for(ShopVo c:list) {
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
