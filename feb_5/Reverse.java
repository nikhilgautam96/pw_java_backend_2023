package feb_5;
public class Reverse {
    public static void main(String[] args) {
        // String str1 = "pwjava";
        // String str2 = "";
        // for(int i = str1.length()-1 ; i>=0; i--) {
        //     str2 = str2 + str1.charAt(i);
        // }
        // System.out.println("Before Reversing " + str1);          // pwjava
        // System.out.println("After Reversing " +str2);            // avajwp


        // String str1 = "pwskill java";
        // String str2 = "";
        // String sarr[] = str1.split(" ");
        // for(int i = sarr.length-1 ; i>=0; i--) {
        //     str2 = str2 + sarr[i] + " ";
        // }
        // System.out.println("Before Reversing: " + str1);         // pwskill java
        // System.out.println("After Reversing: " +str2);           // java pwskill


        // String str1 = "pwskill java";
        // String str2 = "";
        // for(int i = str1.length()-1 ; i>=0; i--) {
        //     str2 = str2 + str1.charAt(i);
        // }
        // System.out.println("Before Reversing: " + str1);         // pwskill java
        // System.out.println("After Reversing: " +str2);           // avaj llikswp


        String str1 = "pwskill java";
        String str2 = "";
        String sarr[] = str1.split(" ");
        for(String elem :sarr) {
            for(int i = elem.length()-1 ; i>=0; i--) {
                str2 = str2 + elem.charAt(i);
            }
            str2 = str2+" ";
        }
        System.out.println("Before Reversing: " + str1);            // pwskill java
        System.out.println("After Reversing: " +str2);              // llikswp avaj
        
    }
}
