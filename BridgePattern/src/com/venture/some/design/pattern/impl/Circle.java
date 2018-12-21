package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.DrawShape;
import com.venture.some.design.pattern.Shape;

public class Circle extends Shape {
	
	protected int x,y,radius;
	
	public Circle(int x, int y, int radius, DrawShape drawShape) {
		super(drawShape);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		
		drawShape.drawShape();;
	}
}
