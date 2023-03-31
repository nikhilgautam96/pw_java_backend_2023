package feb_20;
abstract class A {
    int x;
    A() {
        x = 10;
        System.out.println("in A's constructor, X-is : " + x);
    }
}
class B extends A {
    B() {
        // super() by default
        System.out.println("B-Con");
    }
}
public class Abstraction_2 {
    public static void main(String[] args){
        B b = new B();
    }
}
