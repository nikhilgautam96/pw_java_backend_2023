package feb_5.Assignment;
public class _6_Pangram_check {
    public static void main(String[] args) {
        boolean flag = false;
        String str = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";
        int ar[] = new int[26];
        for(int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 65 && ch <= 90)
                ar[ch - 65]++;
            else if(ch >= 97 && ch <= 122)
                ar[ch - 97]++;
        }
        for(int i = 0; i<ar.length; i++) {
            if(ar[i] == 0) {
                System.out.println("Its not pangram");
                flag = true;
            }
        }
        if(flag == false) {
            System.out.println("Its pangram");
        }
    }
}
