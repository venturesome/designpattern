package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.Shape;

public class Circle implements Shape {
	public Circle() {
		System.out.println("Circle Created");
	}

	@Override
	public void draw() {
		
		System.out.println("Circle Drawed");
	}
	
}
