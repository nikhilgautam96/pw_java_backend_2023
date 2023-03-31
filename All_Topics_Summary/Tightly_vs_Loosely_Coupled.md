## Tightly Coupled   vs   Loosely Coupled  :-
- Tightly coupled and loosely coupled are terms used to describe the degree of 
    interdependence between different parts of a software system. 
    
### Tight Coupling  :-    
- In a tightly coupled system, changes in one part of the system can have a 
    significant impact on other parts of the system.

- Tight coupling can occur when one class depends directly on another class or when 
    two classes have strong dependencies on each other.

- Here is an example of tight coupling in Java:
```java
public class Order {
   private Payment payment;

   public Order() {
       payment = new Payment();
   }

   public void checkout() {
       payment.makePayment();
   }
}

public class Payment {
   public void makePayment() {
       // Code to process payment
   }
}
```
- In this example, 
    - the Order class has a tight coupling with the Payment class. 
    - The Order class creates an instance of the Payment class in its constructor and 
        calls its makePayment() method in the checkout() method. 
    - If the implementation of the Payment class changes, the Order class may need 
        to be modified as well. This makes the system more difficult to 
        maintain and change over time.


### Loose Coupling  :-
- In a loosely coupled system, changes can be made to one part of the system 
    without affecting other parts.

- Loose coupling occurs when two classes interact through a well-defined interface.

- Here is an example of loose coupling in Java:
```java
public interface Payment {
   public void makePayment();
}

public class Order {
   private Payment payment;

   public Order(Payment payment) {
       this.payment = payment;
   }

   public void checkout() {
       payment.makePayment();
   }
}

public class CreditCardPayment implements Payment {
   public void makePayment() {
       // Code to process credit card payment
   }
}

public class PayPalPayment implements Payment {
   public void makePayment() {
       // Code to process PayPal payment
   }
}
```

- In this example, 
    - the Order class is loosely coupled with the Payment class. 
    - Instead of creating an instance of the Payment class, the Order class depends 
        on the Payment interface.
    - The Order class can be constructed with any implementation of the Payment interface, 
        such as "CreditCardPayment" or "PayPalPayment", without knowing the implementation details. 
    - This allows the system to be more flexible and easier to maintain over time.