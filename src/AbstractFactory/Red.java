package AbstractFactory;

public class Red implements Color, Item{

	public static String RED = "RED";

	@Override
	public void fill() {
		
		System.out.println("Red");

	}

	@Override
	public String getName() {
		
		
		return RED;
	}
	

}
