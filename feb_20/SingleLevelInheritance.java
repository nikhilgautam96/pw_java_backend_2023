package feb_20;
class Human1 {
    private String name;
    int age;

    Human1() {
        System.out.println("Human class Constructor");
    }

    private void sleep() {
        age = 18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Student1 extends Human1 {
    // public Studemt1()
    // {
        //super();
    // }
    void disp() {
        System.out.println(" The age is : " + age);
        // System.out.println(" The Name is : " + name);
    }
    public void sleep() {  // we are increasing the visibility of overriden method.
        age = 18;
        System.out.println("Student needs good sleep");
        System.out.println(age);
    }
}
public class SingleLevelInheritance {
    public static void main(String[] args) {
        Student1 st1 = new Student1();
        st1.sleep();
        st1.disp();
    }
}
