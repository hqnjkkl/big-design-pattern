package com.study.designpattern.strategy2;

/**
 * @author huqiaonan
 * @date 2016年1月18日 下午6:41:11
 */
public class CashContext {
	private CashSuper cs;

	public CashContext() {

	}

	public void setCs(CashSuper cs) {
		this.cs = cs;
	}

	public double getResult(double cash) {
		return cs.getResult(cash);
	}
}
