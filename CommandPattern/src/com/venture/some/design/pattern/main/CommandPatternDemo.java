package com.venture.some.design.pattern.main;

import com.venture.some.design.pattern.Stock;
import com.venture.some.design.pattern.impl.ABCStock;
import com.venture.some.design.pattern.impl.Broker;
import com.venture.some.design.pattern.impl.BuyStockOrder;
import com.venture.some.design.pattern.impl.CDEStock;
import com.venture.some.design.pattern.impl.SellStockOder;

public class CommandPatternDemo {

	public static void main(String[] args) {
		
		Stock abcStock = new ABCStock();
		BuyStockOrder buyABCStockOrder = new BuyStockOrder(abcStock);
		SellStockOder sellABCStockOrder = new SellStockOder(abcStock);
		Stock cdeStock = new CDEStock();
		BuyStockOrder buyCDEStockOrder = new BuyStockOrder(cdeStock);
		SellStockOder sellCDEStockOrder = new SellStockOder(cdeStock);
		
		Broker broker = new Broker();
		broker.addOrder(buyABCStockOrder);
		broker.addOrder(sellABCStockOrder);
		broker.addOrder(buyCDEStockOrder);
		broker.addOrder(sellCDEStockOrder);
		broker.placeOrders();

	}

}
