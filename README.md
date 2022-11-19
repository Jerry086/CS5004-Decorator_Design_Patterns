# CS5004-Decorator_Design_Patterns
![img.png](src/images/Header.png)

## **Introduction**

### Decorator design pattern - Definition and Benefits

#### Definition:

1. The decorator pattern is a structural design pattern that allows behavior to be dynamically added to an individual object, without affecting the behavior or structure of other objects from the same class.
2. In other words, the decorator pattern is designed to add responsibilities to objects without subclassing.
3. The Decorator Pattern uses composition instead of inheritance to extend the functionality of an object at runtime, and it is also known as Wrapper.

#### Benefits:

1. The decorator pattern exploits the composition of classes to gain flexibility at runtime.
2. They can be used to modify existing systems where we wish to add additional features to objects without the need to heavily modify the underlying code using them - Open/Closed Principle
3. The decorator adds its own behavior before and/or after delegating to the object it decorates to do the rest of the job - Single Responsibility Principle
4. Objects can be decorated at any time, so we can decorate objects dynamically at runtime with as many decorators as we like.

## A Real-Life Problem

Welcome to Awesome Real Estate! We are the fastest-growing real estate company located in Vancouver. We help clients buy three types of real estate, condos, townhouses, and houses. When we initially started our company, this was our idea of class design. We created an abstract class RealEstate, and three subclasses to represent the three types of real estate we are selling.


![img.png](src/images/base%20case.png)

As a growing and innovative real estate company, we created our unique Decorating Home Program, which enables us to provide clients with house-decorating services. As we are just beginning our program, the three decoration options we currently provide are light, fridge, and floor.
### Designing Decorations

#### **1. Initial Attempt**
As we add house-decorating services to our business, we need to put each type of decoration and its price in our system. Here’s our first attempt.

![img_1.png](src/images/Initial%20Attempt.png)

For every potential combination of a real estate type and a decoration, a subclass is made. We undoubtedly caused a class explosion with this design.

#### **2. Some Improvements**
How about we add the decoration-related fields and methods in the abstract class that subclasses can inherit?

![img.png](src/images/img.png)

We can still see problems in this design as this design breaks the SOLID principle.
1. Our existing code needs to be altered if we add a new decorating service. This violates the open-closed principle.
2. We use the same abstract class to represent both real estate and decorations. This violates the single-responsibility principle.


#### **3. Decorator Pattern!!!**
Now we have seen that representing our real estate and decorations with inheritance does not seem to be appropriate.
It introduces problems such as class explosions and rigid designs, or we add many methods to the base class that is
not necessary for some subclasses. Those designs violate SOLID principle. It's time to think about altering it to
decorator pattern.

So, how to build a decorator pattern? Let's take a look at a decorator UML class diagram.

![img.png](src/images/decorator%20pattern.png)

Source:https://learning.oreilly.com/library/view/learning-javascript-design/9781449334840/ch09s14.html

1. Decorators have the same supertype as the objects they decorate.
2. Each component can be used on its own or “wrapped” by a component
3. Each decorator “has-a” (wrap) a component, meaning it has an instance variable that holds a reference to a component.

We will perform the following: starting with a real estate and decorate it with the decorations at runtime.
For example, if a customer wants to bundle a Townhouse with Floor and Light, we will:

1. Start with a Townhouse object.
2. Decorate it with a Floor object.
3. Decorate it with a Light object.
4. Call the getPrice() method and rely on delegation to add up the decoration cost.

Here is our design diagram:

![img.png](src/images/decorator.png)

In package decorator, we have three component classes for now: Condo, Townhouse and House.
Each of them has a unique description and price. Note that we are completely flexible to expand
or delete these component classes, without changing the behaviors of other classes. Such property
fulfills our needs as a fast-growing company. Here is a code example of Townhouse class:

````````
package decorator;

/**
 * represents a Townhouse product.
 */
public class Townhouse extends RealEstate {

  /**
   * constructs a Townhouse product.
   */
  public Townhouse(){
    this.description = "Townhouse";
  }

  @Override
  public int getPrice() {
    return 1500000;
  }
}
````````
In addition, we have an abstract decorator class RealEstateDecorator, which not only is a RealEstate,
but also has a RealEstate as a field. There are three concrete decorator classes inherited from it at 
present: Light, Floor and Fridge. None of them is dependent on other classes. Here is a code example of Floor class:

````````
package decorator;

/**
 * represent a real estate with floor decoration.
 */
public class Floor extends RealEstateDecorator {

  /**
   * provides a real estate with floor decoration.
   *
   * @param realEstate a real estate product.
   */
  public Floor(RealEstate realEstate){
    this.realEstate = realEstate;
  }

  @Override
  public String getDescription() {
    return this.realEstate.getDescription() + ", floor";
  }

  @Override
  public int getPrice() {
    return this.realEstate.getPrice() + 10000;
  }
}
````````
The constructor takes in a RealEstate argument and wrap it with itself: the floor. 
The getDescription() method appends a short description of the floor to the description
of the real estate, and the getPrice() method adds its own price to the original price.

Now, everything seems to be set. We are ready to wrap some components dynamically at runtime with decorators.
Let's move to src/decorator/AwesomeRealEstate, which is our driver class. The first client wants to buy 
a house without any decoration, whereas the second and third clients would like to bundle a townhouse or
condo with some kinds of decorations from us. We will create instances according to their requests as follows:

````````
package decorator;

public class AwesomeRealEstate {

  public static void main(String[] args){

    RealEstate house = new House();
    System.out.println(house.getDescription() + ": $" + house.getPrice());

    RealEstate townhouse = new Townhouse();
    townhouse = new Floor(townhouse);
    townhouse = new Light(townhouse);
    System.out.println(townhouse.getDescription() + ": $" + townhouse.getPrice());

    RealEstate condo = new Condo();
    condo = new Fridge(condo);
    condo = new Fridge(condo);
    System.out.println(condo.getDescription() + ": $" + condo.getPrice());
  }

}
````````
It provides us with the descriptions and prices:
````````
House: $2000000
Townhouse, floor, light: $1515000
Condo, fridge, fridge: $806000
````````
Great! We build a framework that fulfills our needs. Our problems are solved and we are looking forward
to extending our business : )




