package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.DispenserState;

public class EmptyState implements DispenserState {

	@Override
	public void press() {
		System.out.println("Water is pouring!");
	}
}
