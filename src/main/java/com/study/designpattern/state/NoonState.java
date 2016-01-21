package com.study.designpattern.state;

/**
 * @author huqiaonan
 * @date 2016年1月21日 下午3:17:30
 */
public class NoonState implements State {

	@Override
	public void writeProgram(Work work) {
		if (work.hour < 13) {
			System.out.println("中午:" + work.hour + "吃完饭想睡觉");
		} else {
			work.setState(new AfternoonState());
			work.workForCompany();
		}
	}

}
