package com.wjh.proxy;

public class CarTimeRecorder implements Moveable{

	public CarTimeRecorder(CarTime carTime) {
		super();
		this.carTime = carTime;
	}

	private CarTime  carTime;
	
	@Override
	public void move() {
		long starttime=System.currentTimeMillis();
		System.out.println("汽车开始行驶...");
		carTime.move();
		long endtime=System.currentTimeMillis();
		System.out.println("汽车结束行驶..."+"行驶时间为"+(endtime-starttime)+"毫秒");
	}

}
