package com.venture.some.design.pattern.main;

import com.venture.some.design.pattern.Strategy;

public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public int executeStrategy(int num1, int num2) {
		
		return strategy.operation(num1, num2);
	}
}
