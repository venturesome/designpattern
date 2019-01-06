package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.Strategy;

public class Add implements Strategy {

	@Override
	public int operation(int num1, int num2) {
		return num1 + num2;
	}

}
