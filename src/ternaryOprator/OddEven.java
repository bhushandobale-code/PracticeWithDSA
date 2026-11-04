package ternaryOprator;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        String result = (n % 2 == 0 )? "Even" : "Odd";
        System.out.print("The number is: "+result);


    }
}
