package com.study.designpattern.dutyChain;

/**
 * @author huqiaonan
 * @date 2016年1月26日 下午4:01:20
 */
public class Director extends Handler {
	

	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Director(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handler(String message, int num) {
		if (num < 10) {
			System.out.println(name+":"+message + "处理成功:" + num);
		} else {
			if (successor != null) {
				successor.handler(message, num);
			}
		}
	}

}
