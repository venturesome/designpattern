package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.Stock;

public class CDEStock implements Stock {

	private String name = "CDE";
	private int quantity = 15;

	@Override
	public void buy(){
	System.out.println("Stock [ Name: "+name+",	Quantity: " + quantity +" ] bought");
	}

	@Override
	public void sell(){
	System.out.println("Stock [ Name: "+name+",	Quantity: " + quantity +" ] sold");
	}
}
