package com.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frame.Biz;
import com.vo.CustomerVO;

@Controller
public class PayController {

	@Resource(name="cbiz")
	Biz<String, CustomerVO> biz;
	
		@RequestMapping("/return.mc")
		public ModelAndView useradd(ModelAndView mv) {
			mv.setViewName("main");
			return mv;
		}
		
//		@RequestMapping("/addimpl.mc")
//		public ModelAndView useraddimpl(ModelAndView mv,
//				CustomerVO user) {
//			try {
//				biz.register(user);
//				mv.setViewName("main");
//			} catch (Exception e) {
//				mv.setViewName("register");
//				e.printStackTrace();
//			}
//			return mv;
//		}
//		
//		@RequestMapping("/select.mc")
//		public ModelAndView userselectimpl(ModelAndView mv) {
//			ArrayList<CustomerVO> list = null;
//			try {
//				list = biz.get();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			mv.addObject("userlist", list);
//			mv.addObject("centerpage", "user/get");
//			mv.setViewName("main");
//			return mv;
//		}	

	}

