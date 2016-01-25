package com.study.designpattern.inerator;

/**
 * @author huqiaonan
 * @date 2016年1月25日 下午2:47:10
 */
public abstract class Aggregate<E> {

	public abstract MyIterator<E> createIterator();

	public abstract E get(int index);
	
	public abstract void add(E e);

	public abstract int Count();
}
