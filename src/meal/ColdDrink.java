package meal;

import meal.Bottle;
import meal.Packing;

public abstract class ColdDrink implements Item {

	private Bottle bottle;
	String name;
	float price;
	Packing packing;

	public ColdDrink(String name, float price) {
		this.name = name;
		this.price = price;
		this.packing = new Bottle();
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
		return ("[name: " + getName() + ", price: " + getPrice() + ", packing: " + getPacking() + "]\n          ");
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
