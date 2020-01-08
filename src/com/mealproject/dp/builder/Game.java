package com.mealproject.dp.builder;

import com.mealproject.dp.builder.Packing;
import com.mealproject.dp.builder.Cadeau;

public abstract class Game implements Item{

	
	String name;
	float price;
	Packing packing;

	public Game(String name, float price) {
		this.name = name;
		this.price = price;
		this.packing = new Cadeau();
	}

	public String name() {
		return getName();
	}

	public Packing packing() {
		return getPacking();
	}

	public float price() {
		return getPrice();
	}

	public String toString() {
		return ("[name: " + getName() + ", price: " + getPrice() + " packing: " + getPacking() + "]\n          ");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Packing getPacking() {
		return packing;
	}

	public void setPacking(Packing packing) {
		this.packing = packing;
	}

	

}
