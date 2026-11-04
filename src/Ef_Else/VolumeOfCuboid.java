package Ef_Else;

import java.util.Scanner;

public class VolumeOfCuboid {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of cuboid :");
        double l = sc.nextDouble();
        System.out.print("Enter the breadth of cuboid :");
        double b = sc.nextDouble();
        System.out.print("Enter the Height of cuboid :");
        double h = sc.nextDouble();
        if (l>0 && b>0 && h>0) {

            double v = l*b*h;
            System.out.print("Volume of cuboid:"+v);
        }else System.out.print("Error!..invalid Value....value must be greater than or equal to zero");
    }
}
