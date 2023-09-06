public class Equalsum {
    public static void main(String[] args){
        hasEqualSum(1,1,1);
        hasEqualSum(1,2,3);

        if(hasEqualSum(1,1,1)){
            System.out.println("the sum of 2 parameter is equal to third ");
        }else {
            System.out.println("the sum of 2 parameter is not equal to third ");
        }

        if(hasEqualSum(1,2,3)){
            System.out.println("the sum of 2 parameter is equal to third ");
        }else {
            System.out.println("the sum of 2 parameter is not equal to third ");
        }
    }
    public static boolean hasEqualSum(int num1,int num2,int num3){
        int sum=0;
        sum=num1+num2;

        if(sum == num3){
            return true;
        }else{
            return false;
        }
    }
}
