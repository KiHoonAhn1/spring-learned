package com.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frame.Biz;
import com.vo.ContactVO;
import com.vo.CustomerVO;

@Controller
public class ContactController {

	@Resource(name="contactbiz")
	Biz<Integer, ContactVO> biz;
	
		@RequestMapping("/contactadd.mc")
		public ModelAndView contactadd(ModelAndView mv) {
			mv.setViewName("main");
			return mv;
		}
		
		@RequestMapping("/contactaddimpl.mc")
		public ModelAndView contactaddimpl(ModelAndView mv,
				 ContactVO con) {
			try {
				biz.register(con);
			} catch (Exception e) {
				mv.setViewName("contact");
				e.printStackTrace();
			}
			mv.setViewName("contactlist");
			return mv;
		}
		
		@RequestMapping("/contactselect.mc")
		public ModelAndView contactselectimpl(ModelAndView mv) {
			ArrayList<ContactVO> list = null;
			try {
				list = biz.get();
			} catch (Exception e) {
				e.printStackTrace();
			}
			mv.addObject("admincontactlist", list);
			mv.addObject("centerpage", "contactlist");
			mv.setViewName("mypageframe");
			return mv;
		}
		
		@RequestMapping("/admincontactselect.mc")
		public ModelAndView admincontactselectimpl(ModelAndView mv) {
			ArrayList<ContactVO> list = null;
			try {
				list = biz.get();
			} catch (Exception e) {
				e.printStackTrace();
			}
			mv.addObject("admincontactlist", list);
			mv.addObject("centerpage", "admincontactlist");
			mv.setViewName("admin/admin");
			return mv;
		}
		
		@RequestMapping("/admincontact.mc")
		public ModelAndView admincontactdetail(ModelAndView mv,
				Integer contact_code) {
			ContactVO contact = null;
			try {
				contact = biz.get(contact_code);
			} catch (Exception e) {
				e.printStackTrace();
			}
			mv.addObject("admincontactdetail", contact);
			mv.addObject("centerpage", "admincontact");
			mv.setViewName("admin/admin");
			return mv;
		}
		
		@RequestMapping("/contactdetail.mc")
		public ModelAndView userdetail(ModelAndView mv,
				Integer contact_code) {
			ContactVO user = null;
			try {
				user = biz.get(contact_code);
			} catch (Exception e) {
				e.printStackTrace();
			}
			mv.addObject("admincontactdetail", user);
			mv.addObject("centerpage", "contactdetail");
			mv.setViewName("mypageframe");
			return mv;
		}
		
		@RequestMapping("/contactdelete.mc")
		public String userdelete(Integer contact_code) {
			try {
				biz.remove(contact_code);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "redirect:admincontactselect.mc";
		}
			
		@RequestMapping("/admincontactupdate.mc")
		public String admincontactupdate(ContactVO contact) {
			System.out.println(contact.getId());
			try {
				biz.modify(contact);
			} catch (Exception e) {
				e.printStackTrace();
			}	
			return "redirect:admincontact.mc";
		}
	}

