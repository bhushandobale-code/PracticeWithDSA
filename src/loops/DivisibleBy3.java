package loops;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int i;

        //logic 1
//        for(i=1;i<=n;i++){
//            if(i%3==0) System.out.print(i+"  ");
//
//    }

        //logic 2
//        for(i=3;i<=n;i=i+3){
//            System.out.print(i+" ");
//        }

        //logic 3 using continue statement

        for(i=1;i<=n;i++){
            if(i%3!=0 && i!=0){
                continue;
            }
            System.out.print(i+" ");
        }
        //logic 4 ye logic  3 se divisible no chodake baki ke no print karane ke liye hai
//        for(i=1;i<=n;i++){
//            if(i%3==0 && i!=0){
//                continue;
//
//            }
//            System.out.print(i+" ");
//
//        }



}
}
