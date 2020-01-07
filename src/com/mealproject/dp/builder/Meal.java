package com.mealproject.dp.builder;

import java.util.ArrayList;
import java.util.List;

import  com.mealproject.dp.builder.Item;

public class Meal {
	

	public Meal () {
		// TODO Auto-generated constructor stub
	}
	
	private List<Item> items = new ArrayList<>();
	
	public void addItem() {
		 

	}
	
	public float getCost() {
		
		float price = 0f;
		
		for(Item item : items) { 
	
			price = item.price()+ price;
		}
		
		return price;
	}
	
	public void showItems() {
		
		for (Item item : items) {
			System.out.println(item);
		}
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Meal build() {
		// TODO Auto-generated method stub
		return null;
	}

}
