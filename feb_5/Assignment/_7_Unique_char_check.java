package feb_5.Assignment;

public class _7_Unique_char_check {
    public static void main(String[] args) {
        boolean flag = true;
        String s = "Hey I am NG";
        int alpha[] = new int[26];
        for(char ch : s.toCharArray()) {
            if(ch >= 65 && ch <= 90) {
                if(alpha[ch - 65] > 0) {
                    flag = false;
                    break;
                }
                alpha[ch - 65]++;
            }
            else if(ch >= 97 && ch <= 122) {
                if(alpha[ch - 97] > 0) {
                    flag = false;
                    break;
                }
                alpha[ch - 97]++;
            }
        }
        if(flag == true)
            System.out.println("String contains all unique characters");
        else
            System.out.println("String contains duplicate characters");
    }
}
