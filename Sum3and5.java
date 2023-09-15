public class Sum3and5 {

    public static void main(String[] args){
        int count=0,i,sum=0,j;
        for( i=1 ;i<=1000;i++)
        {
            if(((i%3)==0) &&((i%5==0)) && count<5 ){
                System.out.println(i);
                ++count;
                sum+=i;
            }
        }
        System.out.println(sum);

    }
}
