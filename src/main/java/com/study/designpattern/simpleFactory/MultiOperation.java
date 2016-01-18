package com.study.designpattern.simpleFactory;

public class MultiOperation extends Operation {

	@Override
	public Double getResult() {
		return num1 * num2;
	}

	public MultiOperation() {
		
	}
	public MultiOperation(Double d1,Double d2)
	{
		super(d1, d2);
	}
}
