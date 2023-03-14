package feb_20;
class Animal {
    void sleep() {
        System.out.println("Animal needs Sleep. ");
    }
}
class Tiger extends Animal {

}
class Monkey extends Animal {

}
class Deer extends Animal {

}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep();
        Monkey m = new Monkey();
        m.sleep();
        Deer d = new Deer();
        d.sleep();
    }
}
