package meal;

public  class Coke extends ColdDrink {

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 1f;
	}

	public Coke() {
		super("Coke", 1f);
	}
}
