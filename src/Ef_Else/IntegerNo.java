package Ef_Else;

import java.util.Scanner;

public class IntegerNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
         double n = sc.nextDouble();
         int x = (int)n ;
         if( n-x == 0) System.out.println("Is a Integer");
         else System.out.println("Not a Integer");


    }
}