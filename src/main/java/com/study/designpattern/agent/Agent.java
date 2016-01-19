package com.study.designpattern.agent;

/**
 * @author huqiaonan
 * @date 2016年1月19日 下午3:48:44
 */
public class Agent implements PursuitSkill {

	Pursuer pu;

	public Agent() {
	}

	public Agent(Pursuer pu) {

		this.pu = pu;
	}

	@Override
	public void giveFlower() {
		pu.giveFlower();
	}

	@Override
	public void seeFilm() {
		pu.seeFilm();
	}

	@Override
	public void haveDinner() {
		pu.haveDinner();
	}
}
