Inheritance is a mechanism in which a new class (derived class or subclass) is created from an existing class (base class or superclass), inheriting its properties and behaviors. In Java, inheritance is implemented using the extends keyword. 
In my example, Student is a subclass of Person. It is inheriting the methods from Person class.
Overriding occurs when a subclass provides a specific implementation for a method that is already defined in its superclass. The method in the subclass has the same name, return type, and parameters as the method in the superclass. 
This allows the subclass to customize or extend the behavior of the inherited method. In Java, the @Override annotation is used to explicitly indicate that a method is being overridden.
In my example, the displayInfo() method in the Student class overrides the displayInfo() method in the Person class.
Overloading occurs when multiple methods in the same class have the same name but different parameters (either in number or type). The methods can have different return types or access modifiers, but their names must be the same. 
Overloading allows a class to have multiple methods with the same name, providing flexibility in method invocation.
In my example, there is an example about overloading in student class.
