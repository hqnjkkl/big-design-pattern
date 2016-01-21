package com.study.designpattern.observer;

/**
 * @author huqiaonan
 * @date 2016年1月21日 上午9:55:38
 * 观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主体对象。这个主题对象在状态发生变化时，会
 * 通知所有观察者对象，使它们能够自动更新自己。
 * 观察者会关注一个主题，一个主题会和多个观察者有关系，主题发生变化，会通知多个观察者。
 */
public class Main {

	public static void main(String[] args) {
		Secretary secretary = new Secretary();
		StockObserver so1 = new StockObserver("张三", secretary);
		StockObserver so2 = new StockObserver("李四", secretary);
		secretary.add(so1);
		secretary.add(so2);
		secretary.setState("老板回来了");
		secretary.notice();
		
		secretary.del(so1);
		secretary.setState("老板走了");
		secretary.notice();
	}
}
