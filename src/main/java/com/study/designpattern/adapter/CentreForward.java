package com.study.designpattern.adapter;

/**
 * @author huqiaonan
 * @date 2016年1月21日 下午4:51:49
 */
public class CentreForward extends Player {

	@Override
	void attack() {
		System.out.println("中锋进攻");
	}

	@Override
	void defense() {
		System.out.println("中锋防御");
	}

}
