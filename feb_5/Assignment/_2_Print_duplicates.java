package feb_5.Assignment;
public class _2_Print_duplicates {
    public static void main(String[] args) {
        String s = "HeyThereIamHereOnTheMoon".toUpperCase();
        String s1 = "";
        int alpha[] = new int[26];
        for(char ch : s.toCharArray()) {
            alpha[ch - 65]++;
        }
        for(int i = 0; i<alpha.length; i++) {
            if(alpha[i] > 1) {
                s1 += (char)(i + 65);
            }
        }
        System.out.println(s1);
    }
}
