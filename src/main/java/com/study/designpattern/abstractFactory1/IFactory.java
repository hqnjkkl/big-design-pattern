package com.study.designpattern.abstractFactory1;

/**
 * @author huqiaonan
 * @date 2016年1月21日 上午11:51:21
 */
public interface IFactory {

	IUser getUser();

	IDepartment getDepartment();
}
