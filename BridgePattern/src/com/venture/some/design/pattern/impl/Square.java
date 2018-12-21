package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.DrawShape;
import com.venture.some.design.pattern.DrawSquare;
import com.venture.some.design.pattern.Shape;

public class Square extends Shape {
	
	protected int x;
	
	public Square(int x, DrawShape drawShape) {
		super(setup(x,drawShape));
		this.x = x;
	}

	@Override
	public void draw() {
		
		drawShape.drawShape();;
	}
	
	private static DrawShape setup(int x, DrawShape drawShape) {
		
		DrawSquare drawSquare = (DrawSquare)drawShape;
		drawSquare.setupSquare(x);
		
		return drawShape;
	}
}
