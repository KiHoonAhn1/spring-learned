package com.biz;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.frame.Biz;
import com.frame.Dao;
import com.vo.CustomerVO;
import com.vo.OrdersVO;


@Service("obiz")
public class OrdersBiz implements Biz<Integer, OrdersVO> {

	@Resource(name="odao")
	Dao<Integer, OrdersVO> dao;

	@Override
	public void register(OrdersVO v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(OrdersVO v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OrdersVO get(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<OrdersVO> get() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<OrdersVO> search(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	



}
