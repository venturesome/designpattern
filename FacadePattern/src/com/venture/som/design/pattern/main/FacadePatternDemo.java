package com.venture.som.design.pattern.main;

import com.venture.some.design.pattern.impl.Circle;
import com.venture.some.design.pattern.impl.Rectangle;
import com.venture.some.design.pattern.impl.Square;

public class FacadePatternDemo {

	public static void main(String[] args) {
		
		ShapeMaker shapeMaker = new ShapeMaker(new Circle(), new Rectangle(), new Square());
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
