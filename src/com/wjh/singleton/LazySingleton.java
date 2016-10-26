package com.wjh.singleton;
/**
 * ����ģʽ���Ƚ������������ʱ��������ʵ�������������ٶȿ죬������ʱ��ȡ������ٶ���,�̲߳���ȫ
 * @author WJH
 *
 */
public class LazySingleton {

	private LazySingleton(){}
	private static LazySingleton singleton;
	
	public static LazySingleton getSingleton() {
		if(singleton==null)
			singleton=new LazySingleton();
		return singleton;
	}
}
