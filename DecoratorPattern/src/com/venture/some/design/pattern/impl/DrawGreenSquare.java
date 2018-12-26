package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.DrawSquare;
import com.venture.some.design.pattern.Shape;

public class DrawGreenSquare extends DrawSquare {

	public DrawGreenSquare(Shape shape) {
		super(shape);
	}

	public void drawCircle() {
		
		System.out.print("Drawing Green ");
	}

	@Override
	public void draw() {
		drawCircle();
		shape.draw();
	}
}
