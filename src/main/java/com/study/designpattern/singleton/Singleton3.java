package com.study.designpattern.singleton;

/**
 * @author huqiaonan
 * @date 2016年1月25日 下午3:50:54
 */
public class Singleton3 {
	private static final Singleton3 instance = new Singleton3();

	private Singleton3() {

	}

	public static Singleton3 getInstance() {
		return instance;
	}
}
