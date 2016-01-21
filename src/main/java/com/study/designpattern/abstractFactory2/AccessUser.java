package com.study.designpattern.abstractFactory2;

/**
 * @author huqiaonan
 * @date 2016年1月21日 下午1:45:31
 */
public class AccessUser implements UserType {

	@Override
	public void insert(User user) {
		System.out.println("insert access user");
	}

	@Override
	public void getUser() {
		System.out.println("get access user");
	}

}
