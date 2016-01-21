package com.study.designpattern.abstractFactory1;

/**
 * @author huqiaonan
 * @date 2016年1月21日 上午11:53:49
 */
public class AccessFactory implements IFactory {

	@Override
	public IUser getUser() {
		return new AccessUser();
	}

	@Override
	public IDepartment getDepartment() {
		return new AccessDepartment();
	}

}
