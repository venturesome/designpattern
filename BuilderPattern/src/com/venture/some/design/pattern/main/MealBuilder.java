package com.venture.some.design.pattern.main;

import com.venture.some.design.pattern.impl.ChickenBurger;
import com.venture.some.design.pattern.impl.Coke;
import com.venture.some.design.pattern.impl.Pepsi;
import com.venture.some.design.pattern.impl.VegBurger;

public class MealBuilder {

	public Meal prepareVegMeal() {
		
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		
		return meal;
	}
	
	public Meal prepareChickenMeal() {
		
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		
		return meal;
	}
}
