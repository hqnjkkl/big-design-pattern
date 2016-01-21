package com.study.designpattern.abstractFactory1;
/**
* @author huqiaonan
* @date 2016年1月21日 上午11:55:10 
* 抽象工厂模式，和工厂方法模式相比，其子工厂不只有一个对象获取方法，会有多个对象获取方法，不止和一个产出接口关联，一个方法关联一个产出接口。
* 提供一个创建一系列相关或依赖对象的接口，而无需指定它们具体的类。
*/
public class Main {

	public static void main(String[] args) {
		
		IFactory factory = new AccessFactory();
		IUser user = factory.getUser();
		IDepartment department = factory.getDepartment();
		user.insert();
		user.getData();
		department.insertDep();
		department.getDep();
	}

}
