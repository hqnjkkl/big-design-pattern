package com.study.designpattern.strategy2;
/**
* @author huqiaonan
* @date 2016年1月18日 下午6:35:29 
*/
public class CashSale implements CashSuper {

	private double discount ;
	public CashSale(double discount)
	{
		this.discount = discount;
	}
	
	@Override
	public double getResult(double cash) {
		return cash*discount;
	}

}
