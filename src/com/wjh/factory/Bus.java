package com.wjh.factory;

public class Bus implements Car {

	@Override
	public void makeup() {
		System.out.println("生产公共汽车...");
	}

}
