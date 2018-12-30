package com.venture.som.design.pattern.main;

import com.venture.som.design.pattern.Shape;

public class ShapeMaker {

	private Shape circle;
	private Shape rectangle;
	private Shape square;
	
	public ShapeMaker(Shape circle, Shape rectangle, Shape square) {
		super();
		this.circle = circle;
		this.rectangle = rectangle;
		this.square = square;
	}

	public void drawCircle() {
		circle.draw();
	}
	public void drawRectangle() {
		rectangle.draw();
	}
	public void drawSquare() {
		square.draw();
	}
	
}
