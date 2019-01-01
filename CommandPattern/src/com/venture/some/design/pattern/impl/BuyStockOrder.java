package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.Order;
import com.venture.some.design.pattern.Stock;

public class BuyStockOrder implements Order {

	private Stock stock;
	
	public BuyStockOrder(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.buy();
	}

}
