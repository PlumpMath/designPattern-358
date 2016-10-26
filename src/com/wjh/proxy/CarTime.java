package com.wjh.proxy;

import java.util.Random;

public class CarTime implements Moveable{

	@Override
	public void move() {
//		long starttime=System.currentTimeMillis();
//		System.out.println("汽车开始行驶...");
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("汽车正在行驶...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		long endtime=System.currentTimeMillis();
//		System.out.println("汽车结束行驶..."+"行驶时间为"+(endtime-starttime)+"毫秒");
	}

}
