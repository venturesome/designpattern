package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.DrawCircle;
import com.venture.some.design.pattern.Shape;

public class DrawRedCircle extends DrawCircle {

	public DrawRedCircle(Shape shape) {
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
