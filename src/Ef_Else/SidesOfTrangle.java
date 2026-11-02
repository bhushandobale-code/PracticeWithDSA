package Ef_Else;

import java.util.Scanner;

public class SidesOfTrangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int a =sc.nextInt();
        System.out.print("Enter the seconnd number:");
        int b =sc.nextInt();
        System.out.print("Enter the third number:");
        int c =sc.nextInt();

        if ((a+b > c) && (b+c > a) && (a+c > b) ) {
            System.out.print("valid sides of a tringle...... ");
        }else {
            System.out.print("Invalid sides of a triangle......");
        }


    }
}
