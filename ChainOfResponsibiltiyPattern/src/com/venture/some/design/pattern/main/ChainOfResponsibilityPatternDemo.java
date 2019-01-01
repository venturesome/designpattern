package com.venture.some.design.pattern.main;

import com.venture.some.design.pattern.AbstractLogger;
import com.venture.some.design.pattern.AbstractLogger.Level;

public class ChainOfResponsibilityPatternDemo {

	public static void main(String[] args) {
		
		AbstractLogger loggerChain = LoggerChain.loggerChains();
		
		loggerChain.logger(Level.INFO, "Hello Info");
		loggerChain.logger(Level.DEBUG, "Hello Debug");
		loggerChain.logger(Level.ERROR, "Hello Error");
	}

}
