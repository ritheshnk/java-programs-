public class Seconds {

    public static void main(String[] args){
        takesTime(8324);
    }
    public static void takesTime(int sec){
        int hour = (sec/3600);
        int rem=sec%3600;
        int min=rem/60;
        int seconds=rem%60;

        System.out.println("the in Hours Min and Sec is "+ hour+" Hr : "+min+" : Min : "+seconds+" Sec" );

    }
}
