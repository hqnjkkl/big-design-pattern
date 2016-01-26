package com.study.designpattern.mediator;

/**
 * @author huqiaonan
 * @date 2016年1月26日 下午4:54:40
 *       用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显示地相互引用，从而使其耦合松散，而且可以独立地改变他们之间的交互
 */
public class Main {

	public static void main(String[] args) {
		Country america = new America();
		Country china = new China();
		UnitedCountry uc = new UnitedCountry();
		uc.setCountry1(america);
		uc.setCountry2(china);
		america.setMedistor(uc);
		china.setMedistor(uc);
		america.sendMessage("美国和中国合作");
		china.sendMessage("中国爱好和平");
	}

}
