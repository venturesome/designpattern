package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.DrawSquare;
import com.venture.some.design.pattern.Shape;

public class DrawRedSquare extends DrawSquare {

	public DrawRedSquare(Shape shape) {
		super(shape);
	}

	public void drawCircle() {
		
		System.out.print("Drawing Red ");
	}

	@Override
	public void draw() {
		drawCircle();
		shape.draw();
	}
}
