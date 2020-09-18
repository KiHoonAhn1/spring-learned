package com.dao;

import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.vo.MenuVO;

@Repository("mdao")
public interface MenuDao extends Dao<Integer, MenuVO> {

}
