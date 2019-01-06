package com.venture.some.design.pattern;

public abstract class Game {

	public final void play() {
		
		ready();
		
		start();
		
		end();
	}

	protected abstract void end();

	protected abstract void start();

	protected abstract void ready();
}
