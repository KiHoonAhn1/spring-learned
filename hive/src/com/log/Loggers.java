package com.log;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

import com.biz.CarStatus;
import com.biz.Click;
import com.biz.FortuneToday;

@Service
@Aspect
public class Loggers {
	private Logger work_log = 
			Logger.getLogger("work"); 
	private Logger car_log = 
			Logger.getLogger("car"); 
	private Logger data_log = 
			Logger.getLogger("data");
	private Logger fortune_log = 
			Logger.getLogger("fortune");
	// before

	@Before("execution(* com.biz.ShopBiz.*(..))")
	public void logging1(JoinPoint jp) {
		Object[] args = jp.getArgs();
		Click click = (Click)args[0];
		data_log.debug(jp.getSignature().getName()+","+click.getId()+","+click.getItem()+","
						+click.getPrice()+","+click.getAge()+","+click.getGender());
	}
	@Before("execution(* com.*.MainController.*(..))")
	public void logging2(JoinPoint jp) {
		
		work_log.debug(jp.getSignature().getName()+","+"ABC");
	}
	@Before("execution(* com.biz.CarBiz.*(..))")
	public void logging3(JoinPoint jp) {
		Object[] args = jp.getArgs();
		CarStatus cstatus = (CarStatus)args[0];
		car_log.debug(jp.getSignature().getName()+","+cstatus.getId()+","+cstatus.getSpeed()+","
						+cstatus.getTemp()+","+cstatus.getOiltemp()+","+cstatus.getRpm());
	}
	@Before("execution(* com.biz.FortuneBiz.*(..))")
	public void logging4(JoinPoint jp) {
		Object[] args = jp.getArgs();
		FortuneToday fort = (FortuneToday)args[0];
		fortune_log.debug(jp.getSignature().getName()+","+fort.getAge()+","+fort.getGender()+","
						+fort.getLuck());
	}
}
