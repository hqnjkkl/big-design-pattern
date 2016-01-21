package com.study.designpattern.adapter;

/**
 * @author huqiaonan
 * @date 2016年1月21日 下午5:00:07
 *       适配器模式，将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 *       姚明有特殊的行为，说中文。所以需要一个适配器(翻译)转成英文，这样姚明就相当于一个正常的说英文的球员了。
 */
public class Main {

	public static void main(String[] args) {

		ForeignCentre fc = new ForeignCentre("yao ming");
		Player yaoming = new Translator(fc);

		CentreForward cf = new CentreForward();
		Forward forward = new Forward();

		yaoming.attack();
		yaoming.defense();
		cf.attack();
		cf.defense();
		forward.attack();
		forward.defense();

	}

}
