package loops;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        String name = "Bhushan";
        int i;
        for(i=1; i<=n;i++){

            System.out.print(name+" ");
        }
        System.out.println(i);//this is loop breaking point
    }
}
