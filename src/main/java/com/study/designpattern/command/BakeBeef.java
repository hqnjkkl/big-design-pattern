package com.study.designpattern.command;

/**
 * @author huqiaonan
 * @date 2016年1月26日 下午2:56:19
 */
public class BakeBeef extends Command {

	@Override
	public void executeCommand() {
		barbecue.bakeBeef();
	}

}
