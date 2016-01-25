package com.study.designpattern.composite;

import java.util.ArrayList;

import org.springframework.util.StringUtils;

import bsh.StringUtil;

/**
 * @author huqiaonan
 * @date 2016年1月25日 上午9:32:46
 */
public class RootCompany extends Component {

	public RootCompany() {
		children = new ArrayList<Component>();
	}

	public RootCompany(String name) {
		this();
		this.name = name;
	}

	@Override
	public void add(Component com) {
		children.add(com);
	}

	@Override
	public void del(Component com) {
		children.remove(com);
	}

	@Override
	public void display(int len) {
		for(int i=0;i<len;i++){
			System.out.print("-");
		}
		System.out.println(name);
		for(Component com:children)
		{
			com.display(len+2);
		}
	}

	@Override
	public void dutyDisplay() {
		
	}

}
