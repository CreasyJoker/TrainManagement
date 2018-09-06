package com.project.test;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.bean.UserBean;
import com.project.dao.IUserDao;
import com.project.dao.impl.UserDaoImpl;

public class TestMain {
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IUserDao dao = (IUserDao) context.getBean("userdao2");
		
		dao.login();
		dao.register();
		System.out.println("======");
		dao.findAll();
		//dao.findById();
		
		UserBean bean = (UserBean) context.getBean("userbean");
		System.out.println(bean);
	}
	
	@Test
	public void test2(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IUserDao dao = (IUserDao) context.getBean("userDaoImpl");
		
		UserBean bean = dao.findById(1);
		System.out.println(bean);
	}
}
