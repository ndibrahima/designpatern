package meal;
import meal.MealBuilder;


public class BuilderPaternDemo {

	public BuilderPaternDemo() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Burger App");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MealBuilder mb = new MealBuilder();
		
		Meal VegMeal = mb.prepareVegMeal().build();
		System.out.println("Veg Meal");
		VegMeal.showItems();
		System.out.println("Total Cost: " + VegMeal.getCost());
		
		Meal nonVegMeal = mb.prepareVegMeal().build();
		System.out.println("\n\nNon-veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
		
		Meal customMeal = mb
				   			.prepareVegMeal()
				   			.addItem(new ChickenBurger())
				   			.build();
		System.out.println("\n\ncustom Meal");
		customMeal.showItems();
		System.out.println("total Cost: " + customMeal.getCost());
		
		Meal myMeal = new Meal();
		mb
		.addItem(new Coke())
		.addItem(new ChickenBurger())
		.addItem(new CarGame());
		
		System.out.println("\n\nMy Meal");
		myMeal.showItems();
		System.out.println("Total Cost: " + myMeal.getCost());
		
		Meal vegHappyMeal = new Meal();
		mb
		.prepareVegHappyMeal()
		.addItem(new DrawGame())
		.addItem(new CarGame());
		
		System.out.println(" Happy Meal");
		vegHappyMeal.showItems();
		System.out.println("Total Cost: " + vegHappyMeal.getCost());
		
		Meal theBigOne = new Meal();
		mb
			.addItem(new ChickenBurger())
			.addItem(new Coke())
			.addItem(new DrawGame());
		System.out.println("\n\nThe Big One");
		theBigOne.showItems();
		System.out.println("Total Cost: " + theBigOne.getCost());
		
			
	}

}
