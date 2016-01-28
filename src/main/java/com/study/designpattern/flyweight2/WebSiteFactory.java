package com.study.designpattern.flyweight2;

import java.util.HashMap;
import java.util.Map;

import com.study.designpattern.flyweight2.ConWebSite;

/**
 * @author huqiaonan
 * @date 2016年1月28日 下午3:31:33
 */
public class WebSiteFactory {

	Map<String, WebSite> table = new HashMap<String, WebSite>();

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
