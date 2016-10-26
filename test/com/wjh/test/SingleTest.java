package com.wjh.test;

import org.junit.Test;

import com.wjh.singleton.HungrySingleton;
import com.wjh.singleton.LazySingleton;

public class SingleTest {

	@Test
	public void singleTest(){
		HungrySingleton singleton1=HungrySingleton.getSingleton();
		HungrySingleton singleton2=HungrySingleton.getSingleton();
		System.out.println(singleton1==singleton2);
		
		LazySingleton singleton3=LazySingleton.getSingleton();
		LazySingleton singleton4=LazySingleton.getSingleton();
		System.out.println(singleton3==singleton4);
	}
}
