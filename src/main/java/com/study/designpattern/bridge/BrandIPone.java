package com.study.designpattern.bridge;

/**
 * @author huqiaonan
 * @date 2016年1月26日 上午11:39:29
 */
public class BrandIPone extends Brand {

	@Override
	public void run() {
		System.out.print("iphone 高清屏");
		game.run();
	}

	public BrandIPone() {
		super();
	}

	public BrandIPone(String name) {
		super(name);
	}

	public BrandIPone(Game game) {
		super(game);
	}

}
