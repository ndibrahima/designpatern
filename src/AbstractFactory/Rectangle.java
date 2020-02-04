package AbstractFactory;

public class Rectangle  implements Shape{

	public static String RECTANGLE = "RECTANGLE";

	@Override
	public void Draw() {
		
		System.out.println("Rectangle::draw() method.");
		
	}

}
