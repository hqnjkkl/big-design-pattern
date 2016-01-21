package com.study.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huqiaonan
 * @date 2016年1月21日 上午9:39:02
 */
public abstract class Subject {
	List<Observer> obsers = new ArrayList<Observer>();

	private String state;
	
	abstract void add(Observer obs);

	abstract void del(Observer obs);

	abstract void notice();

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
