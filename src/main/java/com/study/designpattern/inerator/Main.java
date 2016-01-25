package com.study.designpattern.inerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author huqiaonan
 * @date 2016年1月25日 上午10:29:44
 * 迭代器模式，提供一种方法顺序访问一个聚合对象中各个元素，而又不暴露该对象的内部表示。
 */
public class Main {

	public static void main(String[] args) {
		Aggregate<String> conA = new ConAggregate<String>();
		conA.add("zhang san");
		conA.add("李四");
		conA.add("王五");
		MyIterator<String> myIterator = conA.createIterator();
		
		while (!myIterator.idDone()) {
			String next = myIterator.next();
			System.out.println(next);
		}
	}

	public static void iterator() {
		List<Integer> list = new ArrayList<Integer>();
		Iterator<Integer> res = list.iterator();
		Map<String, String> map = new HashMap<String, String>();
		// Set<String> set = new HashSet<String>();
		Cloneable c = new HashSet<String>();
	}

}
