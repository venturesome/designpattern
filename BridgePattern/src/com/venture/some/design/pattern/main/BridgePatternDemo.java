package com.venture.some.design.pattern.main;

import com.venture.some.design.pattern.Shape;
import com.venture.some.design.pattern.impl.Circle;
import com.venture.some.design.pattern.impl.DrawGreenCircle;
import com.venture.some.design.pattern.impl.DrawGreenSquare;
import com.venture.some.design.pattern.impl.DrawRedCircle;
import com.venture.some.design.pattern.impl.DrawRedSquare;
import com.venture.some.design.pattern.impl.Square;

public class BridgePatternDemo {

	public static void main(String[] args) {
		
		Shape redCircle = new Circle(100,100,10,new DrawRedCircle());
		Shape greenCircle = new Circle(100,100,10,new DrawGreenCircle());
		Shape redSquare = new Square(10,new DrawRedSquare());
		Shape greenSquare = new Square(10,new DrawGreenSquare());
		
		redCircle.draw();
		greenCircle.draw();
		redSquare.draw();
		greenSquare.draw();
	}
}
