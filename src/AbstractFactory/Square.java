package AbstractFactory;

public class Square implements Shape, Item {

	public static String SQUARE = "SQUARE";
	
	@Override
	public void Draw() {
		
		System.out.println("Square");

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return SQUARE;
	}

}
