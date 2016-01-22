package com.study.designpattern.memento;

/**
 * @author huqiaonan
 * @date 2016年1月22日 上午9:28:36
 */
public class Originator {
	private String state;

	public Memento craeteMemento() {
		return new Memento(state);
	}
	
	public void setMemento(Memento men)
	{
		this.state = men.getState();
	}

	public void show() {
		System.out.println("state:" + state);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
