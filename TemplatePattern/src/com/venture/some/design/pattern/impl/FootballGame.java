package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.Game;

public class FootballGame extends Game {

	@Override
	protected void end() {
		System.out.println("Football Game Finish!");
	}

	@Override
	protected void start() {
		System.out.println("Football Game Start!");		
	}

	@Override
	protected void ready() {
		System.out.println("Football Game Ready!");		
	}

}
