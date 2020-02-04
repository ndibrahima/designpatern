package AbstractFactory;

public  class ShapeFactory extends AbstractFactory{
	
	public static  String SHAPE = "SHAPE";
	
	public Shape getShape(String type)  {
		
		if (type.equalsIgnoreCase("CIRCLE")) {
			
			return new Circle();
			
			
		} else if(type.equalsIgnoreCase("SQUARE")) {
			
			return new Square();
		
			
		} else if (type.equalsIgnoreCase("RECTANGLE")) {
			
			return new Rectangle();
		}
		
		
		
		return null;

}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}


}


