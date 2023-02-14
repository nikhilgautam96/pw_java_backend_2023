package jan_29.Assignment;
public class triangle {
    public static void main(String[] args) {
        int n = 9;
        for(int i = 0; i<n; i++) {
            for(int j = i; j<n; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
