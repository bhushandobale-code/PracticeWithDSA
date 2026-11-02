//Find Largest of Two Numbers
package Ef_Else;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the first number:");
      int x = sc.nextInt();
      System.out.println("Enter the second number");
      int y = sc.nextInt();
      if(x>y)
      {
          System.out.println("The Largest no is:" + x);
      }else{
          System.out.println("The Largest no is:" + y);
      }


    }

}
