package com.study.designpattern.adapter;

/**
 * @author huqiaonan
 * @date 2016年1月21日 下午4:55:09
 */
public class ForeignCentre {

	String name;

	public ForeignCentre() {

	}

	public ForeignCentre(String name) {
		this.name = name;
	}

	public void jingong() {
		System.out.println("外籍人" + name + "进攻");
	}

	public void fangyu() {
		System.out.println("外籍人" + name + "防守");
	}
}
