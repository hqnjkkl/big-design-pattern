package com.study.designpattern.strategy;
/**
* @author huqiaonan
* @date 2016年1月18日 下午4:56:26 
*/
public class RubberDuck extends Duck{

	public RubberDuck()
	{
		this.quack = new SqueakQuack();
		this.fly = new NoFly();
	}
	@Override
	public void display() {
		System.out.println("I am a rubber duck!");
	}

}
