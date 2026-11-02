package Ef_Else;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        //Example of if Else

//        if (n>=0){
//
//            System.out.println(n);
//          }
//        else {
//
//            System.out.println(-n);
//
//        }

        //Example of If

        if (n < 0) {
            n = -n;
        }
        System.out.println(n);




    }
}
