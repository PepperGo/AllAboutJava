# Prototype Pattern

Prototype pattern refers to creating duplicate object while keeping performance in mind. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

This pattern involves implementing a prototype interface which tells to create a clone of the current object. This pattern is used when creation of object directly is costly. For example, an object is to be created after a costly database operation. We can cache the object, returns its clone on next request and update the database as and when needed thus reducing database calls.

![](https://www.tutorialspoint.com/design_pattern/images/prototype_pattern_uml_diagram.jpg)    


Prototype design pattern is used when the Object creation is a costly affair and requires a lot of time and resources and you have a similar object already existing.

Prototype pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs. Prototype design pattern uses java cloning to copy the object.



[Design Patterns - Prototype Pattern](https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm)  

[Prototype Design Pattern in Java](https://www.journaldev.com/1440/prototype-design-pattern-in-java)
