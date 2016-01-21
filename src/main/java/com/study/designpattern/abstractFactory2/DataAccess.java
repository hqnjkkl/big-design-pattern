package com.study.designpattern.abstractFactory2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author huqiaonan
 * @date 2016年1月21日 下午1:54:49
 * 抽象工厂模式，通过反射来代替抽象工厂以及子工厂，使得修改配置文件就可以改变获得的类。
 */
public class DataAccess {
	
	String head = "com.study.designpattern.abstractFactory2.";
	Properties prop = new Properties();
	InputStream in = Object.class.getResourceAsStream("/test.properties");

	public DataAccess() {
		try {
			prop.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	UserType createUser() {
		UserType ut = null;
		try {
			Class c = Class.forName(head+prop.getProperty("type")+"User");
			ut = (UserType) c.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return ut;
	}

	DepType createDep() {
		DepType dt = null;
		try {
			Class c = Class.forName(head+prop.getProperty("type")+"Dep");
			dt = (DepType) c.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return dt;
	}

	public static void main(String[] args) {
		User user = new User();
		DataAccess da = new DataAccess();
		UserType ut = da.createUser();
		ut.insert(user);
		ut.getUser();
		
	}

}
