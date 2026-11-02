package Ef_Else;

import java.util.Scanner;

public class Divisibility5_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        //This code for and condition
//        if(n%5 == n%3){
//            System.out.println("The number is divisible by 5 & 3 ....");
//        }else {
//            System.out.println("The number is not divisible by 5 & 3....");
//              }


        //This code for or condition
     if(n%5 == 0 || n%3 == 0) System.out.print("Number is divisible by 5 or 3 ........");
     else System.out.println("number is not divisible by 5 & 3 ............");
       }

    }

