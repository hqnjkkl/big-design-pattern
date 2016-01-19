package com.study.designpattern.agent;

/**
 * @author huqiaonan
 * @date 2016年1月19日 下午3:47:36
 */
public class Pursuer implements PursuitSkill {

	SchoolGirl sg;

	public Pursuer() {
		
	}
	
	public Pursuer(SchoolGirl sg)
	{
		this.sg = sg;
	}
	
	@Override
	public void giveFlower() {
		System.out.println("give a rose " + sg.getName());
	}

	@Override
	public void seeFilm() {
		System.out.println("see the true false " + sg.getName());
	}

	@Override
	public void haveDinner() {
		System.out.println("have a big dinner " + sg.getName());
	}

}
