package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.AccountBook;
import com.venture.some.design.pattern.Bill;

public class ConsumeBill implements Bill {

	private double amount;
	private int type;

	public double getAmount() {
		return amount;
	}

	public ConsumeBill(double amount,int type) {
		super();
		this.amount = amount;
		this.type = type;
	}

	public int getType() {
		return type;
	}

	@Override
	public void accept(AccountBook visitor) {
		
		visitor.visit(this);
	}

}
