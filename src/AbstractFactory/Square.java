package AbstractFactory;

public class Square implements Shape {

	public static String SQUARE = "SQUARE";
	
	@Override
	public void Draw() {
		
		System.out.println("Square::draw() method.");

	}

}
