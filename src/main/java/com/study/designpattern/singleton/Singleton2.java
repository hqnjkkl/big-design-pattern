package com.study.designpattern.singleton;

/**
 * @author huqiaonan
 * @date 2016年1月25日 下午3:48:24
 */
public class Singleton2 {

	private static Singleton2 instance;

	private Singleton2() {

	}

	public static Singleton2 getInstance() {
		if (instance == null) {
			synchronized (Singleton2.class) {
				if (instance == null) {
					instance = new Singleton2();
				}
			}
		}
		return instance;

	}

}
