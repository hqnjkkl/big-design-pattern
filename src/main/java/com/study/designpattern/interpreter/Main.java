package com.study.designpattern.interpreter;

/**
 * @author huqiaonan
 * @date 2016年1月28日 下午4:40:14
 */
public class Main {

	private class InerClass {
		private int a;

		private InerClass(int a) {
			super();
			this.a = a;
		}

		private class IIC {
			private int b;

			private IIC() {
				b = 1000;
			}

			public IIC(int bb) {
				b = bb;
			}
		}
	}

	public static void test() {
		InerClass ic = new Main().new InerClass(10);
		com.study.designpattern.interpreter.Main.InerClass.IIC iic = ic.new IIC();
		System.out.println(iic.b);
		System.out.println(ic.a);
//		java.util.Arrays.binarySearch ;
	}

	public static void main(String[] args) {
		PlayContext context = new PlayContext();
		// 音乐-上海滩
		System.out.println("上海滩: ");
		context.setText("O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
		Expression expression = null;
		while (context.getText().length() > 0) {
			String str = context.getText().substring(0, 1);
			switch (str) {
			case "O":
				expression = new Scale();
				break;
			case "C":
			case "D":
			case "E":
			case "F":
			case "G":
			case "A":
			case "B":
			case "P":
				expression = new Note();
				break;
			}
			expression.Interpret(context);
		}
	}
}
