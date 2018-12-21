package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.DrawCircle;

public class DrawRedCircle extends DrawCircle {

	public void drawGreenCircle(int radius, int x, int y) {
		super.x = x;
		super.y = y;
		super.radius = radius;
	}
	
	public void drawCircle(int radius, int x, int y) {
		
		System.out.println("Drawing Red Circle [radius:" + radius + " x:" + x + " y:" + y + "]");
	}

	@Override
	public void drawShape() {
		drawCircle(radius, x, y);	
	}
}
