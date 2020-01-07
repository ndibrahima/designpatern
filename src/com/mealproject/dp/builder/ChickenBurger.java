package com.mealproject.dp.builder;

public class ChickenBurger extends Burger{

	@Override
	public String name() {
		return "Burger poulet";
	}

	@Override
	public Float price() {
		return 800f;
	}
}
