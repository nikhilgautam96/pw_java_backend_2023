# Final Keyword :-

- In Java, the final keyword can be applied to { variables, methods, and classes }.
    1. `Variables` : 
        - Final variables should be initialised at the time of declaration.
        - When final is applied to a variable, its value cannot be changed once it has 
            been initialized.
        - Final variables are treated as "compile time constants".
        - This is often used to create constants in Java.
        - eg :-
    ```java
    class Animal1 {
        final int age = 19;    // final variables should be assigned at time of declaration.
        final void sleep() {
            // age = 20;       // The final field Animal1.age cannot be assigned

            System.out.println("Animal is sleeping");
        }
    }   
    ```
    2. `Methods` : 
        - The final methods do participate in inheritance. ie. they do get inherited.
        - When final is applied to a method, the method cannot be overridden by 
            a subclass. 
        - This is often used to prevent changes to the behavior of a method 
            in a class hierarchy.
        - eg :-
        - eg :-
    ```java
    class Animal1 {
        final int age = 19;    // final variables should be assigned at time of declaration.
        final void sleep() {
            // age = 20;
            System.out.println("Animal is sleeping");
        }
    }   
    class Tiger1 extends Animal1 {
        // void sleep() {
            // final method sleep() got inherited but,
            // we cannot ovverride it in child class
            // error :  "Cannot override the final method from Animal1"
        // }
    }
    public class Final_k {
        public static void main(String[] args) {
            Tiger1 t = new Tiger1();
            t.sleep();      // proof that final method got inherited.
        }
    }
    ```
    3. `Classes` : 
        - When final is applied to a class, the class cannot be subclassed. 
        - This is often used to prevent changes to the behavior of a class or to 
            ensure that a class has a specific set of functionality that cannot be altered.
        - eg :-
    ```java
    final class Animal1 {
        void sleep() {
            System.out.println("Animal is sleeping");
        }
    }
    class Tiger1 extends Animal1 { // "The type Tiger1 cannot subclass the final class Animal1"
        // void sleep() {

        // }
    }
    ```

- The final keyword in Java is used to denote immutability or prevent modification to 
    variables, methods, or classes.
- The main advantage of the final keyword is we can achieve security.
- Whereas the main disadvantage is we are missing the key benefits of oops:
    - polymorphism (because of final methods), 
    - inheritance (because of final cfasses) 
- hence if there is no specific requirement it is never recommended to use final keyword.