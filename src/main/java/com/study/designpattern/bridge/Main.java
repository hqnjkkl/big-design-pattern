package com.study.designpattern.bridge;

/**
 * @author huqiaonan
 * @date 2016年1月26日 上午11:41:45
 */
public class Main {

	public static void main(String[] args) {
//		test1();
		test2();
	}

	public static void test2()
	{
		Brand b1 = new BrandIPone(new GameBall());
		Brand b2 = new BrandMi(new GameBall());
		People young = new Children(b1);
		People old = new Older(b2);
		young.run();
		old.run();
		
	}
	public static void test1() {
		GameBall gb = new GameBall();
		GameWeather gw = new GameWeather();
		BrandIPone bip = new BrandIPone();
		bip.setGame(gb);
		BrandMi bm = new BrandMi();
		bm.setGame(gw);
		bip.run();
		bm.run();
	}

}
