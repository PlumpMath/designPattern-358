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
		System.out.println("������ʼ��ʻ...");
		carTime.move();
		long endtime=System.currentTimeMillis();
		System.out.println("����������ʻ..."+"��ʻʱ��Ϊ"+(endtime-starttime)+"����");
	}

}
