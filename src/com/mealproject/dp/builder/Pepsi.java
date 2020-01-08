package com.mealproject.dp.builder;

public  class Pepsi extends ColdDrink {

	public Pepsi() {
		super("Pepsi", 1f);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 3f;
	}

}
