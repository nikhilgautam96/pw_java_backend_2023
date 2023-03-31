## Composition :-
- In Java, a composition is a design pattern that allows objects to contain other objects
     as components.

- Composition is a way of building complex objects from simpler ones, by creating 
    a relationship between them.

- To implement composition in Java, you can define a class that represents the 
    composite object, and add instances of other classes as its attributes. 
    
- Here's an example:

```java
public class Car {
    private Engine engine;
    private Wheel[] wheels;

    public void setEngine(Engine obj) {
        engine = obj;
    }
    public void setWheels(Wheels [] obj) {
        wheels = obj;
    }
    // Other attributes and methods
}

public class Engine {
    // Attributes and methods
}

public class Wheel {
    // Attributes and methods
}
```
- Explaination : In this example, 
    - the Car class contains an instance of the Engine class and 
    - an array of Wheel objects. 
    - This is an example of composition because the Car is composed of an 
        Engine and Wheel objects.

- To use composition in your code, you can create instances of the classes and set 
    their attributes. 
- Here's an example:
```java

    Engine engine = new Engine();

    Wheel[] wheels = new Wheel[4];
    for (int i = 0; i < wheels.length; i++) {
        wheels[i] = new Wheel();
    }

    Car car = new Car();
    car.setEngine(engine);
    car.setWheels(wheels);

```