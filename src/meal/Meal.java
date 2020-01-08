
package meal;

import java.util.ArrayList;
import java.util.List;

import meal.Item;

public class Meal {
	
	float Cost;
	
	public List<Item> getItems() {
		return items;
	}

	@Override
	public String toString() {
		return "Meal [Cost=" + Cost + "]";
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void setCost(float cost) {
		Cost = cost;
	}

	private List<Item> items = new ArrayList<>();
	
	public void addItem(Item item) {
		this.items.add(item);
		this.calculCost();
	}
	
	public void calculCost() {
		float newCost = 0;
		for (Item item: items) {
			newCost += item.price();
		}
		setCost(newCost);
	}
	
	public float getCost() {
		
		float price = 0f;
		
		for(Item item : items) { 
	
			price = item.price()+ price;
		}
		
		return price;
	}
	
	public List<Item> getMeals() {
		return items;
	}
	
	public void showItems() {
		
		for (Item item : items) {
			System.out.println(item);
		}
	}


}
