package com.study.designpattern.abstractFactory2;

/**
 * @author huqiaonan
 * @date 2016年1月21日 下午1:52:54
 */
public class AccessDep implements DepType {

	@Override
	public void insertDep(Department dep) {
		System.out.println("insert access dep type");
	}

	@Override
	public void getDep() {
		System.out.println("get access dep type");
	}

}
