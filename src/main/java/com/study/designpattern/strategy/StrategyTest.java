package com.study.designpattern.strategy;
/**
* @author huqiaonan
* @date 2016年1月18日 下午4:58:12 
*/
public class StrategyTest {

	public static void main(String[] args) {
		Mallard ma = new Mallard();
		ma.display();
		ma.displayFly();
		ma.displayQuack();
		
		RubberDuck rd = new RubberDuck();
		rd.display();
		rd.displayFly();
		rd.displayQuack();
		
		rd.setFly(new NormalFly());
		rd.display();
		rd.displayFly();
		rd.displayQuack();
	}
}
