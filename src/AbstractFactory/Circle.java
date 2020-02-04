package AbstractFactory;

public class Circle  implements Shape, Item {

	public static String CIRCLE = "CIRCLE";

	@Override
	public void Draw() {
		
		System.out.println("Circle ");

		
	}

	@Override
	public String getName() {
			
		return CIRCLE;
	}

}
