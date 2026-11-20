package loops;
// input me jo bhi no dale usaka table print hoga

import java.util.Scanner;

public class AnyNumberTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int i;
        for(i=1;i<=10;i++){
            System.out.print(i*n+" ");
        }
    }
}

