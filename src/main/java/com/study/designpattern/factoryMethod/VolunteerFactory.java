package com.study.designpattern.factoryMethod;
/**
* @author huqiaonan
* @date 2016年1月19日 下午4:50:06 
*/
public class VolunteerFactory implements IFactory {

	@Override
	public LeiFeng getLeiFeng() {
		return new Volunteer();
	}


}
