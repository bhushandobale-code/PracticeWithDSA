package ternaryOprator;

import java.util.Scanner;

public class LeafYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the year:");
        int n = sc.nextInt();
        String result = ((n%4 == 0 )&& (n%100 != 0) || (n%400 == 0))? "leaf Year" : "not leaf year";
        System.out.println(result);


    }
}
