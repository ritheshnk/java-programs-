public class positiveOrnegative {

    public static void main(String[] args)
    {
        int n=5;
        checkNum(n);
    }

    public static void checkNum(int n){
        if(n>0){
            System.out.println("The number is Positve");
        }else if(n<0){
            System.out.println("The number is negative");
        }else {
            System.out.println("The number is zero");
        }
    }

}

