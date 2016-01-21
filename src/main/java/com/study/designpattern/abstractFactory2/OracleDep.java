package com.study.designpattern.abstractFactory2;

/**
 * @author huqiaonan
 * @date 2016年1月21日 下午1:54:09
 */
public class OracleDep implements DepType {

	@Override
	public void insertDep(Department dep) {
		System.out.println("insert oracle dep type");
	}

	@Override
	public void getDep() {
		System.out.println("get oracle dep type");
	}

}
