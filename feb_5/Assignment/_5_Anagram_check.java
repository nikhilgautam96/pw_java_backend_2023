package feb_5.Assignment;
public class _5_Anagram_check {
    public static void main(String[] args) {
        // String str1 = "School Master".toLowerCase();
        // String str2 = "The Classroom Java".toLowerCase();
        String str1 = "keep".toLowerCase();
        String str2 = "peek".toLowerCase();
        boolean flag = true;
        int alpha[] = new int[256];
        for(char ch : str1.toCharArray()) {
            alpha[ch]++;
        }
        for(char ch : str2.toCharArray()) {
            alpha[ch]--;
        }
        for(int i = 0; i<alpha.length; i++) {
            if(alpha[i] != 0) {
                flag = false;
                break;
            }
        }
        if(flag == true) {
            System.out.println("It's an Anagram");
        }
        else {
            System.out.println("Its not an Anagram");
        }
    }
}
