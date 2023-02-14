package jan_29.Notes.Alphabet_Pattern;
public class K {
    public static void main(String[] args) {
        int n = 9;
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                if(j==0 || i+j==(n-1)/2 || i-j==(n-1)/2) {
                    System.out.print("*");
                } else if(j<=(n-1)/2) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
