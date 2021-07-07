package AbstractFactory;

public  class ColorFactory extends AbstractFactory{
	
	public static  String COLOR = "COLOR";

	
	public Color getColor(String type)  {
		
		if (type.equalsIgnoreCase("RED")) {
			
			return new Red();
			
			
		} else if(type.equalsIgnoreCase("GREEN")) {
			
			return new Green();
		
			
		} else if (type.equalsIgnoreCase("BLUE")) {
			
			return new Blue();
		}
		
		
		
		return null;

}


	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
