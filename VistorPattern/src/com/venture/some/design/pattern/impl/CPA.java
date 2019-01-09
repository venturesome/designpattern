package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.AccountBook;

public class CPA implements AccountBook {

	private double totalIncome;
    private double totalConsume;
    
	@Override
	public void visit(ConsumeBill bill) {
		totalConsume += bill.getAmount();
	}

	@Override
	public void visit(IncomeBill bill) {
		if(bill.getType() == 1) {
			totalIncome += bill.getAmount();
		}
	}

	public double getTotalIncome() {
        System.out.println("CPA查看一共收入多少，数目是：" + totalIncome);
        return totalIncome;
    }

    public double getTotalConsume() {
        System.out.println("CPA查看一共花费多少，数目是：" + totalConsume);
        return totalConsume;
    }
}
