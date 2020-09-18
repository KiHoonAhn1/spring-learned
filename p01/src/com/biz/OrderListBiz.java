package com.biz;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.frame.Biz;
import com.frame.Dao;
import com.vo.CustomerVO;
import com.vo.OrderListVO;
import com.vo.OrdersVO;


@Service("olbiz")
public class OrderListBiz implements Biz<Integer, OrderListVO> {

	@Resource(name="oldao")
	Dao<Integer, OrderListVO> dao;

	@Override
	public void register(OrderListVO v) throws Exception {
		dao.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		int result = 0;
		result =dao.delete(k);
		if(result==0) {
			throw new Exception();
		}
	}

	@Override
	public void modify(OrderListVO v) throws Exception {
		int result=0;
		result = dao.update(v);
		if(result==0) {
			throw new Exception();
		}	
	}

	@Override
	public OrderListVO get(Integer k) throws Exception {

		return dao.select(k);
	}

	@Override
	public ArrayList<OrderListVO> get() throws Exception {
		return dao.selectall();
	}

	@Override
	public ArrayList<OrderListVO> search(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	



}
