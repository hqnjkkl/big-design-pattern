package com.study.designpattern.bridge;

/**
 * @author huqiaonan
 * @date 2016年1月26日 下午2:17:08
 */
public class Children extends People {

	@Override
	void run() {
		System.out.print("小孩子过来");
		phone.run();
	}

	public Children() {
		super();
	}

	public Children(Brand brand) {
		super(brand);
	}

}
