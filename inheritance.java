
public class inheritance extends Vehicle {
    public static void main(String[] args) {
        inheritance i = new inheritance();

        i.carBrand(); // Correct method name
        System.out.println("Speed of the vehicle is " + i.speed); // Accessing speed directly
    }
}
