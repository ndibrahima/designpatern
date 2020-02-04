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

	public static Item getItem(String type) {
		
		Item item = (Item) new ShapeFactory().getShape(type);
		
		if (item == null) {
			item = (Item) new ColorFactory().getColor(type);
		}
			return item;
		}

	
	}

	

