package com.venture.some.design.pattern;

public abstract class DrawCircle implements DrawShape {

	protected int x,y,radius;
	
	public void drawCircle(int radius, int x, int y) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
}
