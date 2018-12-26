package com.venture.some.design.pattern.main;

import com.venture.some.design.pattern.Shape;
import com.venture.some.design.pattern.impl.Circle;
import com.venture.some.design.pattern.impl.DrawGreenCircle;
import com.venture.some.design.pattern.impl.DrawRedCircle;
import com.venture.some.design.pattern.impl.Square;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		
		Shape circle =  new Circle();
		Shape square =  new Square();
		
		Shape redCircle =  new DrawRedCircle(new Circle());
		Shape greenCircle =  new DrawRedCircle(new Circle());
		Shape redSquare =  new DrawRedCircle(new Square());
		Shape greenSquare =  new DrawGreenCircle(new Square());
		
		circle.draw();
		square.draw();
		redCircle.draw();
		greenCircle.draw();
		redSquare.draw();
		greenSquare.draw();

	}

}
