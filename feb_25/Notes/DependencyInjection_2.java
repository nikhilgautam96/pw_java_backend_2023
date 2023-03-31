package feb_25.Notes;
class Employee {            // Target class
    private Address adr;
    
    public void setAddress(Address adr) {
        this.adr = adr;
    }
    public void getAddress() {
        adr.showAddress();
    }
}
class Address {             // Dependent class
    void showAddress() {
        System.out.println("Address is Banglore.");
    }
}
public class DependencyInjection_2 {
    public static void main(String[] args) {
        Address a = new Address();              // Dependent class object.

        Employee e = new Employee();            // Target class 
        e.setAddress(a);
        e.getAddress();
    }
}
