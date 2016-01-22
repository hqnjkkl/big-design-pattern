package com.study.designpattern.memento1;

/**
 * @author huqiaonan
 * @date 2016年1月22日 上午9:39:47
 */
public class GameRole {

	private int attack;
	private int life;
	private int defense;

	public GameRole() {

	}

	public GameRole(int attack, int life, int defense) {
		this.attack = attack;
		this.life = life;
		this.defense = defense;
	}

	public void showState() {
		System.out.println("atack:" + attack + ",life:" + life + ",defense:" + defense);
	}

	public Schedule createSchedule() {
		return new Schedule(attack, life, defense);
	}

	public void dateBack(Schedule schedule) {
		this.attack = schedule.getAttack();
		this.life = schedule.getLife();
		this.defense = schedule.getDefense();
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

}
