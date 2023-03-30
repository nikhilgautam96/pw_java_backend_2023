package feb_20;
class AeroPlane1 {
    final private void takeOff() {
        // This method is never overridden and so declaring it as "final" is not giving any error.
        System.out.println("AeroPlane is taking off");
    }
    // final public void takeOff() {
    //     // This method is getting overridden as it gets inherited in subclass so 
    //     //   declaring it as "final" will throw error as,
    //     // "final" methods are never overriden by rule.
    
    //     System.out.println("AeroPlane is taking off");
    // }
    public void fly() {
        System.out.println("AeroPlane is Flying");
    }
}
class CargoPlane1 extends AeroPlane1 {
    public void takeOff() {
        System.out.println("CargoPlane requires longer runway");
    }
    final public void fly() {
            System.out.println("Cargoplane flies at lower height");
    }
    public void test() {
        System.out.println("test");
    }
}
class PassengerPlane1 extends AeroPlane1 {
    public void takeOff() {
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly() {
        System.out.println("PassengerPlane flies at medium height");
    }
}
public class Polymorphism_3 {
    public static void main(String[] args) {
        CargoPlane1 cp=new CargoPlane1();
        PassengerPlane1 pp=new PassengerPlane1();
        AeroPlane1 ref;
        cp.takeOff();
        ref=cp;
        // ref.takeOff();
        ref.fly();

        System.out.println("------------------------------------------------");
        // ref=pp;

        // ref.takeOff();      // we have achieved polymorphism, but we need to reduce the 
        // ref.fly();          // num of lines of code. that we are doing in "Polymorphism_2.java"
       // pp=cp;
    }
}
