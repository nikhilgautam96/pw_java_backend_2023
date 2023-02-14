package jan_29.Assignment;
public class My_Name {
    public static void main(String[] args) {
        int n = 9;
        for(int i = 0; i<n; i++) {
            // N
            N(i);
            System.out.print(" ");
            // I
            I(i);
            System.out.print(" ");
            // K
            K(i);
            System.out.print(" ");
            // H
            H(i);
            System.out.print(" ");
            // I
            I(i);
            System.out.print(" ");
            // L
            L(i);
            System.out.print("      "); // 6-spaces.
            // G
            G(i);
            System.out.print(" ");
            // A
            A(i);
            System.out.print(" ");
            // U
            U(i);
            System.out.print(" ");
            // T
            T(i);
            System.out.print(" ");
            // A
            A(i);
            System.out.print(" ");
            // M
            M(i);
            System.out.println();
        }
    }
    static void N(int i) {
        int n = 9;
        for(int j = 0; j<n; j++) {
            if(j==0 || j==n-1 || i==j) {
                System.out.print("*");
            } else {
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
    static void H(int i) {
        int n = 9;
        for(int j = 0; j<n; j++) {
            if(j == 0 || j == n-1 || i == (n-1)/2) {
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
    static void G(int i) {
        int n = 9;
        for(int j = 0; j<n; j++) {
            if((j==0 && i!=0 && i!=n-1) || ((i==0 || i==n-1) && j!=0 && j!=n-1)
                || (i==(n-1)/2 && j>=(n-1)/2) || (i>(n-1)/2 && i!=n-1 && j==n-1)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    static void A(int i) {
        int n = 9;
        for(int j = 0; j<n; j++) {
            if((i == 0 && j > 0 && j < n-1) || (i > 0 && (j == 0 || j == n-1)) || i == (n-1)/2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    static void U(int i) {
        int n = 9;
        for(int j = 0; j<n; j++) {
            if((i==n-1 && j!=0 && j!=n-1) || (i!=n-1 && (j==0 || j==n-1))) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    static void T(int i) {
        int n = 9;
        for(int j = 0; j<n; j++) {
            if(i == 0 || j == (n-1)/2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    static void M(int i) {
        int n = 9;
        for(int j = 0; j<n; j++) {
            if(j==0 || j==n-1 || (i<=(n-1)/2 && (i==j || i+j==n-1))) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
}
