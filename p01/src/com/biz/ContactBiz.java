package com.biz;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.frame.Biz;
import com.frame.Dao;
import com.vo.ContactVO;


@Service("contactbiz")
public class ContactBiz implements Biz<Integer, ContactVO> {

	@Resource(name="contactdao")
	Dao<Integer, ContactVO> dao;

	@Override
	public void register(ContactVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		int result=0;
		result = dao.delete(k);
		if(result==0) {
			throw new Exception();
		}
	}

	@Override
	public void modify(ContactVO v) throws Exception {
		int result=0;
		result = dao.update(v);
		if(result==0) {
			throw new Exception();
		}	
	}

	@Override
	public ContactVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public ArrayList<ContactVO> get() throws Exception {
		return dao.selectall();
	}

	@Override
	public ArrayList<ContactVO> search(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	


	
	



}
