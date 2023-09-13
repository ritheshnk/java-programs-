public class weekDay {
    public static void main(String[] args){
        int day=0;
        System.out.println("I love "+ printOfWeek(day));
    }
    public static String printOfWeek(int day){
        return switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednerday";
            case 4 -> "Thurday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid";
        };
    }
}
