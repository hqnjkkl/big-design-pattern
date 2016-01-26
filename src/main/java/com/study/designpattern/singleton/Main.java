package com.study.designpattern.singleton;

import static org.testng.Assert.assertEquals;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author huqiaonan
 * @date 2016年1月25日 下午4:10:47
 */
public class Main {

	public static void main(String[] args) {
		Main m1 = new Main();
		// m1.test1();
		try {
			// m1.attack2();
			m1.attackByReflection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void test() {
		BlockingQueue<String> bq = new ArrayBlockingQueue<String>(100);
		
//		ArrayBlockingQueue<String> bq = ArrayBlockingQueue<String>(100);
	}

	public void test1() {
		Singleton1 sin1 = Singleton1.getInstance();
		Singleton1 sin12 = Singleton1.getInstance();
		assertEquals(sin1, sin12);
	}

	public void test2() {
		Singleton4 sin1 = Singleton4.getInstance();
		Singleton4 sin12 = Singleton4.getInstance();
		assertEquals(sin1, sin12);
	}

	public void attack1() throws CloneNotSupportedException {
		Singleton4 att1 = Singleton4.getInstance();
		Singleton4 att2 = (Singleton4) att1.clone();
		assertEquals(att1, att2);
	}

	public void attack2() throws CloneNotSupportedException {
		Singleton5 att1 = Singleton5.getInstance();
		Singleton5 att2 = (Singleton5) att1.clone();
		assertEquals(att1, att2);
	}

	public void attackByReflection() {
		Singleton5 sin = Singleton5.getInstance();
		try {
			Constructor<Singleton5> cons5 = Singleton5.class.getDeclaredConstructor();
			cons5.isAccessible();
			System.out.println(cons5.isAccessible());
			cons5.setAccessible(true);
			Singleton5 sin5 = cons5.newInstance();
			assertEquals(cons5, sin5);
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}

	}
}
