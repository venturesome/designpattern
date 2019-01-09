package com.venture.some.design.pattern.main;

import com.venture.some.design.pattern.AccountBook;
import com.venture.some.design.pattern.impl.Boss;
import com.venture.some.design.pattern.impl.CPA;
import com.venture.some.design.pattern.impl.ConsumeBill;
import com.venture.some.design.pattern.impl.IncomeBill;

public class VisitorPattern {

	public static void main(String[] args) {

		AccountBooks accountBook = new AccountBooks();
        //添加两条收入
        accountBook.add(new IncomeBill(10000,1));
        accountBook.add(new IncomeBill(12000,2));
        //添加两条支出
        accountBook.add(new ConsumeBill(1000,1));
        accountBook.add(new ConsumeBill(2000,2));

        AccountBook boss = new Boss();
        AccountBook cpa = new CPA();

        //两个访问者分别访问账本
        accountBook.show(cpa);
        accountBook.show(boss);

        ((Boss) boss).getTotalConsume();
        ((Boss) boss).getTotalIncome();
        
        ((CPA) cpa).getTotalConsume();
        ((CPA) cpa).getTotalIncome();
	}

}
