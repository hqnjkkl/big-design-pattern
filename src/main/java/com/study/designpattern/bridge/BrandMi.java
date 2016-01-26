package com.study.designpattern.bridge;

/**
 * @author huqiaonan
 * @date 2016年1月26日 上午11:39:53
 */
public class BrandMi extends Brand {

	@Override
	public void run() {
		System.out.print("小米屌丝机");
		game.run();
	}

}
