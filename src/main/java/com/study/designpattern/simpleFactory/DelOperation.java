package com.study.designpattern.simpleFactory;

public class DelOperation extends Operation {

	@Override
	public Double getResult() {
		return num1 - num2;
	}

	public DelOperation() {
		
	}
	public DelOperation(Double d1,Double d2)
	{
		super(d1, d2);
	}
}
