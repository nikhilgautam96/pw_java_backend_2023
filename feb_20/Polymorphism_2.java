package feb_20;
class AeroPlane2 {
    // declaring below method as private restricts its access to the class and so
    //  it cannot be overriden in subclass as we will get visibility error.
    // private void takeOff() {
    //     System.out.println("AeroPlane is taking off");
    // }

    public void takeOff() {
        System.out.println("AeroPlane is taking off");
    }
    public void fly() {
        System.out.println("AeroPlane is Flying");
    }
}
class CargoPlane2 extends AeroPlane2 {
    public void takeOff() {
        System.out.println("CargoPlane requires longer runway");
    }
    public void fly() {
        System.out.println("Cargoplane flies at lower height");
    }  
}
class PassengerPlane2 extends AeroPlane2 {
    public void takeOff() {
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly() {
        System.out.println("PassengerPlane flies at medium height");
    }
}
class FighterPlane2 extends AeroPlane2 {
    public void takeOff() {
        System.out.println("FighterPlane requires small size runway");
    }
    public void fly() {
    System.out.println("FighterPlane flies at high height");
    }
}
class AirIndia extends PassengerPlane2 {
    public void fly() {
        System.out.println("Air India flies safe.");
    }
}
class Airport {
    public void poly(AeroPlane2 ref) {
        ref.takeOff();
        ref.fly();
        System.out.println("-------------------------------------");
    }
}
public class Polymorphism_2 {
    public static void main(String[] args) 
    {
       CargoPlane2 cp = new CargoPlane2();
        
        PassengerPlane2 pp = new PassengerPlane2();

        FighterPlane2 fp = new FighterPlane2();

        AirIndia ap = new AirIndia();
        Airport a = new Airport();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);
        a.poly(ap);

        // cp.takeOff();                     
        // cp.fly();

        // pp.takeOff();
        // pp.fly();

        // fp.takeOff();
        // fp.fly();
    }
}
