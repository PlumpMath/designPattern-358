package com.wjh.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeProxy implements InvocationHandler {
	
	public TimeProxy(Object target) {
		super();
		this.target = target;
	}

	private Object target;

	/**
	 * proxy ������Ķ���
	 * method ���������ķ���
	 * args �����Ĳ���
	 * ����ֵ��Object �����ķ���ֵ
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		long starttime=System.currentTimeMillis();
		System.out.println("������ʼ��ʻ...");
		method.invoke(target);
		long endtime=System.currentTimeMillis();
		System.out.println("����������ʻ..."+"��ʻʱ��Ϊ"+(endtime-starttime)+"����");
		return null;
	}

}
