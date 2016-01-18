package com.study.designpattern.strategy;
/**
* @author huqiaonan
* @date 2016年1月18日 下午4:41:29 
*/
public class Mallard extends Duck {

	public Mallard()
	{
		this.fly = new NormalFly();
		this.quack = new NormalQuack();
	}
	@Override
	public void display() {
		System.out.println("I am a Mallard Duck");
	}
	
}
