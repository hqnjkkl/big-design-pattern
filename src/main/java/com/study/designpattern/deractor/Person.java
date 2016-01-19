package com.study.designpattern.deractor;

/**
 * @author huqiaonan
 * @date 2016年1月19日 下午2:54:14
 * 装饰模式，动态地给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更为灵活。
 */
public class Person {

	String name;

	public Person() {

	}

	public Person(String name) {
		this.name = name;
	}

	
	public void decorate() {
		System.out.println("I am showing!"+name);
	}
	
	public static void main(String[] args) {
		Person p = new Person("没女朋友的大学生");
		Trousers trou = new Trousers();
		STShirt sts = new STShirt();
		Cap cap = new Cap();
		
		cap.setPerson(p);
		sts.setPerson(cap);
		trou.setPerson(sts);
		trou.decorate();
	}
}
