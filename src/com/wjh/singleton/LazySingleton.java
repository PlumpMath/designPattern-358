package com.wjh.singleton;
/**
 * 懒汉模式：比较懒，在类加载时，不创建实例，因此类加载速度快，但运行时获取对象的速度慢,线程不安全
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
