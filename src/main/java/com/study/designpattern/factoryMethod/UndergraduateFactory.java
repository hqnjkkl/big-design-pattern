package com.study.designpattern.factoryMethod;
/**
* @author huqiaonan
* @date 2016年1月19日 下午4:53:03 
*/
public class UndergraduateFactory implements IFactory {

	@Override
	public LeiFeng getLeiFeng() {
		return new Undergraduate();
	}

}
