package Ef_Else;

import java.sql.SQLOutput;
import java.util.Scanner;

public class profitLossProb {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Selling Price:");
        int x = sc.nextInt();
        System.out.println("Enter the Cost Price:");
        int y = sc.nextInt();
         if (x > y)
         {
             int z = x - y;
             double per = (z * 100)/ y;
             System.out.println("profit of Rs.=" + z);
             System.out.println("Profit Percentage:"+ per+"%");

         }else if(y>x)
         {
             int z = y - x ;
             double per = (z * 100) / y;
             System.out.println("Loss of Rs."+ z);
             System.out.println("Loss Percentage:"+ per+"%");
         }else System.out.println("No Profit No Loss");
    }
}
