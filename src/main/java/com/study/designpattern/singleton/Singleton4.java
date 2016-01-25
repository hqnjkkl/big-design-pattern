package com.study.designpattern.singleton;

/**
 * @author huqiaonan
 * @date 2016年1月25日 下午4:06:12 只有用到这个类的时候，才会加载这个类的信息
 */
public class Singleton4 implements Cloneable {

	private static class Handler {
		private static final Singleton4 instance = new Singleton4();
	}

	private Singleton4() {
	}

	public static Singleton4 getInstance() {
		return Handler.instance;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
