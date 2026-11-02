package Ef_Else;

import java.util.Scanner;

public class FourDigitsNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number:");
        int n = sc.nextInt();
        if( n>999 && n<10000) System.out.println("The number is four Digits.....");
        else System.out.println("the number is not Four Digit...");


    }
}
