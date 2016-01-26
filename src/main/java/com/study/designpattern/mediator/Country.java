package com.study.designpattern.mediator;

/**
 * @author huqiaonan
 * @date 2016年1月26日 下午4:42:27
 */
public abstract class Country {

	Mediator medistor;

	public Country() {

	}

	public abstract void sendMessage(String messages);

	public abstract void notify(String message);

	public Mediator getMedistor() {
		return medistor;
	}

	public void setMedistor(Mediator medistor) {
		this.medistor = medistor;
	}
	
}
