package com.study.designpattern.observer;

/**
 * @author huqiaonan
 * @date 2016年1月21日 上午9:39:49
 */
public abstract class Observer {

	Subject sub;
	String name;

	public Observer() {

	}

	public Observer(Subject sub, String name) {
		this.sub = sub;
		this.name = name;
	}

	public abstract void update();

}
