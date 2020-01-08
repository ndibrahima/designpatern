package com.mealproject.dp.builder;

public class Bottle implements Packing {

	String name;

	public Bottle() {
		this.name = "Bottle";
	}

	public String toString() {
		return getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
