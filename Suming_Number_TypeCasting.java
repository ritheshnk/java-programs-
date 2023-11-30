import java.util.Scanner;

public class Inputs {
    public static void main (String[] args){
        int sum=0;


        for(int i=0;i<5;i++){
            Scanner sc=new Scanner(System.in);
            int num= sc.nextInt();
            sum=sum+num;
        }

        System.out.println(sum);

        
        
        //Type casting fronm string to int
//        Scanner sc=new Scanner(System.in);
//        String a=sc.nextLine();
//
//        int num=Integer.parseInt(a);
//        System.out.println(a);
//
//        double b=3.25;
//        int c=(int) b;
//        System.out.println(c);
    }
}
