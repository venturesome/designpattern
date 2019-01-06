package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.Game;

public class BasketBallGame extends Game {

	@Override
	protected void end() {
		System.out.println("Basketball Game Finish!");
	}

	@Override
	protected void start() {
		System.out.println("Basketball Game Start!");		
	}

	@Override
	protected void ready() {
		System.out.println("Basketball Game Ready!");		
	}

}
