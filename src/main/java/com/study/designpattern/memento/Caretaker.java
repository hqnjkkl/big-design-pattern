package com.study.designpattern.memento;

/**
 * @author huqiaonan
 * @date 2016年1月22日 上午9:30:54
 */
public class Caretaker {

	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

}
