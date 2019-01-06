package com.venture.some.design.pattern.main;

import com.venture.some.design.pattern.impl.Add;
import com.venture.some.design.pattern.impl.Multiply;
import com.venture.some.design.pattern.impl.Substract;

public class StrategyPatternDemo {

	public static void main(String[] args) {

		Context context = new Context(new Add());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new Substract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new Multiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}

}
