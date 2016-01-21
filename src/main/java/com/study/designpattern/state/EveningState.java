package com.study.designpattern.state;

/**
 * @author huqiaonan
 * @date 2016年1月21日 下午3:18:23
 */
public class EveningState implements State {

	@Override
	public void writeProgram(Work work) {
		if (work.finished) {
			work.setState(new RestState());
			work.workForCompany();
		} else {
			if (work.hour < 21) {
				System.out.println("当前时间:" + work.hour + ",效率很低");
			} else {
				work.setState(new SleepingState());
				work.workForCompany();
			}
		}
	}

}
