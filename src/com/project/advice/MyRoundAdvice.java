package com.project.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyRoundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation method) throws Throwable {
		
		System.out.println("开始记录时间");
		//执行目标对象的方法
		Object obj = method.proceed();
		System.out.println("结束记录时间");
		
		return obj;
	}

}
