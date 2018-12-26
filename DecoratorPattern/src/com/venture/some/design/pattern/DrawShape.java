package com.venture.some.design.pattern;

public abstract class DrawShape implements Shape{

	protected Shape shape;
	
	public DrawShape(Shape shape) {
		this.shape = shape;
	}

	@Override
	public void draw() {

		shape.draw();
	}
}
