package jan_28;
public class SwitchCase {
    public static void main(String[] args) {
        int x = 15;
        switch(x) {
            // System.out.println("message : " +x); // " This throws an eror at compile time. "
            case 5 : System.out.println("message 5 : " +x); break;
            default : System.out.println("message default : " +x); break;
            case 10 : System.out.println("message 10 : " +x); break;
            case 15 : System.out.println("message 15 : " +x); break;
        }
    }
}
