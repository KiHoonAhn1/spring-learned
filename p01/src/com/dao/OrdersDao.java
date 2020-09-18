package com.dao;

import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.vo.OrdersVO;

@Repository("odao")
public interface OrdersDao extends Dao<Integer, OrdersVO> {

}
