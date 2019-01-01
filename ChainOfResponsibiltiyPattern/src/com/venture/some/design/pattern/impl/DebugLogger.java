package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.AbstractLogger;

public class DebugLogger extends AbstractLogger {

	public DebugLogger(Level level){
		this.level = level;
	}
	
	@Override
	protected void logger(String message) {
		System.out.println("Debug Logger: " + message);
	}
}
