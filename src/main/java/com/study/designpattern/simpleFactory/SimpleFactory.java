package com.study.designpattern.simpleFactory;

public class SimpleFactory {
	
	public Operation getOperation(String operator)
	{
		Operation ope = null;
		Double d1 = 3d;
		Double d2 = 4d;
		switch (operator)
		{
		case "+":
			ope = new AddOperation(d1,d2);
			break;
		case "-":
			ope = new DelOperation(d1, d2);
			break;
		case "*":
			ope = new MultiOperation(d1, d2);
			break;
		case "/":
			ope = new DevideOperation(d1,d2);
			break;
		}
		
		return ope;
	}
	
	public static void main(String[] args) {
		SimpleFactory sf = new SimpleFactory();
		Operation op = sf.getOperation("+");
		Double result = op.getResult();
		System.out.println(result);
		
		 op = sf.getOperation("-");
		 result = op.getResult();
		System.out.println(result);
		
		 op = sf.getOperation("*");
		 result = op.getResult();
		System.out.println(result);
		
		 op = sf.getOperation("/");
		 result = op.getResult();
		System.out.println(result);
	}
}
