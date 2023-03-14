// package feb_10;
class Demo {
    private int a, b;
    private Demo() {
        this.a = 10;
        this.b = 20;
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
        Demo ob = new Demo();
        Demo obj = Demo.getObject();
        obj.disp();
    }
}