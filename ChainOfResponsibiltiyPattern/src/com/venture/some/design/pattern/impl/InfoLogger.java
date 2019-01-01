package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.AbstractLogger;

public class InfoLogger extends AbstractLogger {

	public InfoLogger(Level level){
		this.level = level;
	}
	
	@Override
	protected void logger(String message) {
		System.out.println("Info Logger: " + message);
	}
}
