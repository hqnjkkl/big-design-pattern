package com.study.designpattern.facade;

/**
 * @author huqiaonan
 * @date 2016年1月20日 下午1:36:37
 */
public class NationalDebt extends Economic {

	@Override
	public void buy() {
		System.out.println("buy National Debt");
	}

	@Override
	public void sell() {
		System.out.println("sell National Debt");
	}

}