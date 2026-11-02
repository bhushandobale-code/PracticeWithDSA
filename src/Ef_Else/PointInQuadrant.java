package Ef_Else;

import java.util.Scanner;

public class PointInQuadrant {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter point (x,y):");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        if (x>0 && y>0) System.out.print("point lies in First quadrant.........");
        else if(x<0 && y>0) System.out.print("point lies in Second quadrant.........");
        else if(x<0 && y<0) System.out.print("point lies in third quadrant.........");
        else if(x>0 && y<0) System.out.println("point lies in fourth quadrant...........");



    }
}
