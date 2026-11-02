package Ef_Else;

import java.util.Scanner;

public class gretestOfThreeInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First No:");
        int x = sc.nextInt();
        System.out.print("Enter the Second No:");
        int y= sc.nextInt();
        System.out.print("Enter the Third No:");
        int z = sc.nextInt();

        //logic no 1

//        if(x>y && y>z || z>y ) System.out.print("Greater number is:"+x);
//        else if (y>z && z>x || x>z) System.out.print("Greater number is:"+y);
//        else if (z>x && x>y || y>x)System.out.print("Greater number is:"+z);

        //logic no 2

        if(x>=y && x>=z)System.out.print("Greater number is:"+x);
        else if(y>=x && y>=z)System.out.print("Greater number is:"+y);
        else if(z>=y && z>=x)System.out.print("Greater number is:"+z);

        //logic no 3
//
//        if (x>y){
//            if(x>z) System.out.println(x);
//            else System.out.println(z);
//        }
//        if(y>x){
//            if()
//        }
    }
}
