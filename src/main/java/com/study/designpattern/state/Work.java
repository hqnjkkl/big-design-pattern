package com.study.designpattern.state;

/**
 * @author huqiaonan
 * @date 2016年1月21日 下午3:12:18
 */
public class Work {

	State state;
	
	int hour = 0;
	
	boolean finished;

	public Work() {
		state = new ForenoonState();
	}

	public void workForCompany() {
		state.writeProgram(this);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	
}
