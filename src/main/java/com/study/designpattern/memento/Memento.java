package com.study.designpattern.memento;

/**
 * @author huqiaonan
 * @date 2016年1月22日 上午9:30:06
 */
public class Memento {

	private String state;

	public Memento() {

	}

	public Memento(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
