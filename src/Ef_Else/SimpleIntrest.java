package Ef_Else;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle");
        double p = sc.nextDouble();
        System.out.print("Enter the Rate");
        double r = sc.nextDouble();
        System.out.print("Enter the Time");
        double t = sc.nextDouble();
        if(p>0 && r>0 && t>0){

        double si = (p*r*t)/100;
        System.out.println("Simple Intrest="+si);
    }else System.out.println("invalid value! value must be greater than 0");
    }
}
