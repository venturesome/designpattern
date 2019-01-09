package com.venture.some.design.pattern.impl;

import com.venture.some.design.pattern.AccountBook;

public class Boss implements AccountBook {

	private double totalIncome;
    private double totalConsume;
    
	@Override
	public void visit(ConsumeBill bill) {
		totalConsume += bill.getAmount();
	}

	@Override
	public void visit(IncomeBill bill) {
		totalIncome += bill.getAmount();
	}

	public double getTotalIncome() {
        System.out.println("�ϰ�鿴һ��������٣���Ŀ�ǣ�" + totalIncome);
        return totalIncome;
    }

    public double getTotalConsume() {
        System.out.println("�ϰ�鿴һ�����Ѷ��٣���Ŀ�ǣ�" + totalConsume);
        return totalConsume;
    }
}
