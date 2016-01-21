package com.study.designpattern.adapter;
/**
* @author huqiaonan
* @date 2016年1月21日 下午4:49:42 
*/
public class Forward extends Player {

	@Override
	void attack() {
		System.out.println("前锋进攻");
	}

	@Override
	void defense() {
		System.out.println("前锋防御");
	}

}
