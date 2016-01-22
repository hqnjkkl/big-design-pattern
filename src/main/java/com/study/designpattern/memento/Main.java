package com.study.designpattern.memento;

/**
 * @author huqiaonan
 * @date 2016年1月22日 上午9:32:26
 * 备忘录模式
 */
public class Main {

	public static void main(String[] args) {
		Originator o = new Originator();
		o.setState("On");
		o.show();
		Caretaker c = new Caretaker();
		c.setMemento(o.craeteMemento());
		o.setState("Off");
		o.show();
		o.setMemento(c.getMemento());
		o.show();
	}
}