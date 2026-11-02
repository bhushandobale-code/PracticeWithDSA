package Ef_Else;

import java.util.Scanner;

public class IdentifyNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number:");
         int n = sc.nextInt();
         if(n > 0)
         {
             System.out.println("The number is positive");

         } else if (n == 0) {
             System.out.println("The nuber is zero");


         }else {
             System.out.println("The number is Negative");
    }

    }
}
