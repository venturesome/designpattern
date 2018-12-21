package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.Burger;

public class VegBurger extends Burger {

	@Override
	public float Price() {
		
		return 25f;
	}

	@Override
	public String Name() {
		
		return "VegBurger";
	}

}
