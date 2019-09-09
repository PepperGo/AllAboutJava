package pattern.abstractfactory;

import shape.Shape;

public abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);
}
