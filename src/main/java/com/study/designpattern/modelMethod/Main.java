package com.study.designpattern.modelMethod;
/**
* @author huqiaonan
* @date 2016年1月20日 上午11:33:56 
* 模板方法模式，定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定步骤.
* 定义好试卷(TestPaper)的骨架，然后把试卷中答案的实现延迟到子类(TestPaperA,TestPaperB)当中。
*/
public class Main {

	public static void main(String[] args) {
		TestPaperA tpa = new TestPaperA();
		TestPaperB tpb = new TestPaperB();
		tpa.showPaper();
		tpb.showPaper();
	}

}
