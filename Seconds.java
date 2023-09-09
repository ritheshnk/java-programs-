public class Seconds {

    public static void main(String[] args){
        takesTime(3900);
        takesTime(-3900);
    }
    public static void takesTime(int sec){
        int hour ;
        int rem;
        int min;
        int seconds;
        if(sec >= 0){
            hour = (sec/3600);
             rem=sec%3600;
             min=rem/60;
             seconds=rem%60;
            System.out.println("the in Hours Min and Sec is "+ hour+" Hr : "+min+" : Min : "+seconds+" Sec" );
        }else {
            System.out.println("Invlaid  Timeline");
        }

    }
}

/*when you div 3900 ie seconds by 3600 you will get hour
and when u take the remainder ie 300 (3900%3600) and divide
that reaminder with 60 u will get minutes. then
 when you take mod of the remainder you will get the remaining seconds
 */
