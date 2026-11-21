//Display AP 2,5,7 upto n term
package loops;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //logic 1 using nth term formula
//        System.out.print("Enter the number:");
//        int n = sc.nextInt();
//        for(int i=2;i<=3*n-1;i+=3){
//            System.out.println(i);
//        }
        //logic 2 using first term and common difference
        System.out.print("Enter First term:");
        int a =sc.nextInt();
        System.out.print("Enter common Difference:");
        int d =sc.nextInt();
        System.out.print("Enter Number of Terms (n):");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a+=d;
        }
    }
}
