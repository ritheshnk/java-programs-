import java.util.Scanner;

public class fibanacii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number upto which i need series of fibanacii");
        int n=sc.nextInt();

        int n1=0,n2=1;
        int nextTerm;
        for(int i=1;i<=n;i++)
        {
            System.out.print(n1+" ");
            //
            nextTerm=n1+n2;
            n1=n2;
            n2=nextTerm;

        }
    }
}
