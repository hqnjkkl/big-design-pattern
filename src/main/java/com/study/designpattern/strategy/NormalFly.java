package com.study.designpattern.strategy;
/**
* @author huqiaonan
* @date 2016年1月18日 下午4:52:47 
*/
public class NormalFly implements Fly {

	@Override
	public void fly() {
		System.out.println("duck fly");
	}

}
