package com.study.designpattern.flyweight2;

/**
 * @author huqiaonan
 * @date 2016年1月28日 下午3:26:48
 */
public abstract class WebSite {

	String name;

	public abstract void use(WebUser user);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
