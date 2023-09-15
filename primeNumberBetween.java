public class primeNumberBetween {

    public static void main(String[] args){
        prime(5,100);
    }
    public static void  prime(int num1,int num2)
    {
        for(;num1<=num2;num1++)
        {
            boolean isprime=true;
            for(int i=2;i<=num1/2;i++)
            {
                if(num1%i==0){
                   isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.println(num1);
            }
        }
    }
}
