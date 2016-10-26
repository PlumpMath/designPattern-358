package com.wjh.factory;

/**
 * 工厂模式
 * @author WJH
 * @version 1.0
 */
public class CarFactory {

	/**
	 * 工厂方法
	 * @param str 值为"bus"时返回类Bus的实例对象，值为"automobile"时返回类Automobile的实例对象
	 * @return 对应的实例对象
	 */
	public static Car getCar(String str){
		Car car=null;
		if("bus".equals(str))
			car=new Bus();
		if("automobile".equals(str))
			car=new Automobile();
		return car;
	}
}
