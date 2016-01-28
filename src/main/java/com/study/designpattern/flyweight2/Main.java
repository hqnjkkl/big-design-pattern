package com.study.designpattern.flyweight2;

/**
 * @author huqiaonan
 * @date 2016年1月28日 下午3:36:48
 * 享元模式，如果一个应用程序使用了大凉的对象，而大量的这些对象造成了很大的存储开销时，就应该考虑使用。
 * 运用共享技术有效地支持大量细粒度的对象。
 */
public class Main {

	public static void main(String[] args) {
		WebUser wu1 = new WebUser("王二");
		WebSiteFactory fwf = new WebSiteFactory();
		WebSite site1 = fwf.getWebSite("相册展示");
		site1.use(wu1);
		WebUser wu2 = new WebUser("落魄的程序员");
		WebSite site2 = fwf.getWebSite("博客展示");
		site2.use(wu1);
		site2.use(wu2);
		WebSite site3 = fwf.getWebSite("博客展示");
		site3.use(wu2);
		System.out.println(fwf.count());
	}
}
