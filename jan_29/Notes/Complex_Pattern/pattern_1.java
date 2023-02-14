// *         
//  *        
//   *       
//    *      
//     *     
//      *    
//       *   
//        *  
//         * 
//          *
package jan_29.Notes.Complex_Pattern;
import java.util.*;
public class pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                if(i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
