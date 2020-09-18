package com.biz;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.frame.Biz;
import com.frame.Dao;
import com.vo.CustomerVO;


@Service("cbiz")
public class CustomerBiz implements Biz<String, CustomerVO> {

	@Resource(name="cdao")
	Dao<String, CustomerVO> dao;

	@Override
	public void register(CustomerVO v) throws Exception {
		dao.insert(v);		
	}

	@Override
	public void remove(String k) throws Exception {
		int result = dao.delete(k);
		if(result==0) {
			throw new Exception();
		}
	}

	@Override
	public void modify(CustomerVO v) throws Exception {
		int result = dao.update(v);
		if(result == 0) {
			throw new Exception();
		}
	}

	@Override
	public CustomerVO get(String k) throws Exception {

		return dao.select(k);
	}

	@Override
	public ArrayList<CustomerVO> get() throws Exception {
		
		return dao.selectall();
	}

	@Override
	public ArrayList<CustomerVO> search(Object obj) throws Exception {

		return null;
	}
	



}
