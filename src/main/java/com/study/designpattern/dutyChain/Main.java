package com.study.designpattern.dutyChain;

/**
 * @author huqiaonan
 * @date 2016年1月26日 下午4:08:40 职责链模式，使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系。将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 * 职责链模式使后来定的处理顺序，状态模式是预先定好顺序，状态模式是改变自己的状态，职责链是处理某个请求，装饰者模式，是以特定顺序表现出来.
 */
public class Main {

	public static void main(String[] args) {
		Handler director = new Director("主管");
		Handler manager = new Manager("经理");
		Handler geManager = new GeneralManager("总经理");
		Handler president = new President("总裁");
		director.setSuccessor(manager);
		manager.setSuccessor(geManager);
		geManager.setSuccessor(president);
		director.handler("换电脑", 6);
		director.handler("加薪水", 50);
	}

}
