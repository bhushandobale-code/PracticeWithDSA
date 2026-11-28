//program for print the ASSCI value
package loops;


import java.util.Scanner;

public class Alphabetsusingforloop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // use this logic for Alphabets A to Z
        for(int i=65;i<=90;i++){
            System.out.print((char)i+" ");

        }
        System.out.println();
        // for lower case
        for (int j=97;j<=122;j++){
            System.out.print((char)j+" ");
        }
        System.out.println();
        //for number
        for (int i=48;i<=57;i++){
            System.out.print((char)i+"");
        }
        System.out.println();
     //for special symbol
        for(int i=33;i<=47;i++){
            System.out.print((char)i+" ");
        }
        System.out.println();
     //for special symbol
     for(int i=58;i<=64;i++){
         System.out.print((char)i+" ");
     }
        System.out.println();
     //for Brackets aur symbols ([, \, ], ^_, `)
        for(int i=91;i<=96;i++){
            System.out.print((char)i+" ");
        }
        System.out.println();
        //for 123 se 126: Curly braces aur tilde ({, |, }, ~).
        for(int i=123;i<=126;i++){
            System.out.print((char)i+" ");
        }
    }
}
