package com.venture.some.design.pattern.main;

import java.util.ArrayList;
import java.util.List;

import com.venture.some.design.pattern.Item;

public class Meal {

	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public double getCost() {
		double cost = 0d;
		
		if(items!=null && items.size()>0) {
			
			cost = items.stream().mapToDouble(item->item.Price()).sum();
		}
		
		return cost;
	}
	
	public void showItems() {
		
		if(items!=null && items.size()>0) {
			items.forEach(item -> {
				System.out.print("Item:"+item.Name());
				System.out.print(",Packing :"+item.packing().pack());
				System.out.println(",Price:"+item.Price());
			});
		}
	}
	
	public void checkOut() {
		
		showItems();
		System.out.println("Total:"+getCost());
	}
}
