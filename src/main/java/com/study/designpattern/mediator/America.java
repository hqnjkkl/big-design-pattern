package com.study.designpattern.mediator;
/**
* @author huqiaonan
* @date 2016年1月26日 下午4:46:17 
*/
public class America extends Country {

	@Override
	public void sendMessage(String message) {
		this.medistor.cordinate(this, message);
	}

	@Override
	public void notify(String message) {
		System.out.println("america get message:"+message);
	}

}
