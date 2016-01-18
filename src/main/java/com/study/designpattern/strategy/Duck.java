package com.study.designpattern.strategy;

/**
 * @author huqiaonan
 * @date 2016年1月18日 下午4:35:00
 */
public abstract class Duck {

	protected Fly fly;
	protected Quack quack;

	public Duck() {
	
	}
	
//	public Duck(Fly fly,Quack quack)
//	{
//		this.fly = fly;
//		this.quack = quack;
//	}
	
	public void displayFly(){
		fly.fly();
	}
	
	public void displayQuack(){
		quack.quack();
	}

	public abstract void display();

	public void setFly(Fly fly) {
		this.fly = fly;
	}

	public void setQuack(Quack quack) {
		this.quack = quack;
	}
	
}
