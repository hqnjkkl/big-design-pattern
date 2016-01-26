package com.study.designpattern.command;
/**
* @author huqiaonan
* @date 2016年1月26日 下午3:00:03 
* 命令模式，将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化；对请求排队或记录请求日志，以及支持可撤销的操作。
*/
public class Main {

	public static void main(String[] args) {
		Barbecue boy = new Barbecue("黑人");
		Command bakeChicken1 = new BakeChicken();
		bakeChicken1.setBarbecue(boy);
		Command bakeBeef = new BakeBeef();
		bakeBeef.setBarbecue(boy);
		
		Waiter waiter = new Waiter();
		waiter.addCommand(bakeChicken1);
		waiter.addCommand(bakeBeef);
		waiter.invoke();
	}

}
