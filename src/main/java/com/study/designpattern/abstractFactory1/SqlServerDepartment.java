package com.study.designpattern.abstractFactory1;
/**
* @author huqiaonan
* @date 2016年1月21日 上午11:49:48 
*/
public class SqlServerDepartment implements IDepartment {

	@Override
	public void insertDep() {
		System.out.println("insert SqlServer department");
	}

	@Override
	public void getDep() {
		System.out.println("get SqlServer department");
	}

}
