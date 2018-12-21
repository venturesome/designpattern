package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.DrawShape;
import com.venture.some.design.pattern.Shape;

public class Square extends Shape {
	
	protected int x;
	
	public Square(int x, DrawShape drawShape) {
		super(drawShape);
		this.x = x;
	}

	@Override
	public void draw() {
		
		drawShape.drawShape();;
	}
}
