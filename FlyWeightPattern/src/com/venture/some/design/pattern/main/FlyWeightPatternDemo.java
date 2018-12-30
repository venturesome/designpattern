package com.venture.some.design.pattern.main;

import com.venture.some.design.pattern.Shape;
import com.venture.some.design.pattern.main.ShapeFactory.ShapeType;

public class FlyWeightPatternDemo {

	public static void main(String[] args) {
		
		Shape circle1 =  ShapeFactory.getShape(ShapeType.Circle);
		Shape circle2 =  ShapeFactory.getShape(ShapeType.Circle);
		Shape rectangle1 =  ShapeFactory.getShape(ShapeType.Rectangle);
		Shape rectangle2 =  ShapeFactory.getShape(ShapeType.Rectangle);
		Shape square1 =  ShapeFactory.getShape(ShapeType.Square);
		Shape square2 =  ShapeFactory.getShape(ShapeType.Square);
		
		circle1.draw();
		circle2.draw();
		rectangle1.draw();
		rectangle2.draw();
		square1.draw();
		square2.draw();
	}

}
