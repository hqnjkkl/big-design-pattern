package com.study.designpattern.mediator;

/**
 * @author huqiaonan
 * @date 2016年1月26日 下午4:50:29
 */
public class UnitedCountry extends Mediator {

	@Override
	public void cordinate(Country country1, String message) {
		if (this.country1.equals(country1)) {
			this.country2.notify(message);
		} else {
			this.country1.notify(message);
		}
	}

}
