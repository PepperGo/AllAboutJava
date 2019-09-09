package pattern.abstractfactory;

import shape.Shape;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory roundedFactory = FactoryProducer.getRoundedFactory(true);

        Shape roundedRectangle = roundedFactory.getShape("RECTANGLE");
        roundedRectangle.draw();

        Shape roundedSquare = roundedFactory.getShape("SQUARE");
        roundedSquare.draw();

        AbstractFactory standardFactory = FactoryProducer.getRoundedFactory(false);

        Shape rectangle = standardFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = standardFactory.getShape("SQUARE");
        square.draw();

    }
}
