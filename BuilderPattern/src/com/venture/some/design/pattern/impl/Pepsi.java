package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.ColdDrink;

public class Pepsi extends ColdDrink {

	@Override
	public float Price() {
		
		return 4f;
	}

	@Override
	public String Name() {
		
		return "Pepsi";
	}
}
