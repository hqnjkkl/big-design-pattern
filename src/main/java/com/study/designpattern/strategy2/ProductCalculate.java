package com.study.designpattern.strategy2;

/**
 * @author huqiaonan
 * @date 2016年1月18日 下午6:43:54
 * 策略模式，定义了算法家族，分别封装起来，让他们之间可以相互替换，此模式算法的变化，不会影响到使用算法的客户。
 */
public class ProductCalculate {

	CashContext cc = null;

	public ProductCalculate() {
		cc = new CashContext();
	}

	public void totalMoney(String type,double cash) {
		switch (type) {
		case "1":
			cc.setCs(new NormalCash());
			break;

		case "2":
			cc.setCs(new CashSale(0.7));
			break;

		case "3":
			cc.setCs(new CashReturn(300, 100));
			break;

		default:
			System.out.println("error type");
			return;
		}
		System.out.println(cc.getResult(cash));
	}
	public static void main(String[] args) {
		ProductCalculate pc = new ProductCalculate();
		pc.totalMoney("1", 200);
		pc.totalMoney("2", 1000);
		pc.totalMoney("3", 1100);
	}

}
