//Check Divisible by 5
package Ef_Else;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        if(n%5 == 0) System.out.print("Number is divisible by 5");
        else System.out.println("Number is not divisible by 5");
    }
}
