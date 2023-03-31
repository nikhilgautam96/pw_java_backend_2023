## Run-time   vs   Compile-time polymorphism :-

| Runtime Polymorphism | Compile Time Polymorphism |
| -------------------- | ------------------------ |
| Also known as dynamic polymorphism or method overriding. | Also known as static polymorphism or method overloading. |
| Occurs when a method call is resolved at runtime based on the actual type of the object that the method is called on. | Occurs when a method call is resolved at compile time based on the number, types, and order of the arguments passed to the method. |
| Requires inheritance and method overriding. | Requires the same method name but different parameter lists. |
| Example: Suppose we have a class hierarchy `Animal` -> `Dog` and both classes have a `makeSound()` method. If we create an object of type `Animal` and call its `makeSound()` method, the JVM will determine at runtime that the actual type of the object is `Dog` and call the `makeSound()` method of the `Dog` class instead of the `Animal` class. | Example: Suppose we have a `Calculator` class with multiple methods named `add` that take different numbers and perform addition. If we call the `add()` method with two integers, the compiler will select the `add(int, int)` method at compile time, and if we call it with two floats, the compiler will select the `add(float, float)` method. |
