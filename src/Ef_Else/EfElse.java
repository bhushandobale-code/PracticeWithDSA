package Ef_Else;

import java.sql.SQLOutput;
import java.util.Scanner ;

public class EfElse {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print ( "Enter the Number:");
        int a = sc.nextInt();
        if (a%2 == 0) {
            System.out.println("This is Even Number");
        }else{
            System.out.println( " This is Odd Number");
        }

    }

}
