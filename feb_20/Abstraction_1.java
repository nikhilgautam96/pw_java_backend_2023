package feb_20;
abstract class Demo1 {
    public abstract void getDriver();    
    // all keywords before the return type are interchangeble.
    // ie - we can write "abstract public ..." & "static public ..." , etc.

    // public abstract void showDriver();  
            // we have to implement this method too in the subclass.
            // not doing so, gives CE.
}
class Demo2 extends Demo1 {
    public void getDriver() {
        System.out.println(" Implementing Driver method in subclass. ");
    }
    public void specialized() {
        System.out.println("Can't be accessed using parent's reference.");
    }
}
public class Abstraction_1 {
    public static void main(String args[]) {
        Demo1 obj = new Demo2();
        obj.getDriver();
        // obj.specialized();        // this is not possible. specialized method cannot be accessed
                                     // using parent's reference.
        // we need to perform downcasting to access the child class's specialized methods.
        ((Demo2) obj).specialized();    // "Downcasting"

        Demo2 obj2 = new Demo2();
        obj2.getDriver();
        obj2.specialized();             // using child reference it can be done.
    }
}