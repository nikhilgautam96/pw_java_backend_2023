// NOTE : Injecting Dependent Object to the target class is called as dependency injection.
package feb_25.Notes;
class Car {                     // Target class
    private Engine obj;

    public Car(Engine obj) {
        this.obj = obj;
    }

    public Car() {
        System.out.println("Default constructor called for Car class.");
    }

    public void setEngine(Engine obj) {
        this.obj = obj;
    }

    public void start() {
        obj.engineStart();
    }
}
class Engine {                  // Dependent class
    public void engineStart() {
        System.out.println("Car engine started.");
    }
}
public class DependencyInjection_1 {
    public static void main(String[] args) {

        Engine e = new Engine();    // Dependent class.

        Car c = new Car(e);         // Target class.
                                    // we are injecting Dependent class's object in target class
                                    // constructor thus "constructor injection".

        Car c2 = new Car();
        c2.setEngine(e);            // Setter Injection.

        c.start();                  
    }
}
