// package Day5;

// public class task7 {
//     public static void main(String[] args) {
        
//         int size = 10; 
//        int[] evenNumbers = new int[size];
//         for (int i = 0; i < size; i++) {
//             evenNumbers[i] = i * 2;
//         }
//         System.out.println("Even numbers from 0 to 20:");
//         for (int num : evenNumbers) {
//             System.out.print(num + " ");
//         }
       
//     }
// }

package Day5;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt(); 
       int[] evenNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            evenNumbers[i] = i * 2;
        }
        System.out.println("Even numbers from 0 to 20:");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
        sc.close();
    } 
}
