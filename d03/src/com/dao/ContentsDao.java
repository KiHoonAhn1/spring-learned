package com.dao;

import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.vo.ContentsVo;
@Repository("cdao")
public interface ContentsDao extends Dao<Integer, ContentsVo> {
	
	public void setCnt(Integer k) throws Exception;
}
