package com.study.designpattern.adapter;

/**
 * @author huqiaonan
 * @date 2016年1月21日 下午4:43:59
 */
public class Adapter extends Target {

	Adaptee adap;

	public Adapter() {
		adap = new Adaptee();
	}

	@Override
	public void request() {
		adap.specialRequest();
	}

	public static void main(String[] args) {
		Target adapter = new Adapter();

		adapter.request();
	}
}
