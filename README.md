# CS5004-Decorator_Design_Patterns
![img.png](src/images/Header.png)

## **Introduction**

...

## Designing a Base Case

...
add base case diagram here

## Designing Decorations

### **1. Initial Attempt**
add comments here...

![img_1.png](src/images/Initial%20Attempt.png)

add comments here...

### **2. Some Improvements**
add comments here...

![img.png](src/images/img.png)

add comments here...

### **3. Decorator Pattern!!!**
Now we have seen that representing our real estate and decorations with inheritance does not seem to be appropriate.
It introduces problems such as class explosions and rigid designs, or we add many methods to the base class that is
not necessary for some subclasses. Those designs violate SOLID principle.

We will perform the following instead: starting with a real estate and decorate it with the decorations at run time.
For example, if a customer wants to bundle a Townhouse with Floor and Light, we will:

1. Start with a Townhouse object.
2. Decorate it with a Floor object.
3. Decorate it with a Light object.
4. Call the getPrice() method and rely on delegation to add up the decoration cost.

Here is our design diagram:

![img.png](src/images/decorator.png)

## Please add some conceptual explanations here.


