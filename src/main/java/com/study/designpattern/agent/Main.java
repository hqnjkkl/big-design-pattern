package com.study.designpattern.agent;

/**
 * @author huqiaonan
 * @date 2016年1月19日 下午3:50:11 为其他对象提供一种代理以控制对这个对象的访问.
 *       代理和有实际需求的类都继承自同一个借口，所以代理可以代替实际类用在任何地方
 */
public class Main {

	public static void main(String[] args) {
		SchoolGirl sg = new SchoolGirl();
		sg.setName("女神");
		Pursuer per = new Pursuer(sg);
		Agent ag = new Agent(per);
		ag.giveFlower();
		ag.seeFilm();
		ag.haveDinner();
	}

}
