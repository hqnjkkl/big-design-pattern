package com.study.designpattern.singleton;

/**
 * @author huqiaonan
 * @date 2016年1月25日 下午4:36:15
 * 枚举类，近乎完美的单例模式
 */
public enum EnumSingleton {
	INSTANCE;
	private EnumSingleton() {

	}
}
