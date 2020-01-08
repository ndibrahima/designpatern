package com.mealproject.dp.builder;

public  class DrawGame extends Game {


	@Override
	public String name() {
		return "Draw Game";
	}

	@Override
	public float price() {
		return 1f;
	}

	public DrawGame() {
		super("name", 1f);
		
	}

}
