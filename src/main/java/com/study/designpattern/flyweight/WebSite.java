package com.study.designpattern.flyweight;
/**
* @author huqiaonan
* @date 2016年1月28日 下午3:02:22 
*/
public abstract class WebSite {

	String name;
	
	public abstract void use();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
