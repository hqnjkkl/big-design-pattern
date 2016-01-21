package com.study.designpattern.state;

/**
 * @author huqiaonan
 * @date 2016年1月21日 下午3:18:03
 */
public class AfternoonState implements State {

	@Override
	public void writeProgram(Work work) {
		if (work.hour < 17) {
			System.out.println("下午:" + work.hour + "状态还可以，继续努力");
		} else {
			work.setState(new EveningState());
			work.workForCompany();
		}
	}

}
