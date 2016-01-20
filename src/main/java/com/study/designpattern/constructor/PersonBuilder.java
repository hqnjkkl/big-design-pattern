package com.study.designpattern.constructor;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * @author huqiaonan
 * @date 2016年1月20日 下午4:43:50
 */
public abstract class PersonBuilder extends JPanel {

	public PersonBuilder() {

	}

	public abstract void BuildHead(Graphics g);

	public abstract void BuildBody(Graphics g);

	public abstract void BuildArmLeft(Graphics g);

	public abstract void BuildArmRight(Graphics g);

	public abstract void BuildLegLeft(Graphics g);

	public abstract void BuildLegRight(Graphics g);

}
