package com.biz;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.frame.Biz;
import com.frame.Dao;
import com.vo.MenuVO;

@Service("mbiz")
public class MenuBiz implements Biz<Integer, MenuVO> {

	@Resource(name="mdao")
	Dao<Integer, MenuVO> dao;

	@Override
	public void register(MenuVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		int result = 0;
		result = dao.delete(k);
		if(result==0) {
			throw new Exception();
		}
	}

	@Override
	public void modify(MenuVO v) throws Exception {
		int result=0;
		result = dao.update(v);
		if(result==0) {
			throw new Exception();
		}	
	}

	@Override
	public MenuVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public ArrayList<MenuVO> get() throws Exception {
		return dao.selectall();
	}

	@Override
	public ArrayList<MenuVO> search(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	
	



}
