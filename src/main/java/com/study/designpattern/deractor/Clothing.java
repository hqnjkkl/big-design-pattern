package com.study.designpattern.deractor;

/**
 * @author huqiaonan
 * @date 2016年1月19日 下午2:56:33
 */
public abstract class Clothing extends Person {
	Person person;

	public Clothing() {

	}

	public Clothing(Person p) {
		this.person = p;
	}

	@Override
	public void decorate() {
		if (person != null) {
			person.decorate();
		}
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}