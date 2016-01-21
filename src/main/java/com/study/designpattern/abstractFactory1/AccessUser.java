package com.study.designpattern.abstractFactory1;
/**
* @author huqiaonan
* @date 2016年1月21日 上午11:47:14 
*/
public class AccessUser implements IUser{


	@Override
	public void insert() {
		System.out.println("insert access ServerUser");
	}

	@Override
	public void getData() {
		System.out.println("get access ServerUser");
	}


}
