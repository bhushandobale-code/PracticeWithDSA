package loops;

public class Table17 {
    public static void main(String[] args) {
        int i;

        //logic 1
//        for(i=17;i<=170;i=i+17){
//            System.out.print(i+" ");
//        }

        //logic2
//        for(i=1;i<=10;i=i++){
//            if(i%17==0){
//            System.out.print(i+" ");
//        }
//        }
        //logic 3
        for(i=1;i<=170;i++){
            if(i%17!=0 && i!=0){
                continue;
            }
            System.out.print(i+" ");

        }

    }
}
