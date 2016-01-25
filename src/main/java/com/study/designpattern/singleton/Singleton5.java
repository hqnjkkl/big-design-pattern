package com.study.designpattern.singleton;

/**
 * @author huqiaonan
 * @date 2016年1月25日 下午4:06:12 只有用到这个类的时候，才会加载这个类的信息
 */
public class Singleton5 {

	private static class Handler {
		private static final Singleton5 instance = new Singleton5();
	}

	private Singleton5() {
	}

	public static Singleton5 getInstance() {
		return Handler.instance;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
