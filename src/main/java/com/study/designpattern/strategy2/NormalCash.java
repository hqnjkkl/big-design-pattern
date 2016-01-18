package com.study.designpattern.strategy2;
/**
* @author huqiaonan
* @date 2016年1月18日 下午5:48:01 
*/
public class NormalCash implements CashSuper {
	public NormalCash() {
		
	}
	
	@Override
	public double getResult(double cash) {
		return cash;
	}

}
