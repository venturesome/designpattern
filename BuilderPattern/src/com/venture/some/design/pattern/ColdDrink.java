package com.venture.some.design.pattern;

import com.venture.some.design.pattern.impl.Bottle;

public abstract class ColdDrink implements Item {
	
	@Override
	public String Name() {
		
		return "ColdDrink";
	}

	@Override
	public Packing packing() {

		return new Bottle();
	}

	@Override
	public abstract float Price();

}
