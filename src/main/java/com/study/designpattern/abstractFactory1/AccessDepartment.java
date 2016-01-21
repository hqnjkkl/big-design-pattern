package com.study.designpattern.abstractFactory1;
/**
* @author huqiaonan
* @date 2016年1月21日 上午11:49:48 
*/
public class AccessDepartment implements IDepartment {

	@Override
	public void insertDep() {
		System.out.println("insert access department");
	}

	@Override
	public void getDep() {
		System.out.println("get access department");
	}

}
