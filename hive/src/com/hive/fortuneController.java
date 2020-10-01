package com.hive;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.biz.FortuneToday;
import com.frame.Fortune;

@Controller
public class fortuneController {
	
	@Autowired
	Fortune<FortuneToday> fort;
	
	@RequestMapping("/fortunetoday.mc")
	public void fortunetoday(FortuneToday ftstatus) {
		System.out.println(ftstatus);
		fort.fstatus(ftstatus);
	}
}
