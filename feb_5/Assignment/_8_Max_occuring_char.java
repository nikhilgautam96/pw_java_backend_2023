package feb_5.Assignment;

public class _8_Max_occuring_char {
    public static void main(String[] args) {
        String s = "HeyThereIamHereOnTheMoon".toUpperCase();
        int alpha[] = new int[26];
        for(char ch : s.toCharArray()) {
            alpha[ch - 65]++;
        }
        int max = 0;
        char maxChar = '\0';
        for(int i = 0; i<alpha.length; i++) {
            if(alpha[i] > max) {
                max = alpha[i];
                maxChar = (char)(i + 65);
            }
        }
        System.out.println("Maximum occuring char is : " + maxChar + ", it's frequency is : " + max);
    }
}
