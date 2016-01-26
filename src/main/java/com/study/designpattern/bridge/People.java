package com.study.designpattern.bridge;

/**
 * @author huqiaonan
 * @date 2016年1月26日 下午2:14:46
 */
public abstract class People {

	Brand phone;

	public People() {
	}

	public People(Brand brand) {
		this.phone = brand;
	}

	public Brand getPhone() {
		return phone;
	}

	public void setPhone(Brand phone) {
		this.phone = phone;
	}
	
	abstract void run();
}
