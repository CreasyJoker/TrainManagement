package com.project.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * 前置通知
 * @author XUCHAOBO
 *
 */
public class MyBeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		
		System.out.println("开始记录日志");
		
	}

}
