package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.DispenserState;

public class FullState implements DispenserState {

	@Override
	public void press() {
		System.out.println("There is not water poured!");
	}
}
