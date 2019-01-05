package com.venture.some.design.pattern;

public class Originator {

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento saveState2Memento() {
		return new Memento(this.state);
	}
	
	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}
}
