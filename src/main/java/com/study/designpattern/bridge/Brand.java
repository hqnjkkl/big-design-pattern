package com.study.designpattern.bridge;

/**
 * @author huqiaonan
 * @date 2016年1月26日 上午11:35:39
 *       桥接模式，将抽象部分与它的实现部分分离，使它们都可以独立地变化。实现系统可能有多角度分类，每一种分类都有可能变化，
 *       那么就把这种多角度分离出来让它们独立变化，减少 他们之间的耦合。
 */
public abstract class Brand {

	String name;
	Game game;

	public Brand() {

	}

	public abstract void run();

	public Brand(String name) {
		this.name = name;
	}

	public Brand(Game game) {
		super();
		this.game = game;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

}
