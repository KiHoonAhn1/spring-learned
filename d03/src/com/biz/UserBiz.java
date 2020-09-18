package com.biz;

import java.util.ArrayList;

import javax.annotation.Resource;	

import org.springframework.stereotype.Service;

import com.frame.Biz;
import com.frame.Dao;
import com.vo.UserVo;
@Service("ubiz")	
public class UserBiz implements Biz<String, UserVo> {		
	@Resource(name="udao")
	Dao<String, UserVo> dao;
	
//	@Autowired
//	UserDao dao;
	
	@Override
	public void register(UserVo v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void remove(String k) throws Exception {
		int result = dao.delete(k);
		if(result == 0) {
			throw new Exception();
		}
	}
	
	
	@Override
	public void modify(UserVo v) throws Exception {
		dao.update(v);
	}

	@Override
	public UserVo get(String k) throws Exception {
		return dao.select(k);
	}

	@Override
	public ArrayList<UserVo> get() throws Exception {
		return dao.selectall();
	}

	@Override
	public ArrayList<UserVo> search(Object obj) throws Exception {
		return dao.search(obj);
	}

}
