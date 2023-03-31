## Abstraction   vs   Encapsulation :-


<div class="markdown prose w-full break-words dark:prose-invert dark"><p>Here's a table that summarizes the differences between abstraction and encapsulation in Java:</p><table><thead><tr><th>Abstraction</th><th>Encapsulation</th></tr></thead><tbody><tr><td>Focuses on the essential characteristics of an object or system and ignores the irrelevant or non-essential details.</td><td>Hides the implementation details of an object or system from the outside world and restricts access to its internal state.</td></tr><tr><td>Achieved through the use of abstract classes and interfaces.</td><td>Achieved through the use of access modifiers (public, private, protected) and getters/setters methods.</td></tr><tr><td>Defines a common set of methods or properties that must be implemented by the classes that extend an abstract class or implement an interface.</td><td>Groups related data and behavior into a single unit (class) and restricts access to its internal state.</td></tr><tr><td>Provides a way to create flexible, modular, and extensible code that can be easily maintained and updated over time.</td><td>Helps prevent accidental modification or misuse of an object's internal state by enforcing a set of rules or constraints on how it can be accessed or modified.</td></tr><tr><td>Examples: <code>Animal</code> abstract class with <code>makeSound()</code> and <code>eat()</code> methods; <code>Shape</code> interface with <code>getArea()</code> and <code>getPerimeter()</code> methods.</td><td>Examples: <code>Person</code> class with private <code>name</code> and <code>age</code> fields and public <code>getName()</code> and <code>getAge()</code> methods; <code>BankAccount</code> class with private <code>balance</code> field and public <code>deposit()</code> and <code>withdraw()</code> methods.</td></tr></tbody></table><p>In summary, abstraction and encapsulation are both important concepts in Java that help create well-structured, modular, and maintainable code. Abstraction focuses on the essential characteristics of objects, while encapsulation hides the implementation details of objects and restricts access to their internal state.</p></div>





**`Abstraction`**	                                            **`Encapsulation`**
- Focuses on the essential characteristics of        - Hides the implementation details of an object 
an object or system and ignores the irrelevant       or system from the outside world and restricts
an object or system and ignores the irrelevant       access to its internal state.
or non-essential details.                          

Achieved through the use of abstract classes         Achieved through the use of access modifiers 
and interfaces.                                      (public, private, protected) and 
                                                     getters/setters methods.
                                                     
Defines a common set of methods or properties        Groups related data and behavior into a 
that must be implemented by the classes that         single unit (class) and restricts access 
extend an abstract class or implement an             to its internal state.
interface.

Provides a way to create flexible, modular,          Helps prevent accidental modification or 
and extensible code that can be easily               misuse of an object's internal state by 
maintained and updated over time.                    enforcing a set of rules or constraints on 
                                                     how it can be accessed or modified.

Example:                                             Example: 
 . Animal abstract class with makeSound()             . Person class with private name and age 
   and eat() methods;                                   fields and public getName() and getAge() 
 . Shape interface with getArea() and                   methods; 
   getPerimeter() methods.                            . BankAccount class with private 
                                                        balance field and public deposit()
                                                         and withdraw() methods.       