package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.Observer;

public class User implements Observer {

	private String name;
	
	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		System.out.println(name + " received " + message);
	}

}
