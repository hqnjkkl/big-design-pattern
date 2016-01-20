package com.study.designpattern.constructor;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author huqiaonan
 * @date 2016年1月20日 下午4:46:18
 */
public class PersonFat extends PersonBuilder {

	@Override
	public void BuildHead(Graphics g) {
		g.setColor(Color.GRAY);
		g.drawOval(200, 200, 40, 30);
	}

	@Override
	public void BuildBody(Graphics g) {
		g.setColor(Color.RED);
		g.drawRect(210, 230, 20, 50);
	}

	@Override
	public void BuildArmLeft(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawLine(210, 230, 50, 100);
	}

	@Override
	public void BuildArmRight(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawLine(220, 230, 100, 100);
	}

	@Override
	public void BuildLegLeft(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawLine(210, 280, 60, 150);

	}

	@Override
	public void BuildLegRight(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawOval(220, 280, 100, 150);

	}

	public static void main(String[] args) {

	}

}
