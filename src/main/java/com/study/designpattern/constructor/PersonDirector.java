package com.study.designpattern.constructor;

import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * @author huqiaonan
 * @date 2016年1月20日 下午4:56:58
 * 建造者模式，将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 */
public class PersonDirector extends JFrame{
	private PersonBuilder pb;

	public PersonDirector(PersonBuilder pb) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 500);
		this.setVisible(true);
		this.pb = pb;
		this.add(pb);
	}
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		createPerson(g);
	}
	public void createPerson(Graphics g)
	{
		
		pb.BuildHead(g);
		pb.BuildBody(g);
		pb.BuildArmLeft(g);
		pb.BuildArmRight(g);
		pb.BuildLegLeft(g);
		pb.BuildLegRight(g);
		repaint();
	}
	
	public static void main(String[] args) {
		PersonBuilder pb = new PersonThin();
		PersonDirector pd = new PersonDirector(pb);
		
		PersonBuilder pb2 = new PersonFat();
		PersonDirector pd2 = new PersonDirector(pb2);
	}
}
