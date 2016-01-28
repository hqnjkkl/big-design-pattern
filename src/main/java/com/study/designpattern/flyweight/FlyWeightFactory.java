package com.study.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author huqiaonan
 * @date 2016年1月28日 下午3:05:31
 */
public class FlyWeightFactory {

	private Map<String, WebSite> table = new HashMap<String, WebSite>();

	public WebSite getWebSite(String key) {
		if (!table.containsKey(key)) {
			table.put(key, new ConWebSite(key));
		}
		return table.get(key);
	}

	public Integer count() {
		return table.size();
	}
}