QAMP (OOP) - HOMEWORK 1

Create your own class! 
The class must have following elements: 
- minimum 3 attributes of different types (max. 4) 
- 2 constructors 
- getters and setters for each attribute 
- 2 methods 
- create a small Main class with main method to demonstrate your class

————————————————————————————————

Create a class to represent the geometric shape Rectangle. The
Rectangle has 2 sides called a and b (of type double). 
 
The Rectangle class must have getters and setters for both sides.

The class has 3 methods:

•getCircumference() - return the circumference of the Rectangle (2 x a
+ 2 x b)

•getAera() - returns the area of the Rectangle (a x b)

•isSquare() - returns true if the Rectangle is a square, false otherwise
(a square is Rectangle with identical sides)

Create a small Main class with main method to demonstrate all
methods.

————————————————————————————————

Create a class Complex to represent complex numbers. Complex
numbers have two parts: real part and imaginary part and are typically
represented as z = a + b*i where:

z is the Complex number 
a is the real part of the complex number 
b is the imaginary part 
i is the imaginary unit, i2 = -1
The class should have 2 attributes representing the Real and
Imaginary part and should be of type int.

The class should have 2 constructors:
•Without parameters, creating the Complex number 0 (being 0 + 0*i) -
meaning both parts are 0

•With 2 parameters, setting both attributes to the respective values
thus creating the number (a + b*i)

The class has 5 methods:

int Re() - returns the real part

int Im() - returns the imaginary part

Complex add(Complex z1) - adds 2 complex numbers and returns a
NEW Complex of the result - addition in Complex numbers means that
both Real and Imaginary part are added separately

Complex subtract(Complex z1) - subtracts 2 complex numbers and
returns a NEW Complex of the result- subtraction in Complex numbers
means that both Real and Imaginary part are subtracted separately

void printComplex() - prints the Complex number in the form a + bi

If (a ≠ 0 and b = 0) -> print is only a
If (a = 0 and b ≠ 0) -> print is only bi

If (a = 0 and b = 0) -> print is 0

If (a ≠ 0 and b ≠ 0) -> print is a + bi
Create a main method to test your program similar to the example!

Example:

Complex z = new Complex(2,-3)
System.out.println(z.Re()) -> 2
System.out.println(z.Im()) -> -3
Complex z1 = new Complex(2,1)
Complex z2 = z.add(z1)
z2.printComplex() -> 4 - 2i
Complex z3 = z.subtract(z1)
z3.printComplex() -> - 4i





QAMP (OOP) - HOMEWORK 3

Create a Person.class.

The Person class has one attribute:

-name (String)

The class should have one constructor to set the required attributes.

The class should have the toString() method implemented, returning:

name: {name}

Create an Employee.class. Employee inherits Person and in addition to having a name, every
Employee has:

- annual salary (double)

- National insurance number (String)

Employee.class should have a constructor setting all it’s attributes.

Employee should have toString() implemented as well, returning:

name: {name}, salary: {salary}, insurance number: {insurance number}

———————————————————————————————————————————

1. Create a class Vehicle.

Every vehicle has following attributes:

- speed (double)

- model (String)

It has 1 constructor accepting model, setting the attribute and speed to 0.0.

It has 3 methods:

accelerate(double) - increasing the speed by the provided parameter

decelerate(double) - reducing the speed by the provided number, or setting it to 0 if the difference
would be negative

toString() - returning: vehicle: {model}, speed: {speed}

2. Create the class Engine.

Constructor accepts one argument setting the capacity.

Engine has 1 attribute:

- capacity (double)

Methods:

increaseCapacity(double) - increasing the capacity by the provided value

decreaseCapacity(double) - decreasing the capacity by the provided value

toString() - returning: capacity: {capacity}

3. Create the classes DieselEngine and ElectricEngine which both inherit Engine

An Electric engine brakes recuperative, meaning it uses the braking force to charge the battery.
Implement a brake(double) method in a way that it increases the battery capacity like:

0.1 * brake speed
4. Create two classes Car and ElectricCar which both inherit Vehicle.

In addition to the Vehicle attributes, every Car/ElectricCar has an Engine.

Car/ElectricCar class contractor accepts two attributes:

-model - setting the model

-capacity - setting the engine capacity

Car has always a DieselEngine and ElectricCar always an ElectricEngine of provided capacity.

Override the methods: accelerate(), decelerate() in the following way:

4.1. Car.class:

accelerate(double speed) - consumes 0.2. * speed amount of capacity/fuel

If the car does not have enough fuel, the method will not accelerate the car

4.2 ElectricCar.class

accelerate(double speed) - consumes 0.4. * speed amount of capacity/fuel

If the car does not have enough fuel, the method will not accelerate the car

decelerate(double speed) - will charge the engine capacity by the amount the car has reduced it’s
speed times (*) the factor 0.1

Both Car/ElectricCar class override toString returning:

vehicle: {model}, speed: {speed}, capacity: {capacity}

Important:
1. Pay attention to return types of methods. Use types that best fit the mentioned use
   cases. There are a couple of checks required by how much a car will accelerate or
   decelerate so help yourself and don’t make everything void.
2. Implement any additional helper methods you might find useful. I.e. particular getters or
   getterLike methods.
   There are a couple that could be useful to perform certain checks.
3. Ideally Car/ElectricCar do not know about the details of their Engines, so think about how
   you use the factors.




HOMEWORK 4.

Create the interfaces Flight and Swim.

The Flight interface has 1 method:

String fly();

The Swim interface has also 1 method:

String swim();

Create following 5 classes:

Fish implementing Swim — the swim method should return “Swims under water”

Plane implementing Flight — the fly method should return “Flies with engine”

Duck implementing Swim and Flight — the swim method should return “Kinda floats”

                                                           — the fly method returns “Flies with wings”

Pegasus implementing Flight — the fly method should return “Flies with wings”

Submarine implementing Swim — the swim method should return “Swims under water”

Create a Main class which will test your code.

-   Create an object for each of these 5 classes.

- The class is supposed to have 2 Lists: 
	An ArrayList containing things that can fly 
	A LinkedList of things that can swim

- Loop through both lists and print the output of fly and swim methods of all the objects in these
  lists.

NOTE: Implementing multiple interfaces is done by separating the Interface names that we
want to implement with a comma. A implements B, C ...
———————————————————————————————————————————

Create the abstract class Shape.

The Shape has 1 attribute: colour (String)

Every shape can return it’s area and circumference, both returning double.

Create 3 classes:

Circle, Square and Rectangle. All of these are colourful shapes.

1. Circle:

Has 1 attribute:

radius (double)

Area = radius2 x PI
Circumference = 2 x radius x PI
2. Square
   Has 1 attribute:
   side (double)
   Area = side x side
   Circumference = 4 x side
3. Rectangle
   Has 2 Attributes:
   a (double)
   b (double)
   Area = a x b
   Circumference = 2 x a + 2 x b

It should be possible to call toString() for either Square, Circle or Rectangle and the output should
always be:

“colour: {colour}, area: {the area}, circumference: {the circumference}”

Create a Main class to test your code.

Create an object of each shape, and put them into a Shape List.

Iterate through the list, and print the output of toString() for each of them.

NOTES:
1. Abstract classes can have constructors just like normal classes.
2. For calculating PI use Math.PI
3. Regarding the toString() part: BE SMART, THINK




HOMEWORK 5.


SavingAccounts only)

Owner:
First name String

Last name String

Address String

Has a constructor with all 3 attributes.

Main Class:
Write a main class to demonstrate the behaviour of ATM. The main method should handle
all the exceptions. Handling of exceptions should be done by simply printing the Exception
message.

——BONUS——:
Rewrite the Main class, such that it contains a fixed number of accounts.

Create a Scanner object which will receive user input.

Create an infinite loop which will repeatedly print the following: 
 
1 deposit

2 withdraw

3 reset

4 show account info

anythingElse = quit
You can assume that the input will always be an integer.
After 1-4 are chosen, the user will be prompted to insert SerialNumber, passcode and amount (in
case withdraw or deposit is chosen).

Assume the user input is always correct i.e. never a String for balance etc...
Implement proper Exception Handling for all the methods, and print the error messages returned
by the ATM.

The invoking of the respective methods based on user choice can be done either from the
Main.class or ATM.class, your choice.