package Ef_Else;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Rectangle:");
        double l = sc.nextDouble();
        System.out.print("Enter the Width of Rectangle:");
        double w = sc.nextDouble();
        {
            double a = l*w;
            System.out.println("Area of Rectangle is ="+a);
        }
        //Bina if ke bhi result bilkul nikal sakta hai, aur math ke hisab se code
        // sahi kaam karega. Lekin real-world programming mein if condition ka
        // use karna isliye zaroori hota hai taaki program galat ya illogical inputs ko
        // handle kar sake (Data Validation).
       // logic using if
        if (l>0 && w>0) System.out.println("Area of Rectangle is ="+(l*w));
        else System.out.println("invalid length or width");

    }
}
