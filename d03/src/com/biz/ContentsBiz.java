package com.biz;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ContentsDao;
import com.frame.Biz;
import com.frame.Dao;
import com.vo.ContentsVo;
@Service("cbiz")
public class ContentsBiz implements Biz<Integer, ContentsVo> {

//	@Resource(name="cdao")
//	Dao<Integer, ContentsVo> dao;
	
	@Autowired
	ContentsDao dao;
	
	@Override
	public void register(ContentsVo v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}
	
	
	@Override
	public void modify(ContentsVo v) throws Exception {
		dao.update(v);
	}

	@Override
	public ContentsVo get(Integer k) throws Exception {
		dao.setCnt(k);
		return dao.select(k);
	}

	@Override
	public ArrayList<ContentsVo> get() throws Exception {
		return dao.selectall();
	}

	@Override
	public ArrayList<ContentsVo> search(Object obj) throws Exception {
		return dao.search(obj);
	}

}
