package com.study.designpattern.deractor;

/**
 * @author huqiaonan
 * @date 2016年1月19日 下午3:01:50
 */
public class Trousers extends Clothing {

	public Trousers() {

	}

	public Trousers(Person person) {
		this.person = person;
	}

	@Override
	public void decorate() {
		super.decorate();
		System.out.println("simple trousers");
	}
}
