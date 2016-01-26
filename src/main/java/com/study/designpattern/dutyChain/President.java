package com.study.designpattern.dutyChain;

/**
 * @author huqiaonan
 * @date 2016年1月26日 下午4:04:35
 */
public class President extends Handler {

	public President() {
		super();
	}

	public President(String name) {
		super(name);
	}

	@Override
	public void handler(String message, int num) {
		if (num < 30 && num >= 20) {
			System.out.println(name + ":" + message + "处理成功:" + num);
		} else {
			if (successor != null) {
				successor.handler(message, num);
			}
		}
	}

}
