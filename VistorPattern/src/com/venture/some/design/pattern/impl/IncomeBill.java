package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.AccountBook;
import com.venture.some.design.pattern.Bill;

public class IncomeBill implements Bill {

	private double amount;
	private int type;

	public IncomeBill(double amount, int type) {
		super();
		this.amount = amount;
		this.type = type;
	}

	public int getType() {
		return type;
	}
	
	public double getAmount() {
		return amount;
	}
	
	@Override
	public void accept(AccountBook visitor) {
		
		visitor.visit(this);
	}

}
