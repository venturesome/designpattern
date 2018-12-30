package com.venture.some.design.pattern.main;

import java.util.HashMap;
import java.util.Map;

import com.venture.some.design.pattern.Shape;
import com.venture.some.design.pattern.impl.Circle;
import com.venture.some.design.pattern.impl.Rectangle;
import com.venture.some.design.pattern.impl.Square;

public class ShapeFactory {

	public enum ShapeType {

		Circle, Rectangle, Square
	}

	static Map<ShapeType, Shape> shapes = new HashMap<ShapeType, Shape>();

	public static Shape getShape(ShapeType shapeType) {

		if (!shapes.containsKey(shapeType)) {
            Shape shape = null;
            
			switch (shapeType) {
			case Circle:
				shape=new Circle();
				break;
			case Rectangle:
				shape=new Rectangle();
				break;
			case Square:
				shape=new Square();
				break;
			default:
			}
			
			shapes.put(shapeType, shape);
		}
		
		return shapes.get(shapeType);
	}
}
