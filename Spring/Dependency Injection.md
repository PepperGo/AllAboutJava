## Dependency Injection

### IOC container
The IoC(Inversion Of Control) container is responsible to instantiate, configure and assemble the objects. The IoC container gets informations from the XML file and works accordingly.   

The main tasks performed by IoC container are:  
- to instantiate the application class  
- to configure the object  
- to assemble the dependencies between the objects

There are two types of IoC containers. They are:
- BeanFactory
- ApplicationContext

#### Difference between BeanFactory and the ApplicationContext
The ApplicationContext interface is built on top of the BeanFactory interface.   
It adds some extra functionality than BeanFactory such as simple integration with Spring's AOP, message resource handling (for I18N), event propagation, application layer specific context (e.g. WebApplicationContext) for web application.

### Dependency Injection in Spring  
Dependency Injection (DI) is a design pattern that removes the dependency from the programming code so that it can be easy to manage and test the application. Dependency Injection makes our programming code loosely coupled.   

#### Dependency Lookup
There can be various ways to get the resource for example:  

1. we get the resource(instance of A class) directly by new keyword. 
```
A obj = new AImpl();  
```  
2. we get the resource (instance of A class) by calling the static factory method getA().   
```
A obj = A.getA();  
```  
3. we can get the resource by JNDI (Java Naming Directory Interface) as:  
```
Context ctx = new InitialContext();  
Context environmentCtx = (Context) ctx.lookup("java:comp/env");  
A obj = (A)environmentCtx.lookup("A");  
```  

#### Problems of Dependency Lookup
There are mainly two problems of dependency lookup.
1. tight coupling The dependency lookup approach makes the code tightly coupled. If resource is changed, we need to perform a lot of modification in the code.  

2. Not easy for testing This approach creates a lot of problems while testing the application especially in black box testing.  
#### Dependency Injection  
The Dependency Injection is a design pattern that removes the dependency of the programs. In such case we provide the information from the external source such as XML file. It makes our code loosely coupled and easier for testing.  

#### Two ways to perform Dependency Injection in Spring framework
Spring framework provides two ways to inject dependency  
- [By Constructor](https://www.javatpoint.com/spring-tutorial-dependency-injection-by-constructor)
- [By Setter method](https://www.javatpoint.com/spring-tutorial-dependency-injection-by-setter-method)  

### [SOME EXAMPLES OF CONSTRUCTOR INJECTION](https://www.javatpoint.com/spring-tutorial-dependency-injection-by-constructor) 
Dependent Object, Collection(List, Set, Map)

### [SOME EXAMPLES OF DEPENDENCY INJECTION BY SETTER METHOD](https://www.javatpoint.com/spring-tutorial-dependency-injection-by-setter-method)  
Dependent Object, Collection(List, Set, Map)

### Difference between constructor and setter injection  
There are many key differences between constructor injection and setter injection.  
- Partial dependency: can be injected using setter injection but it is not possible by constructor. Suppose there are 3 properties in a class, having 3 arg constructor and setters methods. In such case, if you want to pass information for only one property, it is possible by setter method only.  

- Overriding: Setter injection overrides the constructor injection. If we use both constructor and setter injection, IOC container will use the setter injection.  

- Changes: We can easily change the value by setter injection. It doesn't create a new bean instance always like constructor. So setter injection is flexible than constructor injection.   

### Autowiring in Spring 
utowiring feature of spring framework enables you to inject the object dependency implicitly. It internally uses setter or constructor injection.

Autowiring can't be used to inject primitive and string values. It works with reference only.  

**Advantage of Autowiring**  
It requires the less code because we don't need to write the code to inject the dependency explicitly.

**Disadvantage of Autowiring**  
No control of programmer.

It can't be used for primitive and string values.  

#### Autowiring Modes
There are many autowiring modes([Example !!!! Don't take it for granted](https://www.javatpoint.com/autowiring-in-spring)):
1)	no - It is the default autowiring mode. It means no autowiring bydefault.
2)	byName - The byName mode injects the object dependency according to name of the bean. In such case, property name and bean name must be same. It internally calls setter method.
3)	byType - The byType mode injects the object dependency according to type. So property name and bean name can be different. It internally calls setter method.
4)	constructor - The constructor mode injects the dependency by calling the constructor of the class. It calls the constructor having large number of parameters.
5)	autodetect - It is deprecated since Spring 3.

### Dependency Injection with Factory Method in Spring
Spring framework provides facility to inject bean using factory method. To do so, we can use two attributes of bean element.  
- factory-method: represents the factory method that will be invoked to inject the bean.  
- factory-bean: represents the reference of the bean by which factory method will be invoked. It is used if factory method is non-static.  
A method that returns instance of a class is called **factory method**.  
```
public class A {  
public static A getA(){//factory method  
    return new A();  
}  
}  
```  

#### Factory Method Types && Exmaples
[Dependency Injection with Factory Method in Spring](https://www.javatpoint.com/dependency-injection-with-factory-method)  


### Reference
1. [IoC Container](https://www.javatpoint.com/ioc-container)  

