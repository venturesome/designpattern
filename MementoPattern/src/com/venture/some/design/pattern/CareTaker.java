package com.venture.some.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	private List<Memento> lists = new ArrayList<Memento>();
	
	public void addMemento(Memento memento) {
		lists.add(memento);
	}
	
	public Memento getMemento(int index) {
		
		return lists.get(index);
	}
}
