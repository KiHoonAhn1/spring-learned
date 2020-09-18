package com.component;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.frame.Search;
import com.frame.Service;
import com.mapper.UserMapper;
import com.vo.User;

@org.springframework.stereotype.Service("uservice")
public class UserService implements Service<String, User>
//,Search<String, Integer, User> 
{
	
//	@Resource(name="userdao")
//	Dao dao;
	@Autowired
	UserMapper dao;
//	@Resource(name="userdao")
//	Search search;
	
//	public void setDao(Dao dao) {
//		this.dao = dao;
//	}
	
	@Override
	public void register(User v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void remove(String k) throws Exception {
		dao.delete(k);
	}

	@Override
	public void modify(User v) throws Exception {
		dao.update(v);
	}

	@Override
	public User get(String k)  throws Exception{
		return (User) dao.select(k);
	}
	@Override
	public ArrayList<User> get() throws Exception {
		return dao.selectall();
	}

//	@Override
//	public ArrayList<User> search(String k) throws Exception {
//		return search.search(k);
//	}
//
//	@Override
//	public ArrayList<User> search(String k1, Integer k2) throws Exception {
//		return search.search(k1, k2);
//	}


}
