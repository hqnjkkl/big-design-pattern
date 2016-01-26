package com.study.designpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
* @author huqiaonan
* @date 2016年1月26日 下午2:57:22 
*/
public class Waiter {

	private List<Command> commands = new ArrayList<Command>();
	
	public void addCommand(Command command)
	{
		commands.add(command);
	}
	
	public void delCommand(Command command)
	{
		commands.remove(command);
	}
	
	public void invoke()
	{
		for(Command command:commands)
		{
			command.executeCommand();
		}
	}
}
