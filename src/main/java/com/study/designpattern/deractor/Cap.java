package com.study.designpattern.deractor;
/**
* @author huqiaonan
* @date 2016年1月19日 下午3:10:44 
*/
public class Cap extends Clothing {

	@Override
	public void decorate() {
		super.decorate();
		System.out.println("normal cap");
	}
}
