package com.study.designpattern.inerator;

/**
 * @author huqiaonan
 * @param <E>
 * @date 2016年1月25日 下午2:46:08
 */
public class MyIteratorCon<E> implements MyIterator<E> {

	Aggregate<E> aggregate;

	public MyIteratorCon() {

	}

	public MyIteratorCon(Aggregate<E> aggre) {
		this.aggregate = aggre;
	}

	int cur = -1;

	@Override
	public E first() {
		return aggregate.get(0);
	}

	@Override
	public E next() {
		E e = null;
		if (cur >= aggregate.Count() - 1) {
			return e;
		} else {
			cur++;
			return aggregate.get(cur);
		}
	}

	@Override
	public boolean idDone() {
		if (cur >= aggregate.Count() - 1) {
			return true;
		}
		return false;
	}

	@Override
	public E current() {
		return aggregate.get(cur);
	}

}
