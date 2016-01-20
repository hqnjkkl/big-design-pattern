package com.study.designpattern.facade;

/**
 * @author huqiaonan
 * @date 2016年1月20日 下午12:00:42 外观模式，为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，
 *       这个接口使得这一子系统更加容易使用。各种股票的交易等于子系统，基金相当于界面来管理这个系统。
 */
public class Fund {

	Stock1 st1;
	Stock2 st2;
	NationalDebt nd;

	public Fund() {
		st1 = new Stock1();
		st2 = new Stock2();
		nd = new NationalDebt();
	}

	public void buy() {
		st1.buy();
		st2.buy();
		nd.buy();
	}

	public void sell() {
		st1.sell();
		st2.sell();
		nd.sell();
	}

	public static void main(String[] args) {
		Fund fund = new Fund();
		fund.buy();
		fund.sell();
	}

}
