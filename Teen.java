public class Teen {

    public static void main(String[] args){

        //test 1
        if(hasTeen(14,55,96)){
            System.out.println("One of the parameter has a value ranging btw 13 and 19 and is a teen");
        }else {
            System.out.println("None of the parameter have teen value");
        }

        //test 2
        if(hasTeen(20,55,96)){
            System.out.println("One of the parameter has a value ranging btw 13 and 19 and is a teen");
        }else {
            System.out.println("None of the parameter have teen value");
        }
    }
    public static boolean hasTeen(int num1, int num2,int num3){
        if((num1>=13 && num1<=19) ||  (num2>=13 && num2<=19) || (num3>=13 && num3<=19) ){

            return true;
        }else {
            return false;
        }
    }
}
