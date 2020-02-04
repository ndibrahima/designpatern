package AbstractFactory;

public class Blue implements Color, Item{

	public static String BLUE = "BLUE";

	@Override
	public void fill() {
		
		System.out.println("Blue ");

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return BLUE;
	}

}
