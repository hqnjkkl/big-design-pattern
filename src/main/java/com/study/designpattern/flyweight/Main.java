package com.study.designpattern.flyweight;

/**
 * @author huqiaonan
 * @date 2016年1月28日 下午3:11:46
 */
public class Main {
	public static void main(String[] args) {
		FlyWeightFactory fwf = new FlyWeightFactory();
		WebSite webSite = fwf.getWebSite("产品展示");
		webSite.use();
		WebSite webSite2 = fwf.getWebSite("产品展示");
		webSite2.use();
		WebSite webSite3 = fwf.getWebSite("博客展示");
		webSite3.use();
		System.out.println(fwf.count());
	}
}
