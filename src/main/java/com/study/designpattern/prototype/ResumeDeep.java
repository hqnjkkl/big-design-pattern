package com.study.designpattern.prototype;

/**
 * @author huqiaonan
 * @date 2016年1月20日 上午10:23:34
 */
public class ResumeDeep implements Cloneable {
	String name;
	Integer age;
	String sex;
	WorkExperience we;

	public ResumeDeep() {
		we = new WorkExperience(200, "alibaba");
	}

	public ResumeDeep(String name, Integer age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		ResumeDeep rd = new ResumeDeep(this.name, this.age, this.sex);
		rd.we = (WorkExperience) we.clone();
		return rd;

	}

	public void display() {
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("sex:" + sex);
		System.out.println("workTime:" + we.getWorkTime());
		System.out.println("workCompany:" + we.getWorkCompany());
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

	public WorkExperience getWe() {
		return we;
	}

	public void setWe(WorkExperience we) {
		this.we = we;
	}

}
