package com.study.designpattern.deractor;
/**
* @author huqiaonan
* @date 2016年1月19日 下午3:11:24 
*/
public class STShirt extends Clothing {

	@Override
	public void decorate() {
		super.decorate();
		System.out.println("超级Tshirt");
	}
}
