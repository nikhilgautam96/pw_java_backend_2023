// package All_Projects.2_feb_25.Launch_app_efficient;
import java.util.*;
abstract class Shape {
    float area;

    abstract public void input();
    abstract public void compute();

    public void display() {
        System.out.println("The area is : "+area);
    }
}
class Rectangle extends Shape {
    private float length;
    private float breadth;

    public void input() {
        System.out.println("Calculation of the Rectangle app : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of Rectangle :");
        length = sc.nextFloat();
        System.out.println("Please enter the breadth of Rectangle :");
        breadth = sc.nextFloat();
    }
    public void compute() {
        area = length * breadth;
    }
}
class Square extends Shape {
    private float side;

    public void input() {
        System.out.println("Calculation of the Square app : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the side of Square :");
        side = sc.nextFloat();
    }
    public void compute() {
        area = side * side;
    }
}
class Circle extends Shape {
    private float radius;

    public void input() {
        System.out.println("Calculation of the Circle app : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the radius of Circle :");
        radius = sc.nextFloat();
    }
    public void compute() {
        area = 3.14f * radius * radius;
    }
}
class Geometry {
    protected void polymorphism(Shape ref) {
        ref.input();
        ref.compute();
        ref.display();
    }
}
public class LaunchAppEfficient {
    public static void main(String[] args) {
        Geometry g = new Geometry();

        g.polymorphism(new Rectangle());
        System.out.println("--------------**********---------------");

        g.polymorphism(new Square());
        System.out.println("--------------**********---------------");

        g.polymorphism(new Circle());
    }
}
