package com.study.designpattern.state;
/**
* @author huqiaonan
* @date 2016年1月21日 下午3:25:54 
*/
public class RestState implements State {

	@Override
	public void writeProgram(Work work) {
		System.out.println("时间:"+work.hour+"回家了!");
	}

}
