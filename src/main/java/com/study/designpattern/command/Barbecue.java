package com.study.designpattern.command;

/**
 * @author huqiaonan
 * @date 2016年1月26日 下午2:52:48
 */
public class Barbecue {
	String name;

	public Barbecue() {

	}

	public Barbecue(String name)
	{
		this.name = name;
	}
	public void bakeBeef() {
		System.out.println("考牛肉");
	}

	public void bakeChicken() {
		System.out.println("考鸡肉");
	}
}
