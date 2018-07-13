# Spring
[Spring Framework](https://docs.spring.io/spring/docs/current/spring-framework-reference/index.html)

### Inversion Of Control (IOC)
The **IOC container** will create the objects, wire them together, configure them, and manage their complete life cycle from creation till destruction.   
The Spring container uses **DI** to manage the components that make up an application.  
These objects are called **Spring Beans**.  
The container gets its instructions on what objects to instantiate, configure, and assemble by reading the **configuration metadata provided**. The configuration metadata can be represented either by **XML, Java annotations, or Java code**.    

Spring provides the following two distinct types of containers:
- [Spring BeanFactory Container](https://www.tutorialspoint.com/spring/spring_beanfactory_container.htm)
- [Spring ApplicationContext Container](https://www.tutorialspoint.com/spring/spring_applicationcontext_container.htm)   

[Why is Inversion of Control named that way?](https://softwareengineering.stackexchange.com/questions/205681/why-is-inversion-of-control-named-that-way)

### Dependency Injection
Remove Dependency, make the code easier to test and maintain. There is dependency between the Employee and Address (tight coupling)
```
class Employee {
 Address address;
 Employee() {
  address = new Address();
 }
}

```   

In the Inversion of Control scenario, IOC makes the code loosely coupled. In such case, there is no need to modify the code if our logic is moved to new environment.  
```
class Employee {
 Address address;
 Employee(Address address) {
  this.address = address;
 }
}
```  
In Spring framework, IOC container is responsible to inject the dependency. We provide metadata to the IOC container either by XML file or annotation.

Advantage of Dependency Injection
- makes the code loosely coupled so easy to maintain
- makes the code easy to test

### Spring Modules  
The Spring framework comprises of many modules such as core, beans, context, expression language, AOP, Aspects, Instrumentation, JDBC, ORM, OXM, JMS, Transaction, Web, Servlet, Struts etc. These modules are grouped into Test, Core Container, AOP, Aspects, Instrumentation, Data Access / Integration, Web (MVC / Remoting) as displayed in the following diagram.

![](https://www.javatpoint.com/images/sp/spmodules.jpg)


## Reference
1. [Spring Official Guides](https://spring.io/guides)  
2. [Spring Tutorial - tutorialspoint](https://www.tutorialspoint.com/spring/)  
3. [Spring Tutorial - javatpoint](https://www.javatpoint.com/spring-tutorial)
