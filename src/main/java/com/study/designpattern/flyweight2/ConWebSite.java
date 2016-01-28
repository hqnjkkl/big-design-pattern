package com.study.designpattern.flyweight2;

/**
 * @author huqiaonan
 * @date 2016年1月28日 下午3:28:51
 */
public class ConWebSite extends WebSite {

	public ConWebSite(String name) {
		this.name = name;
	}

	@Override
	public void use(WebUser user) {
		System.out.println("网站展示:" + this.name + ";用户" + user.getUserName());
	}

}
