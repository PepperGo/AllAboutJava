# Builder Pattern
Builder pattern builds a complex object using simple objects and using a step by step approach. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.  

A Builder class builds the final object step by step. This builder is independent of other objects.  
![](https://www.tutorialspoint.com/design_pattern/images/builder_pattern_uml_diagram.jpg)

Builder pattern was introduced to solve some of the problems with Factory and Abstract Factory design patterns when the Object contains a lot of attributes.  

There are **three major issues** with **Factory and Abstract Factory** design patterns when the Object contains a lot of attributes.  
- Too Many arguments to pass from client program to the Factory class that can be error prone because most of the time, the type of arguments are same and from client side its hard to maintain the order of the argument.  
- Some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters and optional parameters need to send as NULL.  
- If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes that is confusing.  

We can solve the issues with large number of parameters by providing a constructor with required parameters and then different setter methods to set the optional parameters. The problem with this approach is that the Object state will be inconsistent until unless all the attributes are set explicitly.  

Builder pattern solves the issue with large number of optional parameters and inconsistent state by providing a way to build the object step-by-step and provide a method that will actually return the final Object.  

  
### Builder Design Pattern in Java
1. First of all you need to create a static nested class and then copy all the arguments from the outer class to the Builder class. We should follow the naming convention and if the class name is Computer then builder class should be named as ComputerBuilder.  

2. Java Builder class should have a public constructor with all the required attributes as parameters.  

3. Java Builder class should have methods to set the optional parameters and it should return the same Builder object after setting the optional attribute.  
4. The final step is to provide a build() method in the builder class that will return the Object needed by client program. For this we need to have a private constructor in the Class with Builder class as argument.


[Design Patterns - Builder Pattern](https://www.tutorialspoint.com/design_pattern/builder_pattern.htm)  

[Builder Design Pattern in Java](https://www.journaldev.com/1425/builder-design-pattern-in-java)  


### Advantages of Builder Design Pattern

1. The parameters to the constructor are reduced and are provided in highly readable method calls.
2. Builder design pattern also helps in minimizing the number of parameters in constructor and thus there is no need to pass in null for optional parameters to the constructor.
3. Object is always instantiated in a complete state
4. Immutable objects can be build without much complex logic in object building process.

### Disadvantages of Builder Design Pattern

1. The number of lines of code increase at least to double in builder pattern, but the effort pays off in terms of design flexibility and much more readable code.
2. Requires creating a separate ConcreteBuilder for each different type of Product.
