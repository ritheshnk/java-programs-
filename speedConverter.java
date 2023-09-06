public class speedConverter {

    public static void main(String[] args){

        double speed=98.52;
        toMilesPerHour(speed);
        printconversion(speed);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        double miles;
        if(kilometersPerHour < 0){
            return -1;
        }else{

            miles= kilometersPerHour * 0.6213;
        }
        Math.round(miles);
        return (long) miles;
    }

    public static void printconversion(double kilometersPerHour){
        System.out.println(kilometersPerHour+" km/h = "+toMilesPerHour(kilometersPerHour) +"mi/h");
    }
}
