package com.dao;

import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.vo.CustomerVO;

@Repository("cdao")
public interface CustomerDao extends Dao<String, CustomerVO> {

}
