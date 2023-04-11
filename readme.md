QAMP (OOP) - Zadaca 1

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