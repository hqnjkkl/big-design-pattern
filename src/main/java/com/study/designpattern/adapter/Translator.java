package com.study.designpattern.adapter;

/**
 * @author huqiaonan
 * @date 2016年1月21日 下午4:58:35
 */
public class Translator extends Player {

	ForeignCentre fc;

	public Translator(ForeignCentre fc) {
		this.fc = fc;
	}

	@Override
	void attack() {
		fc.jingong();
	}

	@Override
	void defense() {
		fc.fangyu();
	}

}
