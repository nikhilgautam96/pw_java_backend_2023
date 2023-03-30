# String in Java :
. String class is present in the "java.lang.String" package.
. we don't need to import the "java.lang" package in our program as we can directly use it.
. String - in java is an "object" hence it is also stored in "Heap Memory".
. The memory for value of String objects is allocated in the heap area, but the 
    reference to those objects/object values are still in the stack area.
    by reference here we mean the variables pointing to those string objects.
. Whenever we use any "inbuilt" string method or the "new" keyword or "reference" to any other string, 
    the string object is allocated memory outside the SCP but in heap area.

### "String Constant Pool" :-
- String Pool in Java is a special storage space in Java Heap memory where string literals are stored.
It is also known by the names - "String Constant Pool" or "String Intern Pool". 
Whenever a string literal is created, the JVM first checks the String Constant Pool 
before creating a new String object corresponding to it.

####  Need of String Constant Pool :-
. When we create a String object, it uses some amount of space in the heap memory.
. Let's say we are creating 'n' number of String objects with the same value, 
    and distinct memory is allocated to each of these string objects 
    (though they all contain the same string).
. This is an inefficient usage of heap memory. In order to escalate the performance of 
    our code and reduce memory usage, JVM optimizes the way in which strings are stored with 
    the help of a string constant pool.

####  Advantages of String Pool in Java :-
1. Java String Pool allows "caching" of string. 
    Caching here is the process of storing data in a cache. Cache improves performance 
    and reduces memory usage.
2. Provides "reusability" : It saves time to create a new string if there is already a 
    string with the same value present in the pool. The old string is reused, 
    and its reference is returned.

####  Why did the String pool move from "PermGen" to the "normal heap area" ? 
. PermGen space is limited, the default size is just 64 MB. it was a problem with creating 
    and storing too many string objects in PermGen space. That’s why the String pool 
    was moved to a larger heap area.
    
####  Garbage Collection in SCP :-
. Garbage Collector cannot access SCP Area, Even thosgh Object does not have any reference 
    still object is not eligible for GC.
. All SCP objects will be destroyed only at the time of JVM ShutDown.

## Ways to Create Strings :-
1. String literal
2. Using new keyword :
    => String x = new String("Nikhil");
        - here the string object memory is allocated in heap area but outside the String constant pool.
        - but a copy of this string is also created in the String Constant Pool for internal reference.
        - the reference will always point to Heap object.
3. Using String.intern() method :
    => In this method, First the String object is created(outside String Pool) then the JVM 
        looks for the string value in string pool if the value is already present in the pool
        then the reference to String Pool value/object is returned
        otherwise,
        the String created string object (outside the pool) is actually 
        added to the string pool.
eg :- 

```java
    public class InternExample {  
        public static void main(String args[]) {  
            String s1=new String("hello");  
            String s2="hello";  
            String s3=s1.intern();  //returns string from pool, now it will be same as s2  
            System.out.println(s1==s2); //false because reference variables are pointing to different instance  
            System.out.println(s2==s3); //true because reference variables are pointing to same instance  
        }
    }
```
```java
    public class InternExample2 {  
        public static void main(String[] args) {          
            String s1 = "Javatpoint";  
            String s2 = s1.intern();  
            String s3 = new String("Javatpoint");  
            String s4 = s3.intern();          
            System.out.println(s1==s2);     // True  
            System.out.println(s1==s3);     // False  
            System.out.println(s1==s4);     // True       
            System.out.println(s2==s3);     // False  
            System.out.println(s2==s4);     // True        
            System.out.println(s3==s4);     // False          
        }  
    }  
```

### Types of String Object in java :-
##### 1. Mutable (can be modified) :
- Once if we create a String, on that String if we try to perform any operation and if those 
    changes get reflected in the same oblect then such strings are called “Mutable String”.
    Example : StringBuffer, StringBuilder.

- When to use :
    . If the content will change frequently then it is not recommended to go for String object 
        cuz for every new change a new Object will be created
    . To handle this type of requirement, we have a StringBuffer/StringBuilder concept.

- StringBuffer (Since Version 1.0 ):-
    . Every method in StringBuffer is "Synchronized".
    . At a time only 1 Thread is allowed to operate on StringBuffer object, thereby slowing performance.
    . When max capacity of StringBuffer object is reached then,
            capacity = (current_capacity + 1) * 2;
    . StringBuffer sb = new StringBuffer();         // initial capacity = 16.
    . StringBuffer sb = new StringBuffer( initialCapacity );        // initial capacity = initialCapacity.
    . StringBuffer sb = new StringBuffer(String s);     // initial capacity = s.length() + 16.
        . Important Methods :- 
```java
    1. public int length()
    2. public int capacity()
    3. public char charAt(int index)
    4. public void setCharAt(int index,char ch)
    5. public StringBuffer append(String s)
    6. public StringBuffer append(int i)
    7. public StringBuffer append(long l)
    8. public StringBuffer append(boolean b)
    9. public StringBuffer append(double d)
    10. public StringBuffer append(float f)
    11. public StringBuffer append(int index, Object o)
    12. public StringBuffer insert(int index, String s)
    13. public StringBuffer insert(int index, int i)
    14. public StringBuffer insert(int index, long l)
    15. public StringBuffer insert(int index, double d)
    16. public StringBuffer insert(int index, boolean b)
    17. public StringBuffer insert(int index, float s)
    18. public StringBuffer insert(int index, Object o)
    19. public StringBuffer delete(int begin, int end) // deletes the char from the begin index to end-1.
    20. public StringBuffer deleteCharAt(int index)
    21. public StringBuffer reverse()
    22. public void setLength(int Length)
                // It is used to consider only the specified no of characters and remove all the 
                    remaining characters.
                    eg :-   StringBuffer sb = new StringBuffer("sachinramesh");
                            sb.setLength(6);
                            System.out.println(sb);         // sachin
    23. public void trimToSize()
                // It is used to deallocate the extra allocated free memory such that capacity and size 
                    are equal.
                    eg :-
                        StringBuffer sb = new StringBuffer(1000);
                        System.out.println(sb.capacity());          // 1000
                        sb.append("sachin");
                        System.out.println(sb.capacity());          // 1000
                        sb.trimToSize();
                        System.out.println(sb);                     // sachin
                        System.out.println(sb.capacity());          // 6
    24. public void ensureCapacity(int capacity)
                // It is used to increase the capacity dynamically based on our requirements.
```
- StringBuilder (Since Version 1.5 ) :-
    . No methods a e Synchronized.
    . No Threadsafe - At a time more than one thread can operate.
    . Threads are not required to wait so performance is high.
    . Important methods
```java
    1. append(Object obj)
    2. append(String str)
    3. insert(int offset, Object obj)
    4. insert(int offset, String str)
    5. delete(int start, int end)
    6. deleteCharAt(int index)
    7. replace(int start, int End, String str)
    8. reverse()
    9. toString()
```
##### 2. Immutable (cannot be modified) :
- In java String object is by default immutable, meaning once the object is created we cannot
    change the value of the object, if we try to change then those changes will be
    reflected on the new object not on the existing object.
- example
    String name = "Data";
        // the above string object is created in the "String Pool" in the heap area.
        // this type of String object doesn't allows duplication.
            eg :- String name1 = "nikhil";
                String name2 = "nikhil";
                . the 2 variables here actually point to same memory address
                inside the "String memory Pool".
                . this is why (name1 == name2) => "True"
                bcz in this method no matter how many variables we create,
                if the value is same no new memory will get allocated
                instead each variable will point to same address.

    String name = new String("Nikhil");
                    or
    Char ch = {'a', 'b', 'c', 'd'};
    String name = new String(ch);
        // the above String object is created in the heap area too, but outside the 
            string pool.
        // this type of string object allows duplication.
            eg :- String name1 = new String("Nikhil");
                String name2 = new String("Nikhil");
                . there will be 2 different memory address allocated for the 2 diff
                variables eventhough they both have same value.
                . this is the reason why (name1 == name2) gives => "False"  
                . but (name1.equals(name2)) => "True"
- String class Constructor :
    1. String s = new String();
        - Creates an Empty String Object.
    2. String s = new String(String literals);
        - Creates an Object with String literals on Heap.
    3. String s = new String(StringBuffer sb)
        - Creates an equivalent String Object for StringBuffer.
    4. String s = new String(char[] ch)
        - Creates an equivalent String Object for Character array.
            eg :    char[] ch = {'a','b','c'} ;
                    String s = new String(ch);
                    System.out.println(s); // "abc"
    5. String s = new String(byte[] b)
        - Creates an equivalent String Object for byte array.
            eg :    byte[] b = {100,101,102};
                    String s = new String(b);
                    System.out.println(s); // "def"  
            {the byte value are treated as Ascii and gets converted to char counterparts.}

### Ways to Compare :-
    1. "==" : compares the references of the string object.
    2. "equals()" : compares the content of the String object.

### '+'   vs   concat() :-
```java
    1. '+' : does not allocates memory outside SCP unless reference to string objects is used.
        . eg :- String s1 = "sachin";  // in SCP
                String s2 = " Nikhil"  // in SCP
                String s3 = s1 + s2;   // in heap outside SCP, but a copy is also created in SCP.
                                    // since reference to s1 and s2 were used.
                String s4 = "Nikhil" + "Gautam" + "is";   // in SCP
        . Miscellaneous :
            - String x = "Nik_" + 100 + 99;                 // "Nik_10099"
            String y = 100 + 99 + "_Nik";                 // "199_Nik"
            String z = 100 + 99 + "_Nik_" + 100 + 99;     // "199_Nik_10099"
    
    2. concat() : inbuilt method so allocates memory outside SCP in Heap.
        . eg :- String s1 = "pw";                   // in SCP.
                String s2 = s1.concat(" skill");    // in Heap outside SCP, a copy in SCP too.
                s1.concat(" classes");              // in Heap outside SCP, but it is not referenced
                                                    // also a copy is made in SCP too.
                String s3 = new String("Hey ");     // in Heap outside SCP. copy in SCP.
                s3 = s3.concat("Nikhil");           // in Heap outside SCP, S3 points to this object
                                                    // copy in SCP. older s3 value remains dereferenced.
```

### Inbuilt String Methods :-
    . Any inbuilt methods when used will allocate memory for the string object in Heap outside SCP.
```java
    1. public char charAt(int index)    
        // index can't be -ve or more than length of string.
        // StringArrayIndexOutOfBoundsException.
    2. public String concat(String str)
    3. public boolean equals(Object o)
        // It is used for Content Comparison, 
        // In String class equals() method is Overridden to check the 
        // content of the object. It is used for Content Comparison without comparing the /// case.
    4. public String substring(int begin)
    5. public String substring(int begin,int end)
    6. public int length()
    7. public String replace(char old, char new)
    8. public String toLowerCase()
    9. public String toUpperCase()
        - eg:   String s1 = "HEY";                     // in SCP
                String s2 = "hey".toUpperCase();       // in Heap outside SCP.
                (s1 == s2)  => "false"                 // since references are being checked.
                (s1.equals(s2))  => "true"             // since contents are being checked.
    10. public String trim()
    11. public int indexOf(char ch)
        - returns (-1) if char not present.
    12. public int lastIndexOf(char ch)
        - returns (-1) if char not present.
```
### Miscellaneous :
```java
    -   String str =" ";
        str.trim();
        System.out.println(str.equals("")+ " " + str.isEmpty());    // false false
        // bcz we are not assigning the result of str.trim() to str.
        // if we did, "str = str.trim();"  then reslt would be "true true"
```
```java
    - public class Test {
        public static void main(String[] args) { 
            String fName = "James";
            String lName = "Gosling"; 
            System.out.println(fName = lName);          // "Gosling"
        }
    }
```
```java
    - public class Test {
        public static void main(String[] args) { 
            String str1 = new String("Core"); 
            String str2 = new String("CoRe"); 
            System.out.println(str1 = str2);            // "CoRe"
        }
    }
```
```java
    - public class Test {
        public static void main(String[] args){
            String str = "Good";
            change(str);
            System.out.println(str);                    // "Good"
        }
        private static void change(String s) { 
            s.concat("_Morning");
        }
    }
```
```java
    - public class Test {
        public static void main(String[] args) {
            StringBuilder sb = new StringBuilder("Good");
            change(sb);
            System.out.println(sb);                     // "Good_Morning"
        }
        private static void change(StringBuilder s) { 
            s.append("_Morning");
        }
    }
```
