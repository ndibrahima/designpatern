package AbstractFactory;

public class Red implements Color{

	public static String RED = "RED";

	@Override
	public void fill() {
		
		System.out.println("Red::fill() method.");

	}
	

}
