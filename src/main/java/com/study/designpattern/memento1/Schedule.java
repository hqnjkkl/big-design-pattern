package com.study.designpattern.memento1;

/**
 * @author huqiaonan
 * @date 2016年1月22日 上午9:42:53
 */
public class Schedule {

	private int attack;
	private int life;
	private int defense;

	public Schedule() {

	}

	public Schedule(int attack, int life, int defense) {
		super();
		this.attack = attack;
		this.life = life;
		this.defense = defense;
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
