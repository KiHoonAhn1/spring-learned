package com.biz;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.frame.Biz;
import com.frame.Dao;
import com.vo.CartVO;
import com.vo.CustomerVO;
import com.vo.MenuVO;
import com.vo.OrdersVO;


@Service("cartbiz")
public class CartBiz implements Biz<Integer, CartVO> {

	@Resource(name="cartdao")
	Dao<Integer, CartVO> dao;

	@Override
	public void register(CartVO v) throws Exception {
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
	public void modify(CartVO v) throws Exception {
		int result=0;
		result = dao.update(v);
		if(result==0) {
			throw new Exception();
		}	
	}

	@Override
	public CartVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public ArrayList<CartVO> get() throws Exception {
		return dao.selectall();
	}

	@Override
	public ArrayList<CartVO> search(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	


	
	



}
