package com.study.designpattern.factoryMethod;

/**
 * @author huqiaonan
 * @date 2016年1月19日 下午4:48:26
 */
public class Undergraduate implements LeiFeng {
	String name = "undergraduate";

	@Override
	public void buyRice() {
		System.out.println(name + " buyRice");
	}

	@Override
	public void washClothing() {
		System.out.println(name + " washClothing");
	}

	@Override
	public void clean() {
		System.out.println(name + " clean");
	}

}
