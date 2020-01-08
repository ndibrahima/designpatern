package com.mealproject.dp.builder;

public class Cadeau implements Packing {

	String name;

	public Cadeau() {
		this.name = "Cadeau";
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
