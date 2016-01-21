package com.study.designpattern.abstractFactory2;
/**
* @author huqiaonan
* @date 2016年1月21日 下午1:46:29 
*/
public class OracleUser implements UserType {

	@Override
	public void insert(User user) {
		System.out.println("insert oracle user");
	}

	@Override
	public void getUser() {
		System.out.println("get oracle user");
	}

}
