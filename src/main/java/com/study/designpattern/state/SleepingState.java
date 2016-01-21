package com.study.designpattern.state;

/**
 * @author huqiaonan
 * @date 2016年1月21日 下午3:18:36
 */
public class SleepingState implements State {

	@Override
	public void writeProgram(Work work) {
		System.out.println("当前时间:"+work.hour+",睡着了");
	}

}
