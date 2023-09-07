public class Centimeters {

    public static void main(String[] args){
        double centimeter = convertToCentimeters(15);
        double centimeters= convertToCentimeters(4,6);

        System.out.println(centimeter);
        System.out.println(centimeters);
    }
    public static double convertToCentimeters(int inch){
        double tocentimeter = inch * 2.54;
        return tocentimeter;
    }

    public static double convertToCentimeters(int feet , int inch){
        int feetToInch=(feet *12) +inch;
        double inchToCenti=convertToCentimeters(feetToInch);
        return inchToCenti;
    }
}
