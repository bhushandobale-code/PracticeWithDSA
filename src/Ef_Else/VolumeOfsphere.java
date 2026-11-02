package Ef_Else;

import java.util.Scanner;

public class VolumeOfsphere {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius");
        double r = sc.nextDouble();
        if (r<=0){
            System.out.println("Error..radius is not zero or less than zero.....");
        }else {
            double v = ((double) 4/3 ) *3.14159*r*r*r;
            System.out.println("Volumn of a Sphere is ="+v);
        }
    }
}
