package com.wjh.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.junit.Test;

import com.wjh.proxy.CarTime;
import com.wjh.proxy.CarTimeRecorder;
import com.wjh.proxy.Moveable;
import com.wjh.proxy.TimeProxy;

/**
 * 
 * @author WJH
 *
 */
public class ProxyTest {
	
	@Test
	public void carTest(){
		Moveable m=new CarTime();
		m.move();
	}
	@Test
	public void carRecorderTest(){
		CarTime carTime=new CarTime();
		CarTimeRecorder recorder=new CarTimeRecorder(carTime);
		recorder.move();
	}

	@Test
	public void proxyTest() {
		CarTime car = new CarTime();
		InvocationHandler h = new TimeProxy(car);
		Class<?> class1 = car.getClass();
		/**
		 * loader 类加载器 interfaces 实现接口 h InvocationHandler
		 * 
		 */
		Moveable m = (Moveable) Proxy.newProxyInstance(class1.getClassLoader(),
				class1.getInterfaces(), h);
		m.move();
	}
}
