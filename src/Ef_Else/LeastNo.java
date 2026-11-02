package Ef_Else;

import java.util.Scanner;

public class LeastNo {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a:");
        int a = sc.nextInt();
        System.out.print("enter the value of b:");
        int b = sc.nextInt();
        System.out.print("enter the value of c:");
        int c = sc.nextInt();
        //use this logic 1 if else
        if (a < b && a < c) System.out.println("least number is" + a);
        else if (b < a && b < c) System.out.println("least number is:" + b);
        else if (c < a && c < b) System.out.println("least number is:" + c);

        //use this logic2 nested if
        if (a < b) {
            if (a < c) System.out.println("least number is" + a);
            else System.out.println("least number is" + c);
        } else if (b<a) {
        if (b < c) System.out.println("least number is" + b);
        else System.out.println("least number is" + c);

    }
    }
}
