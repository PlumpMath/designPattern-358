package com.wjh.factory;

/**
 * ����ģʽ
 * @author WJH
 * @version 1.0
 */
public class CarFactory {

	/**
	 * ��������
	 * @param str ֵΪ"bus"ʱ������Bus��ʵ������ֵΪ"automobile"ʱ������Automobile��ʵ������
	 * @return ��Ӧ��ʵ������
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
