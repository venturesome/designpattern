package com.venture.some.design.pattern.main;

import com.venture.some.design.pattern.AbstractLogger;
import com.venture.some.design.pattern.AbstractLogger.Level;
import com.venture.some.design.pattern.impl.ErrorLogger;

public class LoggerChain {

	public static AbstractLogger loggerChains() {
		
		AbstractLogger errorLogger = new ErrorLogger(Level.ERROR);
		
		AbstractLogger debugLogger = new ErrorLogger(Level.DEBUG);
		debugLogger.setNextLogger(errorLogger);

		AbstractLogger infoLogger = new ErrorLogger(Level.INFO);
		infoLogger.setNextLogger(debugLogger);
		
		return infoLogger;
	}
}
