package jan_29.Assignment;
public class pw_skills {
    public static void main(String[] args) {
        int n = 9;
        for(int i = 0; i<n; i++) {
            // P
            P(i);
            System.out.print(" ");
            // W
            W(i);
            System.out.print("      "); // 6-spaces.
            // S
            S(i);
            System.out.print(" ");
            // K
            K(i);
            System.out.print(" ");
            // I
            I(i);
            System.out.print(" ");
            // L
            L(i);
            System.out.print(" ");
            // L
            L(i);
            System.out.print(" ");
            // S
            S(i);
            System.out.println();
        }
    }
    static void P(int i) {
        int n = 9;
        for(int j = 0 ; j<n; j++) {
            if(j==0 || (i==0 && j!=n-1) || (i==(n-1)/2 && j!=n-1) || (i>0 && i<(n-1)/2 && j==n-1)) {
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
        }
    }
    static void W(int i) {
        int n = 9;
        for(int j = 0; j<n; j++) {
            if(j==0 || j==n-1 || (i>=(n-1)/2 && (i==j || i+j==n-1))) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    static void S(int i) {
        int n = 9;
        for(int j = 0; j<n; j++) {
            if((i==0 || i==(n-1)/2 || i==n-1) || (i<(n-1)/2 && j==0) || (i>(n-1)/2 && j==n-1)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    static void K(int i) {
        int n = 9;
        for(int j = 0; j<n; j++) {
            if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2) {
                System.out.print("*");
            } else if(j<=(n-1)/2) {
                System.out.print(" ");
            }
        }
    }
    static void I(int i) {
        int n = 9;
        for(int j = 0; j<n; j++) {
            if(i==0 || i==n-1 || j==(n-1)/2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    static void L(int i) {
        int n = 9;
        for(int j = 0; j<n; j++) {
            if(j==0 || i==n-1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
}
