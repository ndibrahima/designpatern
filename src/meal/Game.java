package meal;

import meal.Cadeau;
import meal.Packing;

public abstract class Game implements Item{

	
	@Override
	public Packing packing() {
		return new Plastic();
	}

	@Override
	public abstract float price();
	

	

}
