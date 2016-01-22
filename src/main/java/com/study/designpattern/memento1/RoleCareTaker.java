package com.study.designpattern.memento1;

/**
 * @author huqiaonan
 * @date 2016年1月22日 上午9:49:08
 * 备忘录模式，在不破坏封闭性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可以将该对象恢复到原先保存的状态。
 */
public class RoleCareTaker {

	private Schedule schedule;

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public static void main(String[] args) {
		GameRole gr = new GameRole(100,100,200);
		gr.showState();
		RoleCareTaker rct = new RoleCareTaker();
		rct.setSchedule(gr.createSchedule());
		gr.setLife(30);
		gr.setDefense(60);
		gr.setAttack(60);
		gr.showState();
		gr.dateBack(rct.getSchedule());
		gr.showState();
	}
}
