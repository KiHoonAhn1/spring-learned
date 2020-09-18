package com.component;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.frame.Biz;
import com.frame.Dao;
@Component("ubiz")
public class UserBiz implements Biz {
	/* @Resource(name="oracledao") */
	@Autowired
	@Qualifier("oracledao")
	Dao dao;
	
	
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	@Override
	public void register() {
		dao.insert();
	}

	@Override
	public void remove() {
		dao.delete();
	}

	@Override
	public void modify() {
		dao.update();
	}

}
