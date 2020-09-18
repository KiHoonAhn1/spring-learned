package com.dao;

import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.vo.OrderListVO;

@Repository("oldao")
public interface OrderListDao extends Dao<Integer, OrderListVO> {

}
