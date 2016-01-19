package com.study.designpattern.strategy2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author huqiaonan
 * @date 2016年1月18日 下午6:43:54
 *       策略模式，定义了算法家族，分别封装起来，让他们之间可以相互替换，此模式算法的变化，不会影响到使用算法的客户。
 */
public class ProductCalculate {

	CashContext cc = null;

	public ProductCalculate() {
		cc = new CashContext();
	}

	public void totalMoney(String type, double cash) {
		switch (type) {
		case "1":
			cc.setCs(new NormalCash());
			break;

		case "2":
			cc.setCs(new CashSale(0.7));
			break;

		case "3":
			cc.setCs(new CashReturn(300, 100));
			break;

		default:
			System.out.println("error type");
			return;
		}
		System.out.println(cc.getResult(cash));
	}

	/**
	 * 使用反射来构造这个类，
	 * 
	 * @param className
	 * @param cash
	 * @param discount
	 */
	public void totalMoneyByReflex(String className, double cash, double discount) {
		try {
			Class c = Class.forName(className);
			Constructor[] conss = c.getConstructors();
			for (int i = 0; i < conss.length; i++) {
				System.out.println(conss[i].getName());
				Class[] paraTypes = conss[i].getParameterTypes();
				for (int j = 0; j < paraTypes.length; j++) {
					System.out.println(paraTypes[j].getTypeName());
				}
			}
			Constructor cons = c.getConstructor(new Class[] { double.class });
			CashSuper obj = (CashSuper) cons.newInstance(new Object[] { discount });
			cc.setCs(obj);
			System.out.println(cc.getResult(cash));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		ProductCalculate pc = new ProductCalculate();
		// pc.totalMoney("1", 200);
		// pc.totalMoney("2", 1000);
		// pc.totalMoney("3", 1100);
		pc.totalMoneyByReflex("com.study.designpattern.strategy2.CashSale", 900, 0.9);
	}

}
