package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.DrawCircle;
import com.venture.some.design.pattern.Shape;

public class DrawGreenCircle extends DrawCircle {

	public DrawGreenCircle(Shape shape) {
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
