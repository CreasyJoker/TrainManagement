package com.project.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyRoundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation method) throws Throwable {
		
		System.out.println("��ʼ��¼ʱ��");
		//ִ��Ŀ�����ķ���
		Object obj = method.proceed();
		System.out.println("������¼ʱ��");
		
		return obj;
	}

}
