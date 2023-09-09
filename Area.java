public class Area {
    public static void main(String[] args){
        System.out.println("The area of circle is "+Area(5.0));
        System.out.println("The area of circle is "+Area(20.0,10.0));

    }
    public static double Area(double radius){
        if(radius < 0){
            return -1;
        }else{
            double area=0;
            area=3.14*radius*radius;
            return area;
        }
    }

    public static double Area(double length, double breadth){
        if(length < 0 || breadth <0){
            return -1;
        }else{
            double area=0;
            area=length * breadth;
            return area;
        }
    }
}
