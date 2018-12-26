package com.venture.some.design.pattern;

public abstract class DrawSquare extends DrawShape {

	public DrawSquare(Shape squareShap) {
		super(squareShap);
	}

	@Override
	public void draw() {

		shape.draw();
	}
}
