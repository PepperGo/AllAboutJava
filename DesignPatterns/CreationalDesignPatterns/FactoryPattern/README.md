# Factory Pattern
In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.    
![](https://www.tutorialspoint.com/design_pattern/images/factory_pattern_uml_diagram.jpg)
  
Factory design pattern is used when we have a super class with multiple sub-classes and based on input, we need to return one of the sub-class.   
This pattern take out the responsibility of instantiation of a class from client program to the factory class.   
We can apply Singleton pattern on Factory class or make the factory method static.

### Factory Design Pattern Advantages  
1. Factory design pattern provides approach to code for interface rather than implementation.  
2. Factory pattern removes the instantiation of actual implementation classes from client code. Factory pattern makes our code more robust, less coupled and easy to extend. For example, we can easily change PC class implementation because client program is unaware of this.  
3. Factory pattern provides abstraction between implementation and client classes through inheritance.  


### Factory Design Pattern Examples in JDK
1. java.util.Calendar, ResourceBundle and NumberFormat getInstance() methods uses Factory pattern.  
2. valueOf() method in wrapper classes like Boolean, Integer etc.  


[Design Pattern - Factory Pattern](https://www.tutorialspoint.com/design_pattern/factory_pattern.htm)  

[Factory Design Pattern in Java](https://www.journaldev.com/1392/factory-design-pattern-in-java)  



# Abstract Factory Pattern
Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called as factory of factories. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.
![](https://www.tutorialspoint.com/design_pattern/images/abstractfactory_pattern_uml_diagram.jpg)  

### Abstract Factory Design Pattern Banefits
1. Abstract Factory design pattern provides approach to code for interface rather than implementation.
2. Abstract Factory pattern is “factory of factories” and can be easily extended to accommodate more products, for example we can add another sub-class Laptop and a factory LaptopFactory.
3. Abstract Factory pattern is robust and avoid conditional logic of Factory pattern. 
  
  
### Abstract Factory Design Pattern Examples in JDK
1. javax.xml.parsers.DocumentBuilderFactory#newInstance()
2. javax.xml.transform.TransformerFactory#newInstance()
3. javax.xml.xpath.XPathFactory#newInstance()

[Abstract Factory Pattern](https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm)  
  
[Abstract Factory Design Pattern in Java](https://www.journaldev.com/1418/abstract-factory-design-pattern-in-java)
