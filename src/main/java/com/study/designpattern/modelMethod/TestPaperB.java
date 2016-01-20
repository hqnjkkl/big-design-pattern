package com.study.designpattern.modelMethod;
/**
* @author huqiaonan
* @date 2016年1月20日 上午11:31:56 
*/
public class TestPaperB extends TestPaper {

	@Override
	public void answersQ1() {
		System.out.println("in north America");
	}

	@Override
	public void answersQ2() {
		System.out.println("3000,000 years");
	}

	@Override
	public void answersQ3() {
		System.out.println("I don't know");
	}

}
