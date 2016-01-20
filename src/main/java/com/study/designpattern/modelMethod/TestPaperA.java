package com.study.designpattern.modelMethod;
/**
* @author huqiaonan
* @date 2016年1月20日 上午11:29:22 
*/
public class TestPaperA extends TestPaper {

	@Override
	public void answersQ1() {
		System.out.println("under Canada!");
	}

	@Override
	public void answersQ2() {
		System.out.println("about 50000 yeas");
	}

	@Override
	public void answersQ3() {
		System.out.println("maybe right");
	}

}
