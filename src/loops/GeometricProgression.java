//AP में हर बार एक fixed number Add या Subtract होता है, जबकि GP में हर बार एक fixed number से Multiply या Divide होता है।
// (Arithmetic Progression)
//2, 5, 8, 11, 14
//हर बार +3 हो रहा है।
//
//GP (Geometric Progression)
//2, 4, 8, 16, 32
//हर बार ×2 हो रहा है।
package loops;


import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First term:");
        int a=sc.nextInt();
        System.out.print("Enter Common Ratio:");
        int r =sc.nextInt();
        System.out.print("Enter the Number of term:");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            a*=r;
        }
    }
}
