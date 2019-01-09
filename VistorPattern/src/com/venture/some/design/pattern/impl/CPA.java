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
        System.out.println("CPA�鿴һ��������٣���Ŀ�ǣ�" + totalIncome);
        return totalIncome;
    }

    public double getTotalConsume() {
        System.out.println("CPA�鿴һ�����Ѷ��٣���Ŀ�ǣ�" + totalConsume);
        return totalConsume;
    }
}
