package com.study.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huqiaonan
 * @date 2016年1月25日 上午9:29:52
 */
public abstract class Component {

	String name;
	List<Component> children;

	public Component() {

	}

	public Component(String name) {
		this.name = name;
		this.children = new ArrayList<Component>();
	}

	public abstract void add(Component com);

	public abstract void del(Component com);

	public abstract void display(int len);

	public abstract void dutyDisplay();

}
