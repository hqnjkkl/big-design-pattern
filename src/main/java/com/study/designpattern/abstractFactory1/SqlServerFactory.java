package com.study.designpattern.abstractFactory1;
/**
* @author huqiaonan
* @date 2016年1月21日 上午11:52:08 
*/
public class SqlServerFactory implements IFactory {

	@Override
	public IUser getUser() {
		return new SqlServerUser();
	}

	@Override
	public IDepartment getDepartment() {
		// TODO Auto-generated method stub
		return new SqlServerDepartment();
	}


}
