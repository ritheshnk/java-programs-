public class sumOfOdd {
    public static void main(String[] args){
        int start=3;
        int end=100;
        int sum=0;

        for(;start<=end;start++){
            if((start % 2) !=0){
                System.out.print(start+" ");
                sum+=start;
            }
        }
        System.out.println("\nSum is "+sum);
    }
}
