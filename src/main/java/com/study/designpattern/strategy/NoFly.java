package com.study.designpattern.strategy;
/**
* @author huqiaonan
* @date 2016年1月18日 下午4:53:21 
*/
public class NoFly implements Fly {

	@Override
	public void fly() {
		System.out.println("can not fly");
	}

}
