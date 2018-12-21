package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.DrawSquare;

public class DrawGreenSquare extends DrawSquare {

	public void drawGreenSquare(int radius, int x, int y) {
		super.x = x;
	}

	public void drawSquare(int x) {
		
		System.out.println("Drawing Green Square [x:" + x  + "]");
	}

	@Override
	public void drawShape() {
		
		drawSquare(x);	
	}
}
