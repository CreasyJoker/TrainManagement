package com.project.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.bean.UserBean;
import com.project.service.IUserService;

@Controller
@RequestMapping("/test")
public class LoginAction {
	
	@Autowired
	private IUserService service;

	@RequestMapping("/login.action")
	public String login(){
		
		UserBean bean = service.findUserById(1);
		System.out.println(bean);
		return "/success.jsp";
	}
}
