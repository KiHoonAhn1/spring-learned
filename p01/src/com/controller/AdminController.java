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
import org.springframework.web.servlet.ModelAndView;

import com.frame.Biz;
import com.vo.ContactVO;
import com.vo.CustomerVO;
import com.vo.MenuVO;
import com.vo.OrderListVO;

@Controller
public class AdminController {

	@Resource(name="mbiz")
	Biz<Integer, MenuVO> menubiz;
	
	@Resource(name="cbiz")
	Biz<String, CustomerVO> customerbiz;
	
	@Resource(name="olbiz")
	Biz<Integer, OrderListVO> orderlistbiz;
	
	@Resource(name="contactbiz")
	Biz<Integer, ContactVO> contactbiz;
	
	@RequestMapping("/admin.mc")
	public ModelAndView useradd(ModelAndView mv) {
		mv.addObject("centerpage", "adminmenu");
		mv.setViewName("admin/admin");
		return mv;
	}
	
	@RequestMapping("/adminmenu.mc")
	public ModelAndView userselectimpl(ModelAndView mv) {
		mv.addObject("centerpage", "adminmenu");
		mv.setViewName("admin/admin");
		return mv;
	}
	

//	, @RequestParam("mf") MultipartFile mf {
//	System.out.println(menu);
//	if( mf != null) {
//	String imgname = mf.getOriginalFilename();
//	System.out.println(imgname);
//		menu.setImg1(imgname);
//		Util.saveFile(mf);
//	}

	
	@RequestMapping("/admincustomer.mc")
	public ModelAndView admincustomer(ModelAndView mv) {
		ArrayList<CustomerVO> list = null;
		try {
			list = customerbiz.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.addObject("customerlist", list);
		mv.addObject("centerpage", "admincustomer");
		mv.setViewName("admin/admin");
		return mv;
	}
	
	@RequestMapping("/admincustomerdetail.mc")
	public ModelAndView admincustomerdetail(ModelAndView mv,
			String id) {
		CustomerVO cdetail = null;
		try {
			cdetail = customerbiz.get(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.addObject("admincustomerdetail", cdetail);
		mv.addObject("centerpage", "admincustomerdetail");
		mv.setViewName("admin/admin");
		return mv;
	}
	
	@RequestMapping("/admincustomerdelete.mc")
	public String admincustomerdelete(String id) {
		System.out.println(id);
		try {
			customerbiz.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:admincustomer.mc";
	}
	
	@RequestMapping("/adminchart.mc")
	public ModelAndView adminchart(ModelAndView mv) {
		mv.addObject("centerpage", "adminchart");
		mv.setViewName("admin/admin");
		return mv;
	}
	
	@RequestMapping("/adminchartimpl.mc")
	@ResponseBody
	public void adminchartimpl(HttpServletResponse res) throws Exception {
		ArrayList<MenuVO> list = null;
		list = menubiz.get();
		JSONArray ja = new JSONArray();
		for(MenuVO m : list) {
			JSONObject obj = new JSONObject();
			obj.put("name", m.getName());
			obj.put("price", m.getPrice());
			obj.put("stock", m.getStock());
			ja.add(obj);
		}
    res.setCharacterEncoding("utf-8");
    res.setContentType("application/json");
    PrintWriter out = res.getWriter();
    out.print(ja.toJSONString());
    out.close();
}
	
	@RequestMapping("/admincontactimpl.mc")
	@ResponseBody
	public void admincontactimpl(HttpServletResponse res) throws Exception {
		ArrayList<ContactVO> list = null;
		list = contactbiz.get();
		System.out.println(list);
		JSONArray ja = new JSONArray();
		for(ContactVO m : list) {
			JSONObject obj = new JSONObject();
			obj.put("contact_code", m.getContact_code());
			obj.put("id", m.getId());
			obj.put("subject", m.getSubject());
			obj.put("message", m.getMessage());
			obj.put("regdate", m.getRegdate());
			ja.add(obj);
		}
    res.setCharacterEncoding("utf-8");
    res.setContentType("application/json");
    PrintWriter out = res.getWriter();
    out.print(ja.toJSONString());
    out.close();
}
	
}
