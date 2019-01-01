package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.Stock;

public class ABCStock implements Stock {

	private String name = "ABC";
	private int quantity = 10;

	@Override
	public void buy(){
	System.out.println("Stock [ Name: "+name+",	Quantity: " + quantity +" ] bought");
	}

	@Override
	public void sell(){
	System.out.println("Stock [ Name: "+name+",	Quantity: " + quantity +" ] sold");
	}
}
