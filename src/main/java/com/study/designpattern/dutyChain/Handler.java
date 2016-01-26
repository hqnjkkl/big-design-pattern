package com.study.designpattern.dutyChain;

/**
 * 用来进行处理的类
 * 
 * @author huqiaonan
 * @date 2016年1月26日 下午3:57:59
 */
public abstract class Handler {
	Handler successor;
	String name;

	public Handler() {

	}

	public Handler(String name) {
		this.name = name;
	}

	public abstract void handler(String message, int num);

	public Handler getSuccessor() {
		return successor;
	}

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

}
