package com.project.dao.impl;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.bean.UserBean;
import com.project.dao.IUserDao;

@Repository
public class UserDaoImpl implements IUserDao{

	@Autowired
	private SqlSessionFactory fa;
	
	@Override
	public void login() {
		
		System.out.println("正在进行登录");
		
	}
	@Override
	public void register() {
		
		System.out.println("正在进行注册");
		
	}
	@Override
	public void findAll() {
		System.out.println("正在获取所有的用户信息");
		
	}
	@Override
	public UserBean findById(int id) {
		SqlSession session = fa.openSession();
		UserBean bean=null;
		try {
			IUserDao dao = session.getMapper(IUserDao.class);
			bean = dao.findById(id);

			
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			session.close();
		}
		return bean;
	}
}
