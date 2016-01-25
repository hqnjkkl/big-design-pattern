package com.study.designpattern.inerator;

/**
 * @author huqiaonan
 * @date 2016年1月25日 下午2:43:21
 */
public interface MyIterator<E> {
	
	E first();
	
	E next();
	
	boolean idDone();
	
	E current();
	
}
