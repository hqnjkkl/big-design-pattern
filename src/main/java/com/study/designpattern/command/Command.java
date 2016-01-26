package com.study.designpattern.command;

/**
 * @author huqiaonan
 * @date 2016年1月26日 下午2:52:02
 */
public abstract class Command {

	Barbecue barbecue;

	public Command() {

	}

	public Command(Barbecue barbecue) {
		super();
		this.barbecue = barbecue;
	}

	public abstract void executeCommand();

	public Barbecue getBarbecue() {
		return barbecue;
	}

	public void setBarbecue(Barbecue barbecue) {
		this.barbecue = barbecue;
	}

}
