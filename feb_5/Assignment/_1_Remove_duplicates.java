package feb_5.Assignment;
public class _1_Remove_duplicates {
    public static void main(String[] args) {
        String s = "HeyThere".toUpperCase();
        String s1 = "";
        int alpha[] = new int[26];
        for(char ch : s.toCharArray()) {
            if(alpha[ch - 65] == 0) {
                s1 += ch;
                alpha[ch - 65]++;
            }
        }
        System.out.println(s1);
    }
}
