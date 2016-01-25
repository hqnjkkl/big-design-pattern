package com.study.designpattern.composite;

import java.util.ArrayList;

/**
* @author huqiaonan
* @date 2016年1月25日 上午9:42:39 
*/
public class LeafCompany extends Component {

	public LeafCompany()
	{
	}
	
	public LeafCompany(String name)
	{
		this.name = name;
		this.children = new ArrayList<Component>();
		
	}
	
	@Override
	public void add(Component com) {
		System.out.println("cannot add");
	}

	@Override
	public void del(Component com) {
		System.out.println("cannot del");
	}

	@Override
	public void display(int len) {
		for(int i=0;i<len;i++){
			System.out.print("-");
		}
		System.out.println(name);
	}

	@Override
	public void dutyDisplay() {
		
	}

}
