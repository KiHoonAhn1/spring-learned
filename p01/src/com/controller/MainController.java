package com.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frame.Biz;
import com.vo.CustomerVO;

@Controller
public class MainController {

	@Resource(name = "cbiz")
	Biz<String, CustomerVO> biz;
	
	@RequestMapping("/main.mc")
	public ModelAndView main(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		System.out.println(id);
		CustomerVO customer = null;
		try {
			customer = biz.get(id);
			mv.addObject("loginuser", customer);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;
	}
	@RequestMapping("/pay.mc")
	public ModelAndView useradd(ModelAndView mv) {
		mv.setViewName("pay");
		return mv;
	}
	@RequestMapping("/login.mc")
	public ModelAndView login(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		HttpSession session = request.getSession();
		if(session != null) {
			session.invalidate();
		}
		mv.setViewName("login");
		
		return mv;
	}
	
	@RequestMapping("/loginfail.mc")
	public ModelAndView loginfail() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("loginfail");
		return mv;
	}

	@RequestMapping("/register.mc")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("register");
		return mv;
	}
	
	@RequestMapping("/mypage.mc")
	public ModelAndView mypage(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("centerpage", "customer/mypage");
		mv.setViewName("mypageframe");
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		CustomerVO customer = null;
		try {
			customer = biz.get(id);
			mv.addObject("mycustomer", customer);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mv;
	}
	
		
	@RequestMapping("/contact.mc")
	public ModelAndView contact(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("contact");
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		CustomerVO customer = null;
		try {
			customer = biz.get(id);
			mv.addObject("mycustomer", customer);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;
	}
	
	@RequestMapping("/loginimpl.mc")
	public ModelAndView loginimpl(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		CustomerVO dbuser = null;
		try {
			dbuser = biz.get(id);
			if(dbuser.getPwd().equals(pwd)) {
				HttpSession session = request.getSession();
				session.setAttribute("loginuser", dbuser);
				session.setAttribute("id",id);
					mv.setViewName("main");
				}
		} catch (Exception e) {
			mv.setViewName("loginfail");
			e.printStackTrace();
		}
		return mv;
	}
	
	@RequestMapping("/logout.mc")
	public ModelAndView logout(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		HttpSession session = request.getSession();
		if(session != null) {
			session.invalidate();
		}
		mv.setViewName("login");
		return mv;
}


}