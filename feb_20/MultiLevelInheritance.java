package feb_20;
class Demo1 {
    void disp() {
        System.out.println("Display method in Demo1");
    }
}
class Demo2 extends Demo1 {
    
}
class Demo3 extends Demo2 {

}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Demo3 ob = new Demo3();
        ob.disp();
    }
}
