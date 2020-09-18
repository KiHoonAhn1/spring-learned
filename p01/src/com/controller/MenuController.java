package com.controller;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.frame.Biz;
import com.vo.MenuVO;

@Controller
public class MenuController {

	@Resource(name="mbiz")
	Biz<Integer, MenuVO> biz;
	
	@RequestMapping("/adminmenuadd.mc")
	public ModelAndView shopadd(ModelAndView mv) {
		mv.addObject("centerpage", "adminmenuadd");
		mv.setViewName("admin/admin");
		return mv;
	}
	
	@RequestMapping("/adminmenuaddimpl.mc")
	public ModelAndView menuaddimpl(ModelAndView mv,
			MenuVO menu) {
		MultipartFile mf = menu.getMf();
		String imgname = mf.getOriginalFilename();
		menu.setImg1(imgname);
		System.out.println(imgname);
		try {
			biz.register(menu);
			Util.saveFile(menu.getMf());
		} catch (Exception e) {
			mv.addObject("centerpage", "admin/adminfail");
			e.printStackTrace();
		}
		/*
		 * mv.addObject("registershop", menu);
		 */		
		mv.addObject("centerpage", "adminmenu");
		mv.setViewName("admin/admin");
		return mv;
	}
	
	@RequestMapping("/menuselect.mc")
	@ResponseBody
	public void shopselect(HttpServletResponse res) throws Exception {
		ArrayList<MenuVO> list = null;
		list = biz.get();
		JSONArray ja = new JSONArray();
		for(MenuVO m : list) {
			JSONObject obj = new JSONObject();
			obj.put("name", m.getName());	
			obj.put("price", m.getPrice());
			obj.put("stock", m.getStock());
			obj.put("img", m.getImg1());
			obj.put("category", m.getCategory());
			obj.put("count", 0);
			ja.add(obj);
		}
	       res.setCharacterEncoding("utf-8");
	       res.setContentType("application/json");
	       PrintWriter out = res.getWriter();
	       out.print(ja.toJSONString());
	       out.close();
	}
	 
	@RequestMapping("/shopdetail.mc")
	public ModelAndView shopadd(ModelAndView mv,
			Integer id) {
		
		MenuVO dbshop = null;
		
		try {
			dbshop = biz.get(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.addObject("shopdetail", dbshop);
		mv.addObject("centerpage", "shop/detail");
		mv.setViewName("main");
		return mv;
		
	}
	@RequestMapping("/shopupdate.mc")
	public ModelAndView shopupdate(ModelAndView mv,
			Integer id) {
		
		MenuVO dbshop = null;
		
		try {
			dbshop = biz.get(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.addObject("dbshop", dbshop);
		mv.addObject("centerpage", "shop/modify");
		mv.setViewName("main");
		return mv;
	}
	
	
	@RequestMapping("/shopupdateimpl.mc")
	public String shopupdateimpl(MenuVO shop) {
		String newimgname = 
				shop.getMf().getOriginalFilename();
		
		if(! newimgname.equals("")) {
			shop.setImg1(newimgname);
			Util.saveFile(shop.getMf());
		}
		try {
			biz.modify(shop);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:shopdetail.mc?id="+shop.getMenu_code();
	}
	@RequestMapping("/adminmenudelete.mc")
	public String adminmenudelete(Integer menu_code) {
		try {
			biz.remove(menu_code);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:adminmenu.mc";
	}
	
	

	@RequestMapping("/adminmenudetail.mc")
	public ModelAndView adminmenudetail(ModelAndView mv,
			Integer menu_code) {
		MenuVO mdetail = null;
		try {
			mdetail = biz.get(menu_code);
			System.out.println(menu_code);
			System.out.println(mdetail);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.addObject("adminmenudetail", mdetail);
		mv.addObject("centerpage", "adminmenudetail");
		mv.setViewName("admin/admin");
		return mv;
	}
	
	@RequestMapping("/adminmenuupdate.mc")
	public String adminmenuupdateimpl(MenuVO menu) {
		System.out.println(menu);
		 String newimgname = menu.getMf().getOriginalFilename();
			if(! newimgname.equals("")) {
				menu.setImg1(newimgname);
				Util.saveFile(menu.getMf());

		try {
			biz.modify(menu);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
			return "redirect:adminmenudetail.mc?id="+menu.getMenu_code();
	}
	
	@RequestMapping("/adminmenuselect.mc")
	@ResponseBody
	public void adminmenuselect(HttpServletResponse res) throws Exception {
		ArrayList<MenuVO> list = null;
		list = biz.get();
		JSONArray ja = new JSONArray();
		for(MenuVO m : list) {
			JSONObject obj = new JSONObject();
			obj.put("menu_code", m.getMenu_code());
			obj.put("name", m.getName());
			obj.put("price", m.getPrice());
			obj.put("stock", m.getStock());
			obj.put("img1", m.getImg1());
			obj.put("img2", m.getImg2());
			obj.put("img3", m.getImg3());
			obj.put("category", m.getCategory());
			ja.add(obj);
		}
	       res.setCharacterEncoding("utf-8");
	       res.setContentType("application/json");
	       PrintWriter out = res.getWriter();
	       out.print(ja.toJSONString());
	       out.close();
	}
}





