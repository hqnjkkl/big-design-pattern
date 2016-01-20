package com.study.designpattern.prototype;


import static org.testng.Assert.assertEquals;

/**
 * @author huqiaonan
 * @date 2016年1月20日 上午9:26:12
 * 原型模式，用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * 在 java当中，有Object的clone()函数和Cloneable接口可以使用
 */
public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Resume resume = new Resume("陈旭元", 30, "男");
		resume.setWorkCompany("netease");
		resume.setWorkTime(100);
		
		
		Resume r2 = (Resume) resume.clone();
		r2.setWorkCompany("研究院");
		resume.display();
		r2.display();
		
		String name = "王小丫";
		Integer age = 101;
		String sex = "女";
		ResumeDeep rd = new ResumeDeep();
		rd.setName(name);
		rd.setAge(age);
		rd.setSex(sex);
		ResumeDeep rd2 = (ResumeDeep) rd.clone();
		WorkExperience we2 = rd2.getWe();
		we2.setWorkTime(111);
		rd.display();
		rd2.display();
//		Resume r3 = resume;
//		assertEquals(resume, r3);
		
	}
}
