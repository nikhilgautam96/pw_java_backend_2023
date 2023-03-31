# Abstraction :-
- The process of displaying/exposing only the essential details by hiding the 
    irrelevant details.

## Abstract Keyword :-
- In Java applications, if we want to declare a method without body then we must 
    declare that method as "Abstract Method" using the "abstract" keyword.
- If we want to declare abstract methods then the respective class must be an 
    abstract class.
eg :-
```java
      abstract class Demo1 {
          public abstract void getDriver();
      }
      class Demo2 extends Demo1 {
          public void getDriver() {
              System.out.println(" Implementing Driver method in subclass. ");
          }
      }
      public class Abstraction_1 {
          public static void main(String args[]) {
              Demo1 obj = new Demo2();
              obj.getDriver();
          }
      }
```
- In java, if we have declared an "abstract class" with "abstract methods" then,
    it is convention to implement all the abstract methods by taking subclasses.
    not doing so, gives CE.
- If we implement only some of the abstract methods in the respective subclass then 
    compiler will rise an error, where to come out from compilation error we have 
    to declare the respective subclass as an abstract class and we have to provide 
    implementation for the remaining abstract methods by taking another subclass in
    multilevel inheritance.
eg :- 
```java
    abstract class A{
        abstract void m1();
        abstract void m2();
        abstract void m3();
    }
    abstract class B extends A {
        void m1(){
            System.out.println("m1-A");
        }
    }
    class C extends B {
        void m2(){
            System.out.println("m2-C");
        }
        void m3() {
            System.out.println("m3-C");
        }
    }
    public class Test{
        public static void main(String[] args) {
            A a=new C();
            a.m1();
            a.m2();
            a.m3();
        }
    }
```
- To access the abstract class members, we have to create an object for the 
    subclass and we have to create a reference variable either for abstract class 
    or for the subclass.
eg :-
```java
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
    }
    public class Abstraction_1 {
        public static void main(String args[]) {
            Demo1 obj = new Demo2();        // using abstract parent class reference.
            obj.getDriver();

            Demo2 obj2 = new Demo2();       // using child class reference.
            obj2.getDriver();
        }
    }
```
- In above example we can see that, Object is always created for the subclass.
- we cannot instantiate the abstract class.
    ie. Object of abstract class cannot be created, we can only use its reference.
- using abstract class reference we cannot access subclass's "Specialized methods".
    eg :-
```java
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
            Demo1 obj = new Demo2();        // using abstract parent class reference.
            obj.getDriver();

            // obj.specialized();           // this is not possible. specialized method cannot 
                                            // be accessed using parent's reference.

            Demo2 obj2 = new Demo2();       // using child class reference.
            obj2.getDriver();
            obj2.specialized();             // using child reference it can be done.
        }
    }
```
- Using the abstract class reference we cannot access the specialized methods of child class,
    we need to "downcast" the abstract class reference variable to the child class type.
eg :- 
```java
        // Base class
        class Animal {
            public void makeSound() {
                System.out.println("Animal is making a sound.");
            }
        }

        // Derived class
        class Dog extends Animal {
            public void makeSound() {
                System.out.println("Dog is barking.");
            }

            public void fetch() {
                System.out.println("Dog is fetching.");
            }
        }

        public class Abstraction_1 {
            public static void main(String args[]) {
                // Downcasting example
                Animal animal = new Dog(); // Upcasting
                Dog dog = (Dog) animal; // Downcasting
                dog.makeSound(); // Output: Dog is barking.
                dog.fetch(); // Output: Dog is fetching.

                Animal obj = new Dog();
                // obj.fetch();         // gives an error --> 
                                        // " The method fetch() is undefined for the type 'Dog' "
                ((Dog) obj).fetch();    // does not give any error and we are able to access 
                                        // specialized method " fetch() " of child class.
            }
        }
```