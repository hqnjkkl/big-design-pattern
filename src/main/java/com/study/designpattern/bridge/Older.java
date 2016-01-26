package com.study.designpattern.bridge;

/**
 * @author huqiaonan
 * @date 2016年1月26日 下午2:18:58
 */
public class Older extends People {

	@Override
	void run() {
		System.out.print("老人过来");
		phone.run();
	}

	public Older() {
		super();
	}

	public Older(Brand brand) {
		super(brand);
	}

}
