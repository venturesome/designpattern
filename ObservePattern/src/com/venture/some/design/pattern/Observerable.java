package com.venture.some.design.pattern;

public interface Observerable {

	void registerOberver(Observer observer);
	void removeOberver(Observer observer);
	void notifyOberver(String message);
}
