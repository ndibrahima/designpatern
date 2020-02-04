package AbstractFactory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		
		
		// get shape factory
		 AbstractFactory shapeFactory =
		FactoryProducer.getFactory(ShapeFactory.SHAPE);
		 
		// get an object of Shape Circle
		 Shape shape1 = shapeFactory.getShape(Circle.CIRCLE);
	
		// call draw method of Shape Circle
		 shape1.Draw();
		 // get an object of Shape Rectangle
		 Shape shape2 = shapeFactory.getShape(Rectangle.RECTANGLE);
		 // call draw method of Shape Rectangle
		 shape2.Draw();
		 // get an object of Shape Square
		 Shape shape3 = shapeFactory.getShape(Square.SQUARE);
		 // call draw method of Shape Square
		 shape3.Draw();
		 // get color factory
		 AbstractFactory colorFactory =
		FactoryProducer.getFactory(ColorFactory.COLOR);
		 // get an object of Color Red
		 Color color1 = colorFactory.getColor(Red.RED);
		 // call fill method of Red
		 color1.fill();
		 // get an object of Color Green
		 Color color2 = colorFactory.getColor(Green.GREEN);
		 // call fill method of Green
		 color2.fill();
		 // get an object of Color Blue
		 Color color3 = colorFactory.getColor(Blue.BLUE);
		 // call fill method of Color Blue
		 color3.fill();
		 // get an object of Shape Circle
		 Shape myShape =
		FactoryProducer.getFactory(ShapeFactory.SHAPE).getShape(Circle.CIRCLE);
		 // call draw method of Shape Circle
		 myShape.Draw();

	}

}
