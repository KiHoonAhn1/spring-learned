package com.dao;

import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.vo.CartVO;

@Repository("cartdao")
public interface CartDao extends Dao<Integer, CartVO> {

}
