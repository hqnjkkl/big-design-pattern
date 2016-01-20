package com.study.designpattern.constructor;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author huqiaonan
 * @date 2016年1月20日 下午4:24:16
 */
public class TestMan extends JFrame {

	private JPanel panel_1 = new JPanel() {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawLine(0, 205, 300, 205);
		}

	};

	public TestMan() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 500);
		this.setVisible(true);
		int x = 30;
		int y = 50;

//		Graphics graphics = getGraphics();
//		graphics.setColor(Color.BLUE);// 设置绘图颜色
//		graphics.drawLine(x, y, 100, 100);
		this.add(panel_1);
		repaint();
	}

	public static void main(String[] args) {
		TestMan tm = new TestMan();
	}
}
