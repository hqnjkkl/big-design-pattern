package com.study.designpattern.command;
/**
* @author huqiaonan
* @date 2016年1月26日 下午2:55:48 
*/
public class BakeChicken extends Command {
	@Override
	public void executeCommand() {
		barbecue.bakeChicken();
	}

}
