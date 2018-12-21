package com.venture.some.design.pattern.main;

public class BuilderMealDemo {

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();
		
		//vegmeal
		Meal vegMeal = mealBuilder.prepareVegMeal();
		vegMeal.checkOut();
		
		//ChickenMeal
		Meal chickenMeal = mealBuilder.prepareChickenMeal();
		chickenMeal.checkOut();
	}

}
