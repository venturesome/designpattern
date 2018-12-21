package com.venture.some.design.pattern;

public abstract class Shape {

	protected DrawShape drawShape;
	protected Shape(DrawShape drawShape) {
		this.drawShape = drawShape;
	}
	
	public abstract void draw();
}
