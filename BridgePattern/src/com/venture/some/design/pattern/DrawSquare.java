package com.venture.some.design.pattern;

public abstract class DrawSquare implements DrawShape {

	protected int x;
	
	public void drawSquare(int x) {
		this.x = x;
	}
}
