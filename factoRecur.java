import java.util.Scanner;

public class factoRecur {

    public static int  fact(int n) {
    
        if(n == 0)
        {
            return 1;
        }else if(n==1)
        {
            return 1;
        }else{
            return n*fact(n-1);
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n =sc.nextInt();

        int fact=fact(n);
        System.out.println(fact);
    }
}
