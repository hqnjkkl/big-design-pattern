package com.study.designpattern.facade;

/**
 * @author huqiaonan
 * @date 2016年1月20日 下午12:00:53
 */
public class Stock1 extends Economic {

	@Override
	public void buy() {
		System.out.println("buy Stock1");
	}

	@Override
	public void sell() {
		System.out.println("sell Stock1");
	}

}
