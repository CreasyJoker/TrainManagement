package com.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.UserBean;
import com.project.dao.IUserDao;
import com.project.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	//通过类型来注入----当前接口所对应实现类
	@Autowired
	private IUserDao dao;
	
	@Override
	public UserBean findUserById(int id) {
		//处理业务
		return dao.findById(id);
	}

}
