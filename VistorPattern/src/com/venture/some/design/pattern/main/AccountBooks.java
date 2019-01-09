package com.venture.some.design.pattern.main;

import java.util.ArrayList;
import java.util.List;

import com.venture.some.design.pattern.AccountBook;
import com.venture.some.design.pattern.Bill;

public class AccountBooks {

	List<Bill> list =  new ArrayList<Bill>();
	
	public void add(Bill bill) {
		
		list.add(bill);
	}
	
	 public void show(AccountBook viewer){
		 
		 for (Bill bill : list) {
	            bill.accept(viewer);
	        }
	 }
}
