package com.study.designpattern.simpleFactory;

public class AddOperation extends Operation {

	@Override
	public Double getResult() {
		return num1 + num2;
	}

	public AddOperation() {
		
	}
	public AddOperation(Double d1,Double d2)
	{
		super(d1, d2);
	}
}
