// import java.util.*;
// public class revers {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         int rev=0;
        
//         int f=num/100;
//         int m=(num%100)/10;
//         int l=num%10;
//         rev=l*100+m*10 +f;
//         System.out.println("reverse no:"+rev);
//     }
    
// }

import java.util.*;
class revers
{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
        if(num==0)
        {
            System.out.println("Number is Zero");
        }
        else
        {
            if(num%2==0)
            {
             System.out.println("Number is EVEN");
            }
            else
            {
             System.out.println("Number is ODD");
            }
        }
    }
}