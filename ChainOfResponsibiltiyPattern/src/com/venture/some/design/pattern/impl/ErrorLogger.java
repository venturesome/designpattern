package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.AbstractLogger;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(Level level){
		this.level = level;
	}
	
	@Override
	protected void logger(String message) {
		System.out.println("Error Logger: " + message);
	}
}
