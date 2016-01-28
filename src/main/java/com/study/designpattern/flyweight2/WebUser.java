package com.study.designpattern.flyweight2;

/**
 * @author huqiaonan
 * @date 2016年1月28日 下午3:27:58
 */
public class WebUser {

	String userName;

	public WebUser() {

	}

	public WebUser(String userName) {
		super();
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "WebUser [userName=" + userName + "]";
	}

}
