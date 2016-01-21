package com.study.designpattern.state;

/**
 * @author huqiaonan
 * @date 2016年1月21日 下午3:36:10
 * 状态模式，当一个对象的内在状态改变时允许改变其行为，这个对象看起来项是改变了其类。
 * 状态模式主要解决的是当控制一个对象状态转换的条件表达式过于复杂时的情况。把状态的判断逻辑转移到表示不同状态的一系列类当中，可以吧复杂的判断逻辑简化
 */
public class Main {

	public static void main(String[] args) {
		Work work = new Work();
//		work.setHour(9);
//		work.workForCompany();
//		work.setHour(10);
//		work.workForCompany();
//		work.setHour(12);
//		work.workForCompany();
//		work.setHour(14);
//		work.workForCompany();
		work.setHour(17);
		work.workForCompany();
		work.finished = true;
		work.workForCompany();
	}

}
