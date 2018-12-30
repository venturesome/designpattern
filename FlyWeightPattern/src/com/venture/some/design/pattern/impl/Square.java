package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.Shape;

public class Square implements Shape {
	
	
	public Square() {
		System.out.println("Square Created");
	}

	@Override
	public void draw() {
		
		System.out.println("Square Drawed");
	}
}
