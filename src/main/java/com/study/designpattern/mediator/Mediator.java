package com.study.designpattern.mediator;

/**
 * @author huqiaonan
 * @date 2016年1月26日 下午4:44:48
 */
public abstract class Mediator {

	Country country1;
	Country country2;

	public abstract void cordinate(Country country1, String message);

	public Country getCountry1() {
		return country1;
	}

	public void setCountry1(Country country1) {
		this.country1 = country1;
	}

	public Country getCountry2() {
		return country2;
	}

	public void setCountry2(Country country2) {
		this.country2 = country2;
	}

}
