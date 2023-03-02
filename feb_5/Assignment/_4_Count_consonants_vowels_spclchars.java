package feb_5.Assignment;

public class _4_Count_consonants_vowels_spclchars {
    public static void main(String[] args) {
        String s = "Hey There !! , I am Here On The Moon.".toUpperCase();
        int vowels = 0, consonants = 0, specialChar = 0;
        String v = "aeiouAEIOU";
        for(char ch : s.toCharArray()) {
            if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
                if(v.indexOf(ch) >= 0) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else {
                specialChar++;
            }
        }
        System.out.println("Count of Vowels : " + vowels);
        System.out.println("Count of Consonants : " + consonants);
        System.out.println("Count of Special Characters : " + specialChar);
    }
}
