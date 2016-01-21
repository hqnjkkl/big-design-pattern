package com.study.designpattern.observer;

/**
 * @author huqiaonan
 * @date 2016年1月21日 上午9:44:50
 */
public class Secretary extends Subject {

	public Secretary() {

	}

	@Override
	public void notice() {
		for (Observer obs : obsers) {
			obs.update();
		}
	}

	@Override
	public void add(Observer obs) {
		obsers.add(obs);
	}

	@Override
	public void del(Observer obs) {
		obsers.remove(obs);
	}

}
