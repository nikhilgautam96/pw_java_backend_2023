package feb_20;
class Aeroplane {
    public void takeOff() {
        System.out.println("Aeroplane is taking off.");
    }
    public void fly() {                             // Overridden Method.
        System.out.println("Aeroplane is Flying.");
    }
}
class CargoPlane extends Aeroplane {
    public void fly() {                             // Overriding Method.
        System.out.println("Cargo Plane flies at lower height.");
    }
    public void carryGoods() {                      // Specialized Method.
        System.out.println("Cargo Plane carry goods.");
    }
}
class PassengerPlane extends Aeroplane {
    public void fly() {
        System.out.println("Passenger Plane flies at medium height.");
    }
    public void carryPassengers() {                 // Specialized Method.
        System.out.println("Passenger plane carries passenger.");
    }
}
public class TypesOfMethods {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.takeOff();                               // Inherited Method.
        cp.fly();
        cp.carryGoods();

        PassengerPlane pp = new PassengerPlane();
        pp.takeOff();                               // Inherited Method.
        pp.fly();
        pp.carryPassengers();
    }
}
