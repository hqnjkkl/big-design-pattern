package com.study.designpattern.strategy2;

/**
 * @author huqiaonan
 * @date 2016年1月18日 下午5:50:28
 */
public class CashReturn implements CashSuper {

	private double full;
	private double back;

	public CashReturn() {

	}

	public CashReturn(double full, double back) {
		this.full = full;
		this.back = back;
	}

	@Override
	public double getResult(double cash) {
		int backTime = (int) ((int) cash/full);
		return backTime * (full-back)+(cash - full*backTime);
	}

}
