# `Upcasting  vs  Downcasting` :
- Upcasting and downcasting are two types of casting in object-oriented programming languages 
    such as Java and C++.

### `Upcasting` :-
- Upcasting is when a reference variable of a derived class type is assigned to a reference 
    variable of the base class type. 
- This is a type of implicit casting.
- where the derived class object is treated as an instance of the base class. 
- Upcasting is always safe and can be performed implicitly by the compiler without any issues.

Here's an example of upcasting in Java :
```java
// Base class
class Animal {
  public void makeSound() {
    System.out.println("Animal is making a sound.");
  }
}

// Derived class
class Dog extends Animal {
  public void makeSound() {
    System.out.println("Dog is barking.");
  }
}

// Upcasting example
Animal animal = new Dog(); // Upcasting
animal.makeSound(); // Output: Dog is barking.

```

### `Downcasting` :-
- Downcasting, on the other hand, is when a reference variable of the base class type 
    is assigned to a reference variable of the derived class type. 
- This is a type of explicit casting.
- where the base/parent class object is cast to a derived/child class object. 
- Downcasting is not always safe and can result in a `ClassCastException` at runtime 
    if the object being cast is not actually an instance of the derived/child class.

Here's an example of downcasting in Java :

```java

// Base class
class Animal {
  public void makeSound() {
    System.out.println("Animal is making a sound.");
  }
}

// Derived class
class Dog extends Animal {
  public void makeSound() {
    System.out.println("Dog is barking.");
  }

  public void fetch() {
    System.out.println("Dog is fetching.");
  }
}

// Downcasting example
Animal animal = new Dog(); // Upcasting
Dog dog = (Dog) animal; // Downcasting
dog.makeSound(); // Output: Dog is barking.
dog.fetch(); // Output: Dog is fetching.

Animal obj = new Dog();
// obj.fetch();                // gives an error --> 
                               // "   The method fetch() is undefined for the type 'Dog'  "
((Dog) obj).fetch();        // does not give any error and we are able to access 
                            // specialized method " fetch() " of child class.

```
