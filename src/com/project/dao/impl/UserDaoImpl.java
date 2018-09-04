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
		
		System.out.println("���ڽ��е�¼");
		
	}
	@Override
	public void register() {
		
		System.out.println("���ڽ���ע��");
		
	}
	@Override
	public void findAll() {
		System.out.println("���ڻ�ȡ���е��û���Ϣ");
		
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
