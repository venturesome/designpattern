package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.Shape;

public class Rectangle implements Shape {
	
	@Override
	public void draw() {
		
		System.out.println("Rectangle Drawed");
	}

	public Rectangle() {

		System.out.println("Rectangle Created");
	}
}
