package com.study.designpattern.dutyChain;

/**
 * @author huqiaonan
 * @date 2016年1月26日 下午4:04:35
 */
public class GeneralManager extends Handler {

	public GeneralManager() {
		super();
	}

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handler(String message, int num) {
		System.out.println(name + ":" + message + "处理成功:" + num);
	}

}
