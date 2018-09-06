package com.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.UserBean;
import com.project.dao.IUserDao;
import com.project.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	//ͨ��������ע��----��ǰ�ӿ�����Ӧʵ����
	@Autowired
	private IUserDao dao;
	
	@Override
	public UserBean findUserById(int id) {
		//����ҵ��
		return dao.findById(id);
	}

}
