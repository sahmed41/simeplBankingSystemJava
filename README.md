# Project 
This is a simple banking application that is developed to demonstrate my ability to understand OOP cocnepts and SOLID design principles. It does not represent any banking systems in the reald world. 

# OOP Concepts
Object Oriented Programming (OOP) is a programming paradigm in which problems are modelled as real world objects. Following sections explain how different aspects of the OOP are implemented to this project.

## Classes and Objects
In OOP aspects of the projgrams such as Users are modeled as objects and classes are blue prints for creating objects which contains the information on what properties (attributes) and behaviours (methods) objects possess. Following are some classes of this project:
* User
* Customer
* Employee
* Account

![A picture of a class](https://github.com/sahmed41/simeplBankingSystemJava/blob/master/Screenshots/Class.PNG?raw=true)

## Attributes 
Attributes are the properties of an object. For instance, fname (first name) is an attribute of the Customer class and its objects.

![A picture of a attributes](https://github.com/sahmed41/simeplBankingSystemJava/blob/master/Screenshots/Attributes.PNG?raw=true)

## Methods
Methods are the behaviours of an object. For instance, balance check is an attribute of the Account class and its objects.

![A picture of a method](https://github.com/sahmed41/simeplBankingSystemJava/blob/master/Screenshots/Methods.PNG?raw=true)

## Constructuors
Constructors are methods that are invoked once a class is intentiated. Most classes of this project has a constructor.
Picture of constructor of theUser class

![A picture of a constructor](https://github.com/sahmed41/simeplBankingSystemJava/blob/master/Screenshots/Constructor.PNG?raw=true)

## Modifiers
Modifiers or access modifiers determines the access to a class, property or a method. They can be achieved using modifiers keywords such as public and private. 

![A picture of a constructor](https://github.com/sahmed41/simeplBankingSystemJava/blob/master/Screenshots/Modifier.PNG?raw=true)

## Inheritence
Inheritence denotes to one class inheriting properties and behaviours from another class. In other words, classes can have parent child relationship and child classes inherits properties and methods from parent class. 
In this project **Custoemr**  class and **Employee** class inherits from the **User** class.

![A picture of Inheritence parent class](https://github.com/sahmed41/simeplBankingSystemJava/blob/master/Screenshots/Inheritence_1.PNG?raw=true)
![A picture of Inheritence child class 1](https://github.com/sahmed41/simeplBankingSystemJava/blob/master/Screenshots/Inheritence_2.PNG?raw=true)
![A picture of Inheritence child class 2](https://github.com/sahmed41/simeplBankingSystemJava/blob/master/Screenshots/Inheritence_3.PNG?raw=true)

## Polymorphism
In simple terms, polymorhpism is the ability to make the inherited methods perform different actions in the child class than the parent class. This project does not contain 100% polymorphism. However, there is something close to polymorphism which is the **Employee** class implementing the methods from **IemployeeUser** interface. There are other similar examples as well.

![A picture of Polymorphism 1](https://github.com/sahmed41/simeplBankingSystemJava/blob/master/Screenshots/Polymorphism_1.PNG?raw=true)
![A picture of Polymorphism 2](https://github.com/sahmed41/simeplBankingSystemJava/blob/master/Screenshots/Polymorphism_2.PNG?raw=true)


## Abstraction
Data abstraction is the process of abstracting the details from the user.
Abstraction was achieved in this project by the use of abstract classes or interfaces.
**User** class is an abstract class of **Employee** and **Custoemr** class. Similarly, some methods of the **Employee** class is hidden away in the **IEmployeeUser** interface as well.

![A picture of Abstraction 1](https://github.com/sahmed41/simeplBankingSystemJava/blob/master/Screenshots/Abstraction_1.PNG?raw=true)
![A picture of Abstraction 2](https://github.com/sahmed41/simeplBankingSystemJava/blob/master/Screenshots/Abstraction_2.PNG?raw=true)
![A picture of Abstraction 3](https://github.com/sahmed41/simeplBankingSystemJava/blob/master/Screenshots/Abstraction_3.PNG?raw=true)


## Encapsulation
Encapsulation the act of hiding or cotrolling access to certain properties. This can be achieved by making some properties private and controlling access to them with getters and setters. Most attributes of the classes of thsi project and given access to useing getter and setter methods.

![A picture of Encapsulation 1](https://github.com/sahmed41/simeplBankingSystemJava/blob/master/Screenshots/Encapsulation_1.PNG?raw=true)
![A picture of Encapsulation 2](https://github.com/sahmed41/simeplBankingSystemJava/blob/master/Screenshots/Encapsulation_2.PNG?raw=true)
![A picture of Encapsulation 3](https://github.com/sahmed41/simeplBankingSystemJava/blob/master/Screenshots/Encapsulation_3.PNG?raw=true)

# Data Structures
In simple terms, data structures hold data. Java provides several of such types. This project have utilised a type called HashMaps.

![A picture of Datastructure](https://github.com/sahmed41/simeplBankingSystemJava/blob/master/Screenshots/Data%20Structure%20-%20Hashmap.PNG?raw=true)

# SOLID Design Principles

SOLID is an achronym. It provides standards on how to design the application. In other words, it has instructions on how to code. Following are the standards of the SOLID principle. 

## Single Responsibility
Each class should have single purpose and not be filled with excessive function. Every class in this projects serves one purpose. For instance, the **User** class utilises only user related properties and methods.

## Open Closed
Classes should be closed for modification but open for extension. In other words, you shouldn’t have to rewrite classes to add new features. 

**Output** class of the project only prints the information given to it. It contains two methods: one prints the information as JSON and tho other prints the information as CSV. They both take a Hash map s input. For instance, the **Employee** class have methods that returns a hash maps which can be passed to **Output** class's methods and if a new different method retruns a hashmap that can also be converted to JSON or CSV using existing **Output** methods with no modification.

![A picture of Open Close Principle](https://github.com/sahmed41/simeplBankingSystemJava/blob/master/Screenshots/Open%20Close%20Principal.PNG?raw=true)

## Liskov Substitution

Every chicld class should be able to be substituted for its parent class. In other words, a child class should have all of its parent class’s functions.

**Customer** is child class of the **User**. They are both substitutable. 


## Interface Segregation

Interfaces should not force implementing classes to implement something they cannot and large classes should be seperated to different interfaces. 

There is **User** class and **IEmployeeUser** interface.
**Employee** and **Customer** are child classes of the **User**. Even though there are some additional methods in the **Employee**, **User** class does not force them on **Customer**. Instead those methods moved to an interface called **IEmployeeUser**. Simly, a large interface is broken into an abstract class called **User** and an interface called **IEmployeeUser**.

![A picture of Inerface Segretation 1](https://github.com/sahmed41/simeplBankingSystemJava/blob/master/Screenshots/Inheritence_1.PNG?raw=true)
![A picture of Inerface Segretation 2](https://github.com/sahmed41/simeplBankingSystemJava/blob/master/Screenshots/Inheritence_2.PNG?raw=true)
![A picture of Inerface Segretation 3](https://github.com/sahmed41/simeplBankingSystemJava/blob/master/Screenshots/Inheritence_3.PNG?raw=true)
![A picture of Inerface Segretation 4](https://github.com/sahmed41/simeplBankingSystemJava/blob/master/Screenshots/Polymorphism_1.PNG?raw=true)


## Dependency Inversion Principal (DIP)
Components should depend on abstractions and not concretions. In other words, implement objects to interfaces rather than classes. For instance, **Account** class implements **IAccount** interface and **Account** objects aer created from the interface itself.

![A picture of DIP](https://github.com/sahmed41/simeplBankingSystemJava/blob/master/Screenshots/DIP.PNG?raw=true)



