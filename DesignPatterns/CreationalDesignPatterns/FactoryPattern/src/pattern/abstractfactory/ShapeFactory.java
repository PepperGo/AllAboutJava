package pattern.abstractfactory;

import shape.Rectangle;
import shape.Shape;
import shape.Square;

public class ShapeFactory extends AbstractFactory{

    @Override
    Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
