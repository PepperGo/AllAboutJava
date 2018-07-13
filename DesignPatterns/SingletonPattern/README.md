# Singleton Pattern

This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.  


We're going to create a SingleObject class. SingleObject class have its constructor as private and have a static instance of itself.  

SingleObject class provides a static method to get its static instance to outside world. SingletonPatternDemo, our demo class will use SingleObject class to get a SingleObject object.  

![](https://www.tutorialspoint.com/design_pattern/images/singleton_pattern_uml_diagram.jpg)  

* Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the java virtual machine.  

* The singleton class must provide a global access point to get the instance of the class.  

* Singleton pattern is used for logging, drivers objects, caching and thread pool.  

* Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade etc.  

* Singleton design pattern is used in core java classes also, for example java.lang.Runtime, java.awt.Desktop.

## Java Singleton Pattern
To implement Singleton pattern, we have different approaches but all of them have following common concepts.
- Private constructor to restrict instantiation of the class from other classes.
- Private static variable of the same class that is the only instance of the class.
- Public static method that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class.  

## Different approaches of Singleton pattern implementation and design concerns with the implementation.
- Eager initialization
- Static block initialization
- Lazy Initialization
- Thread Safe Singleton
- Bill Pugh Singleton Implementation
- Using Reflection to destroy Singleton Pattern
- Enum Singleton
- Serialization and Singleton




[Design Pattern - Singleton Pattern](https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm)  
  
[Java Singleton Design Pattern Best Practices with Examples](https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples)
