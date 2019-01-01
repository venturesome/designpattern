package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.Order;
import com.venture.some.design.pattern.Stock;

public class SellStockOder implements Order {

	private Stock stock;
	
	public SellStockOder(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.sell();
	}
}
