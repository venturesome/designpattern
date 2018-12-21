package com.venture.some.design.pattern;

import com.venture.some.design.pattern.impl.Wrapper;

public abstract class Burger implements Item {

	@Override
	public String Name() {
		
		return "Burger";
	}

	@Override
	public Packing packing() {

		return new Wrapper();
	}

	@Override
	public abstract float Price();

}
