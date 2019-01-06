package com.venture.some.design.pattern.main;

public class StatePatternDemo {

	public static void main(String[] args) {
		
		 WaterDispenser dispenser = new WaterDispenser();
	        for (int i = 0; i < 50; ++i) {
	            dispenser.press();
	        }

	}

}
