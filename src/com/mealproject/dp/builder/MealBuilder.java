package com.mealproject.dp.builder;

import com.mealproject.dp.builder.Meal;
import com.mealproject.dp.builder.DrawGame;
import com.mealproject.dp.builder.Pepsi;
import com.mealproject.dp.builder.VegBurger;
import com.mealproject.dp.builder.Coke;
import com.mealproject.dp.builder.ChickenBurger;



public class MealBuilder {
    
	float Cost;
	Meal meal;
	
	public MealBuilder() {
		meal = new Meal();
	}
	
	public MealBuilder prepareVegMeal() {
		meal.addItem(new VegBurger());
		meal.addItem(new Pepsi());
		return this;
	}


	public Meal build() {
		Meal ancienMeal = getMeal();
		this.meal = new Meal();
		return ancienMeal;
	}
	
	public MealBuilder prepareNonVegMeal() {
		meal.addItem(new ChickenBurger());
		meal.addItem(new Coke());
		return this;
	}

	public MealBuilder prepareVegHappyMeal() {
		meal.addItem(new VegBurger());
		meal.addItem(new Pepsi());
		meal.addItem(new CarGame());
		return this;
	}

	public MealBuilder prepareNonVegHappyMeal() {
		meal.addItem(new ChickenBurger());
		meal.addItem(new Coke());
		meal.addItem(new DrawGame());
		return this;
	}

	public MealBuilder addItem(Item item) {
		meal.addItem(item);
		return this;
	}
	
	public String toString() {
		return this.meal.toString();
	}

	public Meal getMeal() {
		return meal;
	}

}
