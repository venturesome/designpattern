package com.venture.some.design.pattern;

public abstract class AbstractLogger {

	public enum Level {
		INFO(1), DEBUG(2), ERROR(3);

		private int level;

		private Level(int level) {
			this.level = level;
		}

		public int getLevel() {
			return level;
		}
	}

	protected AbstractLogger nextLogger;
	protected Level level;

	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}

	public void logger(Level level, String message) {

		if (level.getLevel() >= this.level.getLevel()) {
			logger(message);
		}

		if (null != nextLogger) {
			nextLogger.logger(level, message);
		}
	}

	protected abstract void logger(String message);
}
