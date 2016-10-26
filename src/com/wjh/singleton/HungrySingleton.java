package com.wjh.singleton;
/**
 * 饿汉模式：在类加载时就完成了初始化，所以类加载较慢，但获取对象的速度快
 * @author WJH
 * 测试Github的pull功能，设置保存的时候为GBK
 */
public class HungrySingleton {

	private HungrySingleton(){}
	private static HungrySingleton singleton=new HungrySingleton();
	/**
	 * 静态，同步，公开访问点
	 * @return HungrySingleton实例对象
	 */
	public static HungrySingleton getSingleton(){
		return singleton;
	}
}
