package com.study.designpattern.flyweight;

/**
 * @author huqiaonan
 * @date 2016年1月28日 下午3:03:10
 */
public class ConWebSite extends WebSite {

	public ConWebSite() {

	}

	public ConWebSite(String name) {
		this.name = name;
	}

	@Override
	public void use() {
		System.out.println("网站展示:"+name);
	}

}
