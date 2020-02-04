package AbstractFactory;

public class Green implements Color , Item{

	public static String GREEN = "GREEN";

	@Override
	public void fill() {
		
		System.out.println("Green ");
	
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		
		return GREEN;
	}

}
