package com.mealproject.dp.builder;

public class ChickenBurger extends Burger{

	@Override
	public String name() {
		return "Burger poulet";
	}

	@Override
	public float price() {
		return 800f;
	}
}
