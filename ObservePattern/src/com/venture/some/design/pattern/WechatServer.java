package com.venture.some.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class WechatServer implements Observerable {

	List<Observer> observers = new ArrayList<Observer>();
	
	@Override
	public void registerOberver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeOberver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyOberver(String message) {

		observers.forEach(observer -> {
			observer.update(message);
		});
	}
}
