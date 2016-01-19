package com.study.designpattern.agent;
/**
* @author huqiaonan
* @date 2016年1月19日 下午3:50:11 
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
