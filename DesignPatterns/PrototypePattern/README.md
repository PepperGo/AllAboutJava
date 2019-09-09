# Prototype Pattern

Prototype pattern refers to creating duplicate object while keeping performance in mind. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

This pattern involves implementing a prototype interface which tells to create a clone of the current object. This pattern is used when creation of object directly is costly. For example, an object is to be created after a costly database operation. We can cache the object, returns its clone on next request and update the database as and when needed thus reducing database calls.

![](https://www.tutorialspoint.com/design_pattern/images/prototype_pattern_uml_diagram.jpg)    


Prototype design pattern is used when the Object creation is a costly affair and requires a lot of time and resources and you have a similar object already existing.

Prototype pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs. Prototype design pattern uses java cloning to copy the object.



### When to use the Prototype Design Pattern

(1) When a system should be independent of how its products are created, composed, and represented and
(2) When the classes to instantiate are specified at run-time.
For example,
1) By dynamic loading or To avoid building a class hierarchy of factories that parallels the class hierarchy of products or

2) When instances of a class can have one of only a few different combinations of state. It may be more convenient to install a corresponding number of prototypes and clone them rather than instantiating the class manually, each time with the appropriate state.



### Advantages of Prototype Design Pattern

1. Adding and removing products at run-time – Prototypes let you incorporate a new concrete product class into a system simply by registering a prototypical instance with the client. That’s a bit more flexible than other creational patterns, because a client can install and remove prototypes at run-time.  
2. Specifying new objects by varying values – Highly dynamic systems let you define new behavior through object composition by specifying values for an object’s variables and not by defining new classes.    
3. Specifying new objects by varying structure – Many applications build objects from parts and subparts. For convenience, such applications often let you instantiate complex, user-defined structures to use a specific subcircuit again and again.
4. Reduced subclassing – Factory Method often produces a hierarchy of Creator classes that parallels the product class hierarchy. The Prototype pattern lets you clone a prototype instead of asking a factory method to make a new object. Hence you don’t need a Creator class hierarchy at all.


### Disadvantages of Prototype Design Pattern

1. Overkill for a project that uses very few objects and/or does not have an underlying emphasis on the extension of prototype chains.   
2. It also hides concrete product classes from the client     
3. Each subclass of Prototype must implement the clone() operation which may be difficult, when the classes under consideration already exist. Also implementing clone() can be difficult when their internals include objects that don’t support copying or have circular references.  




[Design Patterns - Prototype Pattern](https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm)  

[Prototype Design Pattern - geeksforgeeks](https://www.geeksforgeeks.org/prototype-design-pattern/)   

[Prototype Design Pattern in Java](https://www.journaldev.com/1440/prototype-design-pattern-in-java)

