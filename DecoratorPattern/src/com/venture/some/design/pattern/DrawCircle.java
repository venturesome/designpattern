package com.venture.some.design.pattern;

public abstract class DrawCircle extends DrawShape {

	public DrawCircle(Shape circleShape) {
		super(circleShape);
	}

	@Override
	public void draw() {

		shape.draw();
	}
}
