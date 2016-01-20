package com.study.designpattern.constructor;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author huqiaonan
 * @date 2016年1月20日 下午4:46:18
 */
public class PersonThin extends PersonBuilder {

	@Override
	public void BuildHead(Graphics g) {
		g.setColor(Color.GRAY);
		g.drawOval(200, 200, 30, 30);
	}

	@Override
	public void BuildBody(Graphics g) {
		g.setColor(Color.RED);
		g.drawRect(210, 230, 10, 50);
	}

	@Override
	public void BuildArmLeft(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawLine(210, 230, 40, 100);
	}

	@Override
	public void BuildArmRight(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawLine(220, 230, 90, 100);
	}

	@Override
	public void BuildLegLeft(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawLine(210, 280, 45, 150);

	}

	@Override
	public void BuildLegRight(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawOval(220, 280, 85, 150);

	}

	public static void main(String[] args) {

	}

}
