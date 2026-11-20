//print all even number from 1 to 100
package loops;

import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n =sc.nextInt();
        int i;
        //logic 1 for + if condition
//        for ( i=1;i<=n;i++){
//            if(i%2==0){
//            System.out.print(i+" ");
//        }
//        }

        //logic 2 increment by 2
//        for(i=2;i<=n;i=i+2){
//            System.out.print(i+" ");
//        }

        // logic 3 using if condition with continue
//        for(i=1;i<=n;i++){
//            if(i%2 != 0){
//                continue;
//            }
//            System.out.print(i+" ");
//        }
        //logic 4 using ternary operator
//        for(i=1;i<=n;i++){
//            System.out.print(i%2 ==0 ? i+" " : " ");
//        }
        //logic 5 using different starting point
//        for(i=0;i<=n;i++){
//            if(i%2 ==0 && i != 0){
//                System.out.print(i+" ");
//            }
//        }

        //logic 6 using boolean value

        for(i=1;i<=n;i++){
            boolean even =(i%2==0);
         if(even){
             System.out.print(i+" ");
         }
        }
    }

}
