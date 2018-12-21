package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.ColdDrink;

public class Coke extends ColdDrink {

	@Override
	public float Price() {
		
		return 5f;
	}

	@Override
	public String Name() {
		
		return "Coke";
	}
}
