package com.study.designpattern.strategy;

/**
 * @author huqiaonan
 * @date 2016年1月18日 下午4:39:08
 */
public class NormalQuack implements Quack {

	@Override
	public void quack() {
		System.out.println("嘎嘎!");

	}

}
