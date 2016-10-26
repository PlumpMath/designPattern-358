package com.wjh.test;

import org.junit.Test;

import com.wjh.factory.Car;
import com.wjh.factory.CarFactory;

public class FactoryTest {

	@Test
	public void factoryTest(){
		Car car=CarFactory.getCar("bus");
		car.makeup();
	}
}
