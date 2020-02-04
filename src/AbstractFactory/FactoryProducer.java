package AbstractFactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String type) {

		if (type.equalsIgnoreCase("SHAPE")) {
			
			return  new ShapeFactory();

		} else if (type.equalsIgnoreCase("COLOR")) {
			
			return new ColorFactory();
		}

		return null;
	}

	
}
