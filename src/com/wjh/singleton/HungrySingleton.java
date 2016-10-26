package com.wjh.singleton;
/**
 * ����ģʽ���������ʱ������˳�ʼ������������ؽ���������ȡ������ٶȿ�
 * @author WJH
 *
 */
public class HungrySingleton {

	private HungrySingleton(){}
	private static HungrySingleton singleton=new HungrySingleton();
	/**
	 * ��̬��ͬ�����������ʵ�
	 * @return HungrySingletonʵ������
	 */
	public static HungrySingleton getSingleton(){
		return singleton;
	}
}
