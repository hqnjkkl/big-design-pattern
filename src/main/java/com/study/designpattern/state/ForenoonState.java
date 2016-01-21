package com.study.designpattern.state;

/**
 * @author huqiaonan
 * @date 2016年1月21日 下午3:13:52
 */
public class ForenoonState implements State {

	@Override
	public void writeProgram(Work work) {
		if (work.hour < 12) {
			System.out.println("上午:" + work.hour + "精力充沛");
		} else {
			work.setState(new NoonState());
			work.workForCompany();
		}
	}

}