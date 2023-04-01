package feb_27.Code;
interface A {
    int x = 10;             // Variables are "final and static" by default
    String name = "Nikhil";        
    // if we dont initialed this variable we get the error as -->
        // --> "The blank final field x may not have been initialize"
    
    void print();           // This method is --> "public and abstract" by default.
    public abstract void compute();
}
public class Interface_1 {
    public static void main(String[] args) {
        // We can see below that we can acccess variables of interface without using object 
        // reference, but by using class reference.
        // Hence --> variables are static.
        System.out.println("X is : " + A.x + ", Name is : " + A.name);

        // now we will try to chabnge the value of these variables
        // A.name = "Aditya";   // we start getting error here as final variables can't be modified.
        // Hence --> variables are final.
    }
}
