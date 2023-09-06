public class LeapYear {

        public static void main(String[] args){
            Year(2023);
            Year(2000);
        }

    public static void Year(int year){
        if( (year%400 == 0) || (year%100 != 0) && (year%4 == 0)){
            System.out.println(year + " is a leap year ");
        }else{
            System.out.println(year+ " is not a leap year");
        }
    }
}
