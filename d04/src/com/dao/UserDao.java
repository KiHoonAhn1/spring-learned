package com.dao;

import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.vo.UserVo;

@Repository("udao")
public interface UserDao extends Dao<String, UserVo> {
}
