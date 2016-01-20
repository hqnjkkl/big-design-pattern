package com.study.designpattern.modelMethod;
/**
* @author huqiaonan
* @date 2016年1月20日 上午11:27:01 
*/
public abstract class TestPaper {

	
	public void showPaper()
	{
		testQuestion1();
		testQuestion2();
		testQuestion3();
	}
	public void testQuestion1()
	{
		System.out.println("question1: where is America?");
		answersQ1();
	}
	
	public abstract void answersQ1();
	
	public void testQuestion2()
	{
		System.out.println("question2: How long human exists?");
		answersQ2();
	}
	
	public abstract void answersQ2();
	
	public void testQuestion3()
	{
		System.out.println("question3: is Human Right?");
		answersQ3();
	}
	
	public abstract void answersQ3();
}
