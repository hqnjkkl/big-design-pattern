package com.study.designpattern.inerator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huqiaonan
 * @date 2016年1月25日 下午2:48:52
 */
public class ConAggregate<E> extends Aggregate<E> {

	List<E> arrayList = new ArrayList<E>();

	@Override
	public MyIterator<E> createIterator() {
		return new MyIteratorCon<>(this);
	}

	@Override
	public E get(int index) {
		return arrayList.get(index);
	}

	@Override
	public int Count() {
		return arrayList.size();
	}

	@Override
	public void add(E e) {
		arrayList.add(e);
	}

}
