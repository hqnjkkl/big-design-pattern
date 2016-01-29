package com.study.designpattern.interpreter;

/**
 * @author huqiaonan
 * @date 2016年1月29日 上午9:33:09
 */
public class Scale extends Expression {

	@Override
	public void execute(String key, double value) {
		String scale = "";
		switch ((int) value) {
		case 1:
			scale = "低音";
			break;
		case 2:
			scale = "中音";
			break;
		case 3:
			scale = "高音";
			break;
		}
		System.out.println(scale + " ");
	}
}
