package com.wjh.proxy;

import java.util.Random;

public class CarTime implements Moveable{

	@Override
	public void move() {
//		long starttime=System.currentTimeMillis();
//		System.out.println("������ʼ��ʻ...");
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("����������ʻ...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		long endtime=System.currentTimeMillis();
//		System.out.println("����������ʻ..."+"��ʻʱ��Ϊ"+(endtime-starttime)+"����");
	}

}
