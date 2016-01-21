package com.study.designpattern.abstractFactory1;
/**
* @author huqiaonan
* @date 2016年1月21日 上午11:46:24 
*/
public class SqlServerUser implements IUser {

	@Override
	public void insert() {
		System.out.println("insert sqlServerUser");
	}

	@Override
	public void getData() {
		System.out.println("get sqlServerUser");
	}

}
