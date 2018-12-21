package com.venture.some.design.pattern;

public abstract class DrawSquare implements DrawShape {

	protected int x;
	
	public void setupSquare(int x) {
		this.x = x;
	}
}
