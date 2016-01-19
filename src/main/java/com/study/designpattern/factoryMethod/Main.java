package com.study.designpattern.factoryMethod;
/**
* @author huqiaonan
* @date 2016年1月19日 下午4:53:24 
* 工厂方法模式，定义一个创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类
* 就是在简单工厂方法里面，又给工厂加了一层子工厂借口
*/
public class Main {

	public static void main(String[] args) {
		IFactory factory = new VolunteerFactory();
		LeiFeng lf1 = factory.getLeiFeng();
		lf1.buyRice();
		lf1.washClothing();
		lf1.clean();
	
		IFactory factory2 = new UndergraduateFactory();
		lf1 = factory2.getLeiFeng();
		lf1.buyRice();
		lf1.washClothing();
		lf1.clean();
	}
}
