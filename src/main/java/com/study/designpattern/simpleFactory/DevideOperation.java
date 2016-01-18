package com.study.designpattern.simpleFactory;

public class DevideOperation extends Operation {

	@Override
	public Double getResult() {
		return num1 / num2;
	}

	public DevideOperation() {
		
	}
	public DevideOperation(Double d1,Double d2)
	{
		super(d1, d2);
	}
}
