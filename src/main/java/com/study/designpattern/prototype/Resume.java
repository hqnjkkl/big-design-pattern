package com.study.designpattern.prototype;

/**
 * @author huqiaonan
 * @date 2016年1月19日 下午5:54:40
 */
public class Resume implements Cloneable {
	String name;
	Integer age;
	String sex;
	Integer workTime;
	String workCompany;

	public Resume() {

	}

	public Resume(String name, Integer age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void display() {
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("sex:" + sex);
		System.out.println("workTime:" + workTime);
		System.out.println("workCompany:" + workCompany);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getWorkTime() {
		return workTime;
	}

	public void setWorkTime(Integer workTime) {
		this.workTime = workTime;
	}

	public String getWorkCompany() {
		return workCompany;
	}

	public void setWorkCompany(String workCompany) {
		this.workCompany = workCompany;
	}

}
