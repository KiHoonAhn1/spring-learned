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
public class CustomerController {

	@Resource(name="cbiz")
	Biz<String, CustomerVO> biz;
	
		@RequestMapping("/customeradd.mc")
		public ModelAndView useradd(ModelAndView mv) {
			mv.setViewName("main");
			return mv;
		}
		
		@RequestMapping("/customeraddimpl.mc")
		public ModelAndView useraddimpl(ModelAndView mv,
				CustomerVO user) {
			try {
				biz.register(user);
				mv.setViewName("main");
			} catch (Exception e) {
				mv.setViewName("register");
				e.printStackTrace();
			}
			return mv;
		}
		
		@RequestMapping("/userselect.mc")
		public ModelAndView userselectimpl(ModelAndView mv) {
			ArrayList<CustomerVO> list = null;
			try {
				list = biz.get();
			} catch (Exception e) {
				e.printStackTrace();
			}
			mv.addObject("userlist", list);
			mv.addObject("centerpage", "user/get");
			mv.setViewName("main");
			return mv;
		}
		
		@RequestMapping("/userdetail.mc")
		public ModelAndView userdetail(ModelAndView mv,
				String id) {
			CustomerVO user = null;
			try {
				user = biz.get(id);
			} catch (Exception e) {
				e.printStackTrace();
			}
			mv.addObject("userdetail", user);
			mv.addObject("centerpage", "user/detail");
			mv.setViewName("main");
			return mv;
		}
		
		@RequestMapping("/customerdelete.mc")
		public String userdelete(String id) {
			System.out.println(id);
			try {
				biz.remove(id);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "redirect:login.mc";
		}
		
		@RequestMapping("/customerupdate.mc")
			public ModelAndView userupdate(ModelAndView mv,
					String id) {
				CustomerVO customer = null;
				try {
					customer = biz.get(id);
				} catch (Exception e) {
					e.printStackTrace();
				}
				mv.addObject("mycustomer", customer);
				mv.addObject("centerpage", "customer/customerupdate");
				mv.setViewName("mypageframe");
				return mv;
			
		}
			
		@RequestMapping("/customerupdateimpl.mc")
		public String userupdateimpl(CustomerVO customer) {
			try {
				biz.modify(customer);
			} catch (Exception e) {
				e.printStackTrace();
			}	
			return "redirect:mypage.mc";
		}
	}

