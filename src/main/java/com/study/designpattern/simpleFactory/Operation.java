package com.study.designpattern.simpleFactory;

public abstract class Operation {

	Double num1;
	Double num2;
	
	public Operation(){
		System.out.println("Operation initialize");
	}
	
	public Operation(Double d1,Double d2)
	{
		System.out.println("Operation 2 params");
		this.num1 = d1;
		this.num2 = d2;
	}
	
	public abstract Double getResult();
}
