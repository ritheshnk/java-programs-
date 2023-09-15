public class LeapYear {

    public static void main(String[] args){
        System.out.println(leap(2022));
        System.out.println(leap(-5));
        System.out.println(leap(2016));
    }
    public static boolean leap(int year)
    {
        if(year>=1 && year<=9999){
            if((year%4==0) && (year%100!=0) || (year%400==0)){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }
}
