## Java - Polymorphism
Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.

Any Java object that can pass more than one IS-A test is considered to be polymorphic. In Java, all Java objects are polymorphic since any object will pass the IS-A test for their own type and for the class Object.

It is important to know that the only possible way to access an object is through a reference variable. A reference variable can be of only one type. **Once declared, the type of a reference variable cannot be changed.**

**The reference variable can be reassigned to other objects provided that it is not declared final.** The type of the reference variable would determine the methods that it can invoke on the object.

A reference variable can refer to any object of its declared type or any subtype of its declared type. A reference variable can be declared as a class or interface type.

```
Deer d = new Deer();
Animal a = d;
Vegetarian v = d;
Object o = d;
```  
All the reference variables d, a, v, o refer to the same Deer object in the heap.  


### Virtual Methods
[Example](https://www.tutorialspoint.com/java/java_polymorphism.htm)  
Here, we instantiate two Salary objects. One using a Salary reference s, and the other using an Employee reference e.

While invoking s.mailCheck(), the compiler sees mailCheck() in the Salary class at compile time, and the JVM invokes mailCheck() in the Salary class at run time.

mailCheck() on e is quite different because e is an Employee reference. When the compiler sees e.mailCheck(), the compiler sees the mailCheck() method in the Employee class.

Here, at compile time, the compiler used mailCheck() in Employee to validate this statement. At run time, however, the JVM invokes mailCheck() in the Salary class.

This behavior is referred to as virtual method invocation, and these methods are referred to as virtual methods. An overridden method is invoked at run time, no matter what data type the reference is that was used in the source code at compile time.

### Reference
1. [Java - Polymorphism - TutorialsPoint](https://www.tutorialspoint.com/java/java_polymorphism.htm)
2. [Polymorphism - The Java™ Tutorials](https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html)
