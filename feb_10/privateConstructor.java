package feb_10;
class Demo {
    public int a, b;
    private Demo() {
        this.a = 10;
        this.b = 20;
    }
    public int Demo() {
        System.out.println("Hey");
        return 1;
    }
    public static Demo getObject() {
        return new Demo();
    }
    public void disp() {
        System.out.println("Values of a & b is : "+a+", "+b);
    }
}
// class Demo2 extends Demo {
//     // Demo2() {
//     //     System.out.println("inside Demo2 constructor");
//     // }
// }
public class privateConstructor {
    public static void main(String[] args) {
        // Demo ob = new Demo();
        Demo obj1 = Demo.getObject();
        Demo obj2 = Demo.getObject();
        obj1.disp();
        obj2.disp();
        obj1.a = 55;
        obj2.b = 66;
        obj1.disp();
        obj2.disp();
        obj1.Demo();
    }
}
