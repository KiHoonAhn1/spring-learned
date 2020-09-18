package com.dao;

import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.vo.ContactVO;

@Repository("contactdao")
public interface ContactDao extends Dao<Integer, ContactVO> {

}
