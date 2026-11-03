package Ef_Else;

import java.util.Scanner;

public class SquareofANumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        double n = sc.nextDouble();
        double sq = n * n;
        System.out.println("Square of number is :"+sq);
    }
}
