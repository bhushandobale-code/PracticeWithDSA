package Ef_Else;

import java.util.Scanner;

public class TotalSurfaceAreaOfCuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of cuboid:");
        double l = sc.nextDouble();
        System.out.print("Enter the Breadth of cuboid:");
        double b = sc.nextDouble();
        System.out.print("Enter the Height of cuboid:");
        double h = sc.nextDouble();
        if (l > 0 && b > 0 && h > 0) {
            double tot = 2 * ((l * b) + (b * h) + (h * l));


            System.out.print("Total Surface Area of cuboid:" + tot);

        }else System.out.println("Error... Invalid Input! Dimensions must be greater than 0.");
    }
}