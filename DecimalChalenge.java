public class DecimalChalenge {

    //3.215 3.2154
    public static void main(String[] args){
        areEqual(3.125,3.1254);
        areEqual(3.142,3.635);
    }
    public static boolean areEqual(double num1,double num2){

        int var1=(int) (num1 * 1000);
        int var2=(int) (num2 * 1000);
        if(var1 == var2){
            System.out.println("the number " + num1 + " and " + num2 + " is equal upto to three decimal place");
            return true;
        }else{
            System.out.println("the number " + num1 + " and " + num2 + " is not equal upto to three decimal place");
            return false;
        }

    }
}
