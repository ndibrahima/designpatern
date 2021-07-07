package AbstractFactory;

public class Rectangle  implements Shape, Item{

	public static String RECTANGLE = "RECTANGLE";

	@Override
	public void Draw() {
		
		System.out.println("Rectangle ");
		
	}

	@Override
	public String getName() {
		
		return RECTANGLE;
	}

}
