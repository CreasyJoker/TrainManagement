package com.project.dao;

import org.apache.ibatis.annotations.Select;

import com.project.bean.UserBean;

public interface IUserDao {
	
	public void login();
	
	public void register();
	
	public void findAll();
	
	@Select("select * from t_user where id=#{id}")
	public UserBean findById(int id);
}
