package com.mealproject.dp.builder;

public class CarGame extends Game{
	

	@Override
	public String name() {
		return "Car Game";
	}

	@Override
	public float price() {
		return 1f;
	}

	public CarGame() {
		super("Car Game", 550.5f);
	}
}
