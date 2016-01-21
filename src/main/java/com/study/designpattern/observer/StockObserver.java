package com.study.designpattern.observer;

/**
 * @author huqiaonan
 * @date 2016年1月21日 上午9:47:16
 */
public class StockObserver extends Observer {

	public StockObserver() {
		
	}
	
	public StockObserver(String name) {
		this.name = name;
	}
	
	public StockObserver(String name,Subject sub) {
		this.name = name;
		this.sub = sub;
	}

	@Override
	public void update() {
		System.out.println(sub.getState() + ":" + name + ":" + "关闭电脑，准备工作");
	}

}
